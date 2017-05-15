package com.example.myholivia.restaurantyelp;

/**
 * Created by myholivia on 5/14/17.
 */

public class Clock {
    long startTime;
    long endTime;

    public void reset() {
        startTime = 0;
        endTime = 0;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getCurrentInterval() {
        return endTime - startTime;
    }

}
