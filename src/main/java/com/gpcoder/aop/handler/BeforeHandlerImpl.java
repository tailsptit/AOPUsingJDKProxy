package com.gpcoder.aop.handler;

import java.lang.reflect.Method;

public class BeforeHandlerImpl extends BeforeHandler{
    @Override
    public void handleBefore(Object proxy, Method method, Object[] args) {
        // Provide your own cross cutting concern
        System.out.println("Handling before actual method execution");
    }
}
