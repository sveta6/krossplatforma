package com.company.buzdalova;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public  class Z1{
    public static void Task1() {
        String filename = "CatsFamily.dat";
        ArrayList<Cat> CatsList = new ArrayList<>();
        Cat Mum = new Cat(  "Mum",4 );
        Cat Dad = new Cat( "Dad", 5);
        Cat Dot = new Cat(  "Kitty ",2, Mum, Dad);
        CatsList.add(Mum);
        CatsList.add(Dad);
        CatsList.add(Dot);
        // сериализация в новый список
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(CatsList);
            System.out.println("Сериализация прошла успешно");
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + " Сериализация не выполнилась");
        }
        // десериализация в новый список
        ArrayList<Cat> newCatsList = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            newCatsList = (ArrayList<Cat>) ois.readObject();
            System.out.println("Десириализация в новый список прошла успешно"); }
        catch (Exception ex) {
            System.out.println(ex.getMessage() + " Десериализация не выполнилась"); }
        for (Cat c : newCatsList) c.voice();
    }}
