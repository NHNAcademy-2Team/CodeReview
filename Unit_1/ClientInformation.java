package com.nhnacademy;

public class ClientInformation {
    private final String name;
    private final String number;

    public ClientInformation(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }
}
