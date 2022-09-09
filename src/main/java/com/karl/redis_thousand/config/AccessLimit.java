package com.karl.redis_thousand.config;

import java.lang.annotation.*;

/**
 * @author karl
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface AccessLimit {

    /**
     * 指定时间 单位：秒
     */
    int seconds() default 10;

    /**
     * 指定时间内API请求次数
     */
    int maxCount() default 5;

}

