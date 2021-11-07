package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("BMW");
        createObject("Mercedes");
        createObject("Toyota");


    }
    public static String createObject(String className) {
        String cars = className;
        switch (cars){

        case "BMW":
        BMW bmw = new BMW("Bmw M8 compitition", "Dark Green", 700, 4.4);
        bmw.print();
        System.out.println("________________________");
        break;

        case "Mercedes":
        Mercedes mercedes = new Mercedes("Mercedes e63 AMG", "Gray", 603, 2021);
        mercedes.print();
            System.out.println("________________________");
        break;

        case "Toyota":
        Toyota toyota = new Toyota("Toyota SUPRA", "White", 999, "2 JZ");
        toyota.print();
    }
    return cars;
    }
}
