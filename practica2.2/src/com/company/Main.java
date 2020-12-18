package com.company;
import java.util.ArrayList;
import java.util.HashSet;
//import com.company.buzdalova_s_bsbo0719.task1.*;
//import com.company.buzdalova_s_bsbo0719.task2.*;
import com.company.buzdalova_s_bsbo0719.task3.*;
//import com.company.buzdalova_s_bsbo0719.task4.*;

public class Main {

    public static void main(String[] args) {
        //zadanie1
        //Cats tigr = new Cats.Tigers("tigr");
        //tigr.show();
        //Cats lev = new Cats.Lions("lev");
        //lev.show();
        //Cats gep = new Cats.Gepards("gep");
        //gep.show();


        //zadanie 2
        //Cats grandDad= new Cats("grandDad","","");
        //Cats grandMom= new Cats("grandMom","","");
       //Cats dad= new Cats("Dad","",grandDad.getName());
       // Cats mom= new Cats("Mom",grandMom.getName(),"");
       //Cats catdauter= new Cats("kitty dauter", mom.getName(), dad.getName());
       // Cats catson= new Cats("kitty son", mom.getName(), dad.getName());
       // grandDad.show();
       //grandMom.show();
       // dad.show();
       // mom.show();
        //catdauter.show();
       // catson.show();

        //zadanie3
      ArrayList<Cats> cats = new ArrayList<Cats>();
        for (int i=1; i<11; i++){
            cats.add(new Cats());
            System.out.println(i);
            Cats.printCats(); }

        //zadanie4
       // HashSet<Cats> catsHashSet= Cats.creatCats();
        //Cats.print(catsHashSet);
        //catsHashSet.remove(catsHashSet.toArray()[1]);
        //System.out.println();
        //Cats.print(catsHashSet);
    }
}
