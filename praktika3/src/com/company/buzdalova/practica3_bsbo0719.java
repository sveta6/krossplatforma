package com.company.buzdalova;
import java.util.*;
public class practica3_bsbo0719 {

    public static String first() {
        String s = "Inanov ";
        String s1 = "Ivan ";
        String s2 = "Ivanovich";
        s = s.concat(s1).concat(s2);
        System.out.println(s);
        return s;
    }

    public static String second() {
        String name = "Petya";
        int age = 27;
        String s1 = Integer.toString(age);
        String a = "im ".concat(name).concat(", im ").concat(s1).concat(" yo");
        System.out.println(a);
        return a;
    }

    public static void third() {
        String s = "i have two cats";
        String[] ss = s.split("\\s");
        for (String a : ss) {
            System.out.println(a);
        }
    }

    public static void fourth() {
        String s1 = "i have two cats!";
        System.out.println(s1);
        System.out.println(s1.replace("!", "."));
        StringBuilder s = new StringBuilder("i have two cats!");
        s.replace(7, 10, "three");
        System.out.println(s);
    }

    public static void fifth() {
        String s1 = "i have two cats";
        System.out.println(s1);
        System.out.println(s1.toUpperCase());
        System.out.println("string 1 " + s1.substring(0, 1).toUpperCase() + s1.substring(1).toLowerCase());
        String s2 = "i have three cats";
        System.out.println("Eguals of string: 1 and 2.  the 2 string is - i have three cats");
        System.out.println(s1 == s2);
    }

    public static void sixth() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a string: ");
        String s = in.nextLine();
        System.out.println("Ur string is " + s);
        String r = new StringBuffer(s).reverse().toString();
        System.out.println("Perevernytaya string is " + r);
    }

    public static void seventh() throws Exception {
        String s = null;
        Scanner in = new Scanner(System.in);
        System.out.println("enter a numbers: ");
        boolean v= false;
        ArrayList<Integer> all = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            s = in.nextLine();
            try {
                int nums = Integer.parseInt(s);
                if (s != null) {
                    all.add(nums); }
            }
            catch (Exception e) {v=true;
                System.out.println(e.getMessage());
                throw new Exception("String can not include the letters");
            }
            finally {
               if (v==true)
                    for (int j = 0; j < all.size(); j++) {
                        System.out.print(all.get(j) + " ");
                        System.out.println();}
            }
        }
    }
    public static void eighth() throws Exception {
        try {
            String s = null;
            String mm = s.toLowerCase();

        } catch (NullPointerException e) {
            System.out.println(e);
        }
        try {
            int[] m = new int[2];
            m[8] = 5;
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
        try {
            ArrayList<String> list = new ArrayList<>();
            String s1 = list.get(18);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


