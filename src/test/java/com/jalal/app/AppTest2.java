package com.jalal.app;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest2 {

    private HourClock h;

    @Before
    public void prepare() {
        h = new HourClock();
    }

    @Test
    public void TestCaseHours() {
        assertEquals(2 * 30, h.calculateAngle(01, 15));
        assertEquals(3 * 30, h.calculateAngle(01, 20));
        assertEquals(9 * 6, h.calculateAngle(4, 29));
        assertEquals(2 * 30, h.calculateAngle(4, 10));
        assertEquals(2 * 30 - 2 * 6, h.calculateAngle(4, 12));

    }

    @Test
    public void TestCaseHoursSupp6() {
        assertEquals(2 * 30, h.calculateAngle(6, 40));
        assertEquals(2 * 30, h.calculateAngle(7, 45));
        assertEquals(4 * 30, h.calculateAngle(11, 35));
        assertEquals(4 * 30 - 6, h.calculateAngle(11, 36));
    }

    @Test
    public void TestCaseHoursSupp12() {
        assertEquals(2 * 30, h.calculateAngle(13, 15));
        assertEquals(3 * 30, h.calculateAngle(13, 20));
        assertEquals(9 * 6, h.calculateAngle(16, 29));
        assertEquals(2 * 30, h.calculateAngle(16, 10));
        assertEquals(2 * 30 - 2 * 6, h.calculateAngle(16, 12));
        assertEquals(3 * 30,h.calculateAngle(23, 40));
        assertEquals(2 * 30,h.calculateAngle(19, 45));
        assertEquals(4 * 30, h.calculateAngle(23, 35));
        assertEquals(4 * 30 - 6, h.calculateAngle(23, 36));
    }

    @Test
    public void TestCaseHoursSuppPill() {
        assertEquals(0, h.calculateAngle(0, 00));
        assertEquals(1 * 30, h.calculateAngle(1, 00));
        assertEquals(6 * 30, h.calculateAngle(6, 00));
        assertEquals(3 * 30, h.calculateAngle(9, 00));
        assertEquals(0 * 30, h.calculateAngle(12, 00));
        assertEquals(3 * 30, h.calculateAngle(15, 00));
        assertEquals(6 * 30, h.calculateAngle(18, 00));
        assertEquals(3 * 30, h.calculateAngle(21, 00));
    }

    @Test
    public void TestCaseHoursSuppMinutes5() {
        assertEquals(15 * 6, h.calculateAngle(0, 15));
        assertEquals(2 * 30, h.calculateAngle(1, 15));
        assertEquals(3 * 30, h.calculateAngle(6, 15));
        assertEquals(6 * 30, h.calculateAngle(9, 15));
        assertEquals(3 * 30, h.calculateAngle(12, 15));
        assertEquals(0 * 30, h.calculateAngle(15, 15));
        assertEquals(3 * 30, h.calculateAngle(18, 15));
        assertEquals(6 * 30, h.calculateAngle(21, 15));
    }

}
