package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 200;
        int expected = 800;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotCalculateRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
}