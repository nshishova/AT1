package ru.netology;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test

    public void showRemain(){
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(actual,expected);
    }
    @org.testng.annotations.Test

    public void enoughRemain(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual,expected);
    }

}