package com.accountapp;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class Testing {
    @Test
    public void testNumberOfNames(){
        Service testService = new Service();
        Account daniel = new Account("Daniel", "Mann", "AC344");
        testService.createAccount(1,daniel);
        Account marcus = new Account("Anthony", "Pilkington", "Afbhfuiow45");
        testService.createAccount(2,marcus);
        Account seb = new Account("Daniel", "Coder", "4780247bfrehj");
        testService.createAccount(3,seb);
        Account daniel2 = new Account("Daniel", "Sturridge", "AF87480");
        testService.createAccount(4,daniel2);
        assertEquals(testService.countNames("Daniel"), 3);
        assertEquals(testService.countNames("Anthony"),1);
    }
}
