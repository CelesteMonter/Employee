package com.example.javaform;

public class InternalEmployee extends Employee {

     String phone;
     String position;

    public InternalEmployee(String name, String lastname, String id, String phone, String position) {
        super(name, lastname, id);
        this.phone = phone;
        this.position = position;



    }

}
