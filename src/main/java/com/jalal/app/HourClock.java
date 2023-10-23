package com.jalal.app;

public class HourClock {

    public int calculateAngle(int hours, int minutes) {
        int angle = 0;
        /*if (minutes == 0) {
            if (hours <= 6)
                angle = hours * 30;
            else if (hours > 6 && hours <= 12) {
                angle = (12 - hours) * 30;
            } else if (hours > 12 && hours <= 18) {
                angle = (hours - 12) * 30;
            }
        }
        if (hours == 0) {
            angle = minutes * 6;
        }*/

        if (hours >= 12)
            hours = hours - 12;
        if (minutes == 0)
            if (hours > 6)
                angle = 30 * (12 - hours);
            else
                angle = 30 * (hours);
        else
            angle = (minutes / 5 - hours) * 30 + (6 * (minutes % 5));

        return Math.abs(angle);
    }
}
