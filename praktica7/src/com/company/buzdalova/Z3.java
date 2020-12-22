package com.company.buzdalova;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

public abstract class Z3 {
    public static void printInfo(Class<?> NameClass) {
        System.out.println(nameInfo(NameClass));
        System.out.println(packageInfo(NameClass));
        System.out.println(superClassInfo(NameClass));
        System.out.println(interfacesInfo(NameClass));
        System.out.println(fieldsInfo(NameClass));
        System.out.println(constructorsInfo(NameClass));
        System.out.println(methodsInfo(NameClass));
    }
    public static String nameInfo(Class<?> c) {
        return "Название класса: " + c.getSimpleName() + "\n";
    }

    public static String packageInfo(Class<?> c)
    { return "Название пакета: " + c.getPackage().getName() + "\n"; }

    public static String superClassInfo(Class<?> c)
    { return "Суперкласс: " + c.getSuperclass().getCanonicalName() + "\n"; }

    public static String fieldsInfo(Class<?> c) {
        StringBuilder sb = new StringBuilder("Поля:\n");
        for (Field fields : c.getDeclaredFields()) {
            sb.append(String.format("%s %s %s\n", Modifier.toString(fields.getModifiers()),
                    fields.getType().getSimpleName(), fields.getName()));
        }
        return sb.toString();
    }

    public static String interfacesInfo(Class<?> c) {
        StringBuilder sb = new StringBuilder("Реализованные интерфейсы:\n");
        Class<?>[] interfaces = c.getInterfaces();
        if (interfaces.length == 0) {
            return sb.toString() + "Интерфейсов нет\n";
        }
        for (Class<?> ClassInterfaces : c.getInterfaces()) {
            sb.append(ClassInterfaces.getSimpleName());
            sb.append("\n");
        }
        return sb.toString();
    }

    public static String constructorsInfo(Class<?> c) {
        StringBuilder sb = new StringBuilder("Конструкторы:\n");
        for (Constructor<?> constructor : c.getDeclaredConstructors()) {
            List<String> parTypeList = new ArrayList<>();
            for (Class<?> ClassCons : constructor.getParameterTypes()) {
                parTypeList.add(ClassCons.getSimpleName()); }
            sb.append(String.format("%s %s(", Modifier.toString(constructor.getModifiers()),
                    constructor.getDeclaringClass().getSimpleName()));
            sb.append(String.join(", ", parTypeList));
            sb.append(")\n");
        }return sb.toString();
    }
    public static String methodsInfo(Class<?> c) {
        StringBuilder sb = new StringBuilder("Методы:\n");
        for (Method method : c.getDeclaredMethods()) {
            List<String> parTypeList = new ArrayList<>();
                for (Class<?> ClassMethods : method.getParameterTypes()) {
                parTypeList.add(ClassMethods.getSimpleName()); }
                sb.append(String.format("%s %s %s(", Modifier.toString(method.getModifiers()),
                    method.getReturnType().getSimpleName(), method.getName()));
            sb.append(String.join(", ", parTypeList));
            sb.append(")\n");
        }return sb.toString();
    }
}
