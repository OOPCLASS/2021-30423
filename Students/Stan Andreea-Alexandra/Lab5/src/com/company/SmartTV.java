package com.company;

import java.util.Objects;

public class SmartTV extends Electronics{




    private double screenSize;



    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String getDescription() {
        return "The diagonal is "+  String.valueOf(screenSize)+ "inches";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SmartTV smartTV = (SmartTV) o;
        return Double.compare(smartTV.screenSize, screenSize) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), screenSize);
    }
}
