package com.company.buzdalova;
import java.io.Serializable;

public class Cats implements Serializable {
    public int age;
    public String name;

    public Cats( String name, int age) {
        this.age = age;
        this.name = name;
    }
}