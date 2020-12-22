package com.company.buzdalova;
import java.util.function.Supplier;

public class Z6 {
    public static void lambda() {
        Supplier<Integer> supplier = () -> ((int) (Math.random() * 10));
        System.out.println("Рандомное число от 1 до 10: " + supplier.get());
    }
}
