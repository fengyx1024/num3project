package com.shangma.aop;

import com.shangma.annotations.LogServer;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description: TODO
 * @author: fengyx
 * @date: 2022/6/1 17:44
 */
@Component
@Aspect
public class LogAspect {
    @Pointcut("@annotation(com.shangma.annotations.LogServer)")
    public void pt() {
    }

    @Before("pt()&& @annotation(logServer)")
    public void log(LogServer logServer) {

    }

}
