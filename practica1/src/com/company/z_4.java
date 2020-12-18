package com.company;
import java.util.Scanner;
public class z_4 {
    static void Random(){
        int res=1;
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = in.nextInt();
        for (int i =1; i<=n; i++){
            res= res*i;
        }
        System.out.print("факториал равен: "+res);
    }
}
