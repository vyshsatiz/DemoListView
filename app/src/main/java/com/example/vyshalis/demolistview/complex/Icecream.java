package com.example.vyshalis.demolistview.complex;

/**
 * Stores information about icecream.
 */

public class Icecream {
    private String make;
    private int year;
    private int iconID;
    private String condition;

    public Icecream(String make, int year, int iconID, String condition) {
        super();
        this.make = make;
        this.year = year;
        this.iconID = iconID;
        this.condition = condition;
    }
    public String getMake() {
        return make;
    }
    public int getYear() {
        return year;
    }
    public int getIconID() {
        return iconID;
    }
    public String getCondition() {
        return condition;
    }

}
