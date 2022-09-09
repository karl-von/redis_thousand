package com.karl.redis_thousand.controller;


import com.baomidou.mybatisplus.extension.api.R;
import com.karl.redis_thousand.config.AccessLimit;
import com.karl.redis_thousand.entity.User;
import com.karl.redis_thousand.service.UserService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;

import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Karl
 * @since 2022-09-08
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * 接口请求频率限制
     * 设置10秒内最多请求3次
     */
    @AccessLimit(seconds = 10, maxCount = 3)
    @GetMapping("test")
    public R<String> test() {
        return R.ok("接口请求成功");
    }

    @AccessLimit(seconds = 60, maxCount = 1000)
    @GetMapping("geUserById{id}")
    public R<User> geUserById(@PathVariable Integer id){
        User user = userService.getById(id);
        return R.ok(user);
    }
}

