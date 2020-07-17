package com.gpcoder.aop.account;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Account {
    private String owner;
    private String currency;
    private int balance;

//    public Account(String owner, String currency, int balance) {
//        this.owner = owner;
//        this.currency = currency;
//        this.balance = balance;
//    }
}
