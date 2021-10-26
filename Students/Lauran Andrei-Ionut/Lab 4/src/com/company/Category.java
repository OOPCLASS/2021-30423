package com.company;

import java.util.Objects;

public class Category {
    public String name;

    public Category(String name) {
        this.name = name;
    }

    public Category() {

    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Category category)
            return category.name.equals(this.name);
        return false;
    }

}
