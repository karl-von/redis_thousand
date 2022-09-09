package com.karl.redis_thousand.service.impl;

import com.karl.redis_thousand.entity.User;
import com.karl.redis_thousand.mapper.UserMapper;
import com.karl.redis_thousand.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Karl
 * @since 2022-09-08
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
