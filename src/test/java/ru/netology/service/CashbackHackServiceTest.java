package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.*;



public class CashbackHackServiceTest {

    @Test
    public void shouldShowRemainAmountUnder1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int expected = 100;
        int actual = service.remain(amount);

        assertEquals(expected, actual);

    }

    @Test
    public void shouldShowRemainAmountAbove1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1200;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(expected, actual);

    }

    @Test
    public void shouldShowRemainAmountEquals1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(expected, actual);

    }


}