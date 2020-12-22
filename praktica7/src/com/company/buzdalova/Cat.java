package com.company.buzdalova;

public class Cat extends Cats {
    public Cat cMum;
    public Cat cDad;

    public Cat(  String name,int age, Cat catMum, Cat catDad) {
        super(name, age);
        this.cMum = catMum;
        this.cDad = catDad;
    }

    public Cat( String name, int age ) {
        super( name, age);
    }

    public String checkParent(Cat parent) {
        if (parent != null) {
            return parent.name;
        } else { return "--"; }
    }

    public void voice() {
        System.out.printf("My name is %s, my mother is %s & my father %s \n",
                name, checkParent(cMum), checkParent(cDad));
    }
}
