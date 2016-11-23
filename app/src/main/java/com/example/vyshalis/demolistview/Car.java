package com.example.vyshalis.demolistview;

/**
 * Stores information.
 * (about cars)
 */

public class Car {
    private String make;
    private int iconID;
    private String condition;

    public Car(String make, int iconID, String condition) {
        super();
        this.make = make;

        this.condition = condition;
    }

    public String getMake() {
        return make;
    }

    public int getIconID() {
        return iconID;
    }

    public String getCondition() {
        return condition;
    }

}
