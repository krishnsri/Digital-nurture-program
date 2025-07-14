package com.example.demo;

public class Country {
    private String name;
    private String code;

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void displayInfo() {
        System.out.println("Country Name: " + name);
        System.out.println("Country Code: " + code);
    }
}
