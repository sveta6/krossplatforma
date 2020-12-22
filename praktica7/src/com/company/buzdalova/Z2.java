package com.company.buzdalova;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.security.SecureRandom;
import java.util.ArrayList;

public class Z2 {
    public static String filename1 = "HeavyyBox.dat";
    static SecureRandom rnd = new SecureRandom();
    public static ArrayList<String> items = new ArrayList<>();
    public static void Task2() {
        String[] list = {"Ручка", "Сумка", "Тетрадь", "Компьютер", "Наушники", "Печенье"};
        for (int i = 0; i < 200; i++) { items.add(list[rnd.nextInt(list.length)]); }
        HeavyBox box = new HeavyBox(items);
        System.out.println("Коробка " + box.toString() + " весом " + box.Weight + " и "
                + HeavyBox.goods.size() + " штуками внутри");
        String filename1 = box.serializedBox();
        try { HeavyBox box_2 = deserializedBox(filename1);
            System.out.println("Коробка " + box_2.toString() + " весом " + box_2.Weight + " и "
                    + HeavyBox.goods.size() + " штуками внутри"); }
        catch (IOException | ClassNotFoundException e) { e.printStackTrace(); }
        HeavyBox.zadanie2();
    }
    public static HeavyBox deserializedBox(String filename1) throws IOException, ClassNotFoundException
    {   ObjectInputStream objectInputStream = null;
        try { objectInputStream = new ObjectInputStream(new FileInputStream(filename1)); }
        catch (IOException e) { e.printStackTrace(); }
        assert objectInputStream != null;
        return (HeavyBox) objectInputStream.readObject();
    }}
