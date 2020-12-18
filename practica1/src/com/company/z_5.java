package com.company;
import java.util.Scanner;
public class z_5 {
    static void Random()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = in.nextInt();
        int n2=n;
        int a=0, b=0,c=0,d=0;
        while (a==b||a==c||a==d||b==c||b==d||c==d||n2==n){n2++;
        a=n2%10;
        b=n2/10%10;
        c=n2/100%10;
        d=n2/1000%10;}
        System.out.print(n2);
    }
}
