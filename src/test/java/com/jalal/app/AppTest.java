package com.jalal.app;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private HourClock h;

    @Before
    public void prepare() {
         h = new HourClock();
    }

    // case 03:00 => 90 degrees
    @Test
    public void TestCaseHour03() {
        int angle = h.calculateAngle(03, 0);
        assertEquals(90, angle);
    }

    // 00:30 => 180 degrees.
    @Test
    public void TestCaseMinutes03() {
        int angle = h.calculateAngle(0, 30);
        assertEquals(180, angle);
    }

    @Test
    public void TestCaseHours09() {
        int angle = h.calculateAngle(9, 0);
        assertEquals(90, angle);
    }

    @Test
    public void TestCaseHours15() {
        int angle = h.calculateAngle(15, 0);
        assertEquals(90, angle);
    }

    @Test
    public void TestCaseHours04Minutes40() {

        int angle = h.calculateAngle(4, 40);
        assertEquals(4 * 30, angle);
    }

    @Test
    public void TestCaseHours01Minutes20() {

        int angle = h.calculateAngle(1, 20);
        assertEquals(3 * 30, angle);
    }

    /*
     * 
     * // 09:00 => 90 degrees
     * 
     * // 15:00 => 90 degrees
     * 
     * 
     * // 00:00 => 0 degrees
     * // 06:00 => 0 degrees
     * // 10:00 => 0 degrees
     * // 23:00 => 0 degrees
     * // 19:00 => 0 degrees
     * 
     * // 04:40 => 0 degrees
     * 
     * }
     */

}
