package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class User {
    private Address[] addresses;

    public User(Address[] addresses) {
        this.addresses = addresses;
    }

    public void addAddress(Address address) {
        List<Address> list = new ArrayList<Address>(Arrays.asList(this.addresses));
        list.add(address);
        this.addresses = list.toArray(new Address[0]);
    }

    public Address[] getAddresses() {
        return addresses;
    }

    public void setAddresses(Address[] addresses) {
        this.addresses = addresses;
    }
}
