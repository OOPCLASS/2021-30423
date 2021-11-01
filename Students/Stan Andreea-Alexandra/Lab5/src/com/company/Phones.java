package com.company;

import java.util.Objects;

public class Phones extends Electronics {
    private double memoryCapacity;

    public double getMemoryCapacity() {
        return memoryCapacity;
    }

    public void setMemoryCapacity(double memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }

    @Override
    public String getDescription() {

        return "memory = " + String.valueOf(memoryCapacity)+ " GB";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phones phones = (Phones) o;
        return Double.compare(phones.memoryCapacity, memoryCapacity) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(memoryCapacity);
    }
}
