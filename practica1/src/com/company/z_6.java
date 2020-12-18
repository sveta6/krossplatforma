package com.company;
public class z_6 {
    static void Random() {
        int[] m=new int[12];
       m[1]=1;
       m[2]=1;
        for (int i = 3; i < 12; i++) {
        m[i]=(m[i-2])+(m[i-1]);
        }
        for (int i = 1; i < 12; i++) {
            System.out.print(i+") "+m[i]+" ");
        }
    }
}
