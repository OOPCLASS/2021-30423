package com.company;

import java.util.Objects;

public class Electronics extends Product {
        private double guaranty;

    public double getGuaranty() {
        return guaranty;
    }

    public void setGuaranty(double guaranty) {
        this.guaranty = guaranty;
    }

    @Override
    public String getDescription() {
        return String.valueOf(guaranty);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Electronics that = (Electronics) o;
        return Double.compare(that.guaranty, guaranty) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(guaranty);
    }
}
