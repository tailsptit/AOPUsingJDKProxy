package com.gpcoder.aop;

import com.gpcoder.aop.account.Account;
import com.gpcoder.aop.account.AccountService;
import com.gpcoder.aop.account.AccountServiceImpl;
import com.gpcoder.aop.handler.AbstractHandler;
import com.gpcoder.aop.handler.AfterHandlerImpl;
import com.gpcoder.aop.handler.BeforeHandlerImpl;
import com.gpcoder.aop.handler.ProxyFactory;

import java.util.ArrayList;
import java.util.List;

public class AspectOrientedProgrammingInJdkExample {
    public static void main(String[] args) {

        List<AbstractHandler> handlers = new ArrayList<>();
        handlers.add(new BeforeHandlerImpl());
        handlers.add(new AfterHandlerImpl());
        AccountService proxy = (AccountService) ProxyFactory.getProxy(new AccountServiceImpl(), handlers);

        Account account = new Account("gpcoder", "USD", 100);
        proxy.addAccount(account);
        proxy.getSize();
        proxy.removeAccount(account);
        proxy.getSize();
    }
}
