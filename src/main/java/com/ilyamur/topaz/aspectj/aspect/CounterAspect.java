package com.ilyamur.topaz.aspectj.aspect;

import com.ilyamur.topaz.aspectj.UserGetNameCounter;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CounterAspect {

    @Pointcut("execution(* com.ilyamur.topaz.aspectj.entity.User.getName(..))")
    public void pointcutUserGetName() {
    }

    @AfterReturning("pointcutUserGetName()")
    public void countEventAccessedByName() {
        UserGetNameCounter.INSTANCE.inc();
    }
}
