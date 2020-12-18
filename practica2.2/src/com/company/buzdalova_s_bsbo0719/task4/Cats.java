package com.company.buzdalova_s_bsbo0719.task4;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class Cats {
    public static HashSet<Cats> creatCats(){
        HashSet<Cats> cats= new HashSet();
        for(int i=1; i<4; ++i){
            cats.add(new Cats()); }
        return cats;
    }
    public static void print (Set<Cats> cats){
        Iterator var1= cats.iterator();
        while(var1.hasNext()){
            Cats cat =(Cats)var1.next();
            System.out.println(cat);
        }

    }
}
