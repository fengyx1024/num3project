package com.shangma.annotations;

import com.shangma.enums.LogType;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

/**
 * @description: TODO
 * @author: fengyx
 * @date: 2022/6/1 17:27
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogServer {

    LogType type() ;
}
