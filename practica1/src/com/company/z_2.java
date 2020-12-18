package com.company;
import java.util.Scanner;
public class z_2 {
    static void Random(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int  mounth= in.nextInt();
        if (mounth==1|| mounth==2|| mounth==12){System.out.print("Winter");}
        if (mounth==3|| mounth==4|| mounth==5) {System.out.print( "spring" );}
        if (mounth==6||mounth==7|| mounth==8){ System.out.print("summer");}
        if (mounth==9||mounth<=10|| mounth==11){ System.out.print("autumm");}
        if (mounth<=0||mounth>=13){System.out.print("Error");}

    }
}
