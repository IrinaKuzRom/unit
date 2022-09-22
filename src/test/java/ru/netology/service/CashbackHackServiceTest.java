package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testOnNull() {
        CashbackHackService cashback=new CashbackHackService();
        int amount=1000;
        int actual=cashback.remain(amount);
        int expected=1000;
        assertEquals(actual,expected);
    }
    @Test
    public void testOnHundred() {
        CashbackHackService cashback=new CashbackHackService();
        int amount=900;
        int actual=cashback.remain(amount);
        int expected=100;
        assertEquals(actual,expected);
    }
    @Test
    public void testOnZero() {
        CashbackHackService cashback=new CashbackHackService();
        int amount=0;
        int actual=cashback.remain(amount);
        int expected=1000;
        assertEquals(actual,expected);
    }
    @Test
    public void testOnTwo() {
        CashbackHackService cashback=new CashbackHackService();
        int amount=2500;
        int actual=cashback.remain(amount);
        int expected=500;
        assertEquals(actual,expected);
    }
}