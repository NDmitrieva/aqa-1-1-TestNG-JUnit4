package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 200;
        int expected = 800;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldNotCalculateRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
}