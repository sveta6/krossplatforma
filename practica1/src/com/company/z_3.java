package com.company;
import java.util.Scanner;
public class z_3 {
    static void Random(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = in.nextInt();
        int c=0;
        while (n%2==0){n/=2; c++; }
        if (n==1) {System.out.print( "YES YES YES "+ " соответствует степени "+c );}
        else {System.out.print( "no no no " );}
    }
}
