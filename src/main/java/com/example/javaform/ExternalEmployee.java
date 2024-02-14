package com.example.javaform;

public class ExternalEmployee extends Employee{

    String company;

    public ExternalEmployee(String name, String lastname, String id, String company) {
        super(name, lastname, id);
        this.company = company;

    }
}
