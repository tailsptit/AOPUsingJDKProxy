package com.gpcoder.aop.handler;

import java.lang.reflect.Method;

public class AfterHandlerImpl extends AfterHandler{
    @Override
    public void handleAfter(Object proxy, Method method, Object[] args) {
        // Provide your own cross cutting concern
        System.out.println("Handling after actual method execution");
        System.out.println("---");
    }
}
