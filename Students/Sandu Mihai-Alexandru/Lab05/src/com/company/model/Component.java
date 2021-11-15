package com.company.model;

import java.util.Objects;

public class Component extends Product{
    private String whatFor;
    private String typeOf;

    public Component(String whatFor, String typeOf) {
        this.whatFor = whatFor;
        this.typeOf = typeOf;
    }

    public Component(double frequency, int nrOfCores, String series, int technology) {
        super();
    }

    public String getWhatFor() {
        return whatFor;
    }

    public void setWhatFor(String whatFor) {
        this.whatFor = whatFor;
    }

    public String getTypeOf() {
        return typeOf;
    }

    public void setTypeOf(String typeOf) {
        this.typeOf = typeOf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Component component = (Component) o;
        return Objects.equals(whatFor, component.whatFor) && Objects.equals(typeOf, component.typeOf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(whatFor, typeOf);
    }

    @Override
    public String getDescription() {
        return this.whatFor + this.typeOf;
    }
}
