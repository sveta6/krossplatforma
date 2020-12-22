package com.company.buzdalova;
import java.io.*;
import java.util.ArrayList;

public class HeavyBox implements Serializable {

    public int Weight = 0;
    public static ArrayList<String> goods = new ArrayList<>();

    public String serializedBox() {
        try {
            ObjectOutputStream objectOutputStream =
                    new ObjectOutputStream(new FileOutputStream(Z2.filename1));
            objectOutputStream.writeObject(this);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Z2.filename1;
    }
    public HeavyBox(ArrayList<String> goods) {
        HeavyBox.goods.addAll(goods);
        goods.forEach(x -> this.Weight += 5);
    }

    public static void zadanie2() {
        //Сериализация содержимого последней заполненной коробки
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(Z2.filename1));
            oos.writeObject(Z2.items);
            System.out.println("Сериализация прошла успешно");
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + " Сериализация не выполнилась");
        }
        // десериализация в новый список
        ArrayList<String> newGoodsList = new ArrayList<>();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(Z2.filename1));
            newGoodsList = (ArrayList<String>) ois.readObject();

            System.out.println("Десириализация в новый список прошла успешно");
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + " Десериализация не выполнилась");
        }
        for (String s : newGoodsList) {
            System.out.println(s);
        }
    }
}
