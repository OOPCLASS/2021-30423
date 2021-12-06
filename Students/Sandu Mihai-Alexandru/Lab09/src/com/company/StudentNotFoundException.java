package com.company;

public class StudentNotFoundException extends RuntimeException {
    enum ThirdPartySystem {
        LIBRARY, UNIVERSITY, TOWN_HALL
    }

    private ThirdPartySystem thirdPartySystem;

    public StudentNotFoundException(String message, ThirdPartySystem thirdPartySystem) {
        super(message); //de intrebat dc e aici super
        this.thirdPartySystem = thirdPartySystem;
    }

    public ThirdPartySystem getThirdPartySystem() {
        return thirdPartySystem;
    }

    public void setThirdPartySystem(ThirdPartySystem thirdPartySystem) {
        this.thirdPartySystem = thirdPartySystem;
    }
}
