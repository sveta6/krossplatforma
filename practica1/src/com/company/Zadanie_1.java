package com.company;
public class Zadanie_1 {static void Random() {
    double [] arr=  new double[4];
    double all=0;
    double mid=0;
    for (int i=0; i < arr.length; i++) {
        arr[i] =((Math.random()*100));
        System.out.println(arr[i]);
    }
    double max=arr[0];
    double min=arr[0];
    for (int i=0; i<arr.length; i++) {
        if (arr[i] > max)
            max = arr[i];
        if (min > arr[i])
        {min= arr[i];}
        all+=arr[i]; }
    all /= arr.length;
    System.out.println("максимальное знчение "+ max);
    System.out.println("минимальное значение "+ min);
    System.out.println("среднее значение "+ all);
}
}
