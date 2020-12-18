package com.company.buzdalova_s_bsbo0719.task2;

public class Cats extends Cat{
    public String nameMom;
    public String nameDad;
    public Cats(String name, String nameMom, String nameDad){
        super(name);
        this.nameMom= nameMom;
        this.nameDad= nameDad;
    }
    public void show() {
        super.show();
        System.out.println(this.nameMom);
        System.out.println(this.nameDad);
    }
}
