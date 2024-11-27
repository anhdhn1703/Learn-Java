package org.example;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import java.util.logging.SimpleFormatter;

public class Main {
    public static void main(String[] args) {
        //Data type
//        byte a = 10;
//        short b = 2000;
//        int c = 30;
//        long d = 4000L;
//        float e = 50.6f;
//        char f = 'A';
//        double g = 70.89;
//        boolean h = true;
        //Array
//        int[] arr;
//        arr = new int[10];
//        int[] arr2 = {1, 2, 3, 4, 5};
//        arr2[2] = 10;
//        System.out.println(arr2[2]);
//        for (int j : arr2) {
//            System.out.print(j + ", ");
//        }
        //Mang 2 chieu
//        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        System.out.println(matrix[1][2]);
//        //Duyet mang 2 chieu
//        for (int[] ints : matrix) {
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//            }
//        }
        //Enum
//        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
//        System.out.println(dayOfWeek);
//        for (Season season : Season.values()) {
//            System.out.println(season + ": " + season.getDescription());
//        }
//        System.out.println("--------tra-ve-tat-ca-gia-tri-trong-enum------");
//        for (DayOfWeek day : DayOfWeek.values()) {
//            System.out.println(day);
//        }
//        System.out.println("--------tra-ve-index-trong-gia-tri-enum-------");
//        System.out.println(DayOfWeek.THURSDAY.ordinal());
//        System.out.println("--------tra-ve-enum-tuong-ung-voi-ten---------");
//        DayOfWeek day1 = DayOfWeek.valueOf("SUNDAY");
//        System.out.println(day1);
        //Format Date
        //Sử dụng lớp LocalDate, LocalTime, và DateTimeFormatter
//        LocalDate today = LocalDate.now();
//        System.out.println(today.getDayOfWeek());
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        String formattedDate = today.format(formatter);
//        System.out.println(formattedDate);
//        Date date = new Date();
//        SimpleDateFormat simpleFormatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//        System.out.println(simpleFormatter.format(date));
        //Random Number (Số ngẫu nhiên)
        //Sử dụng Math.random()
//        double random = Math.random(); //random tu 0.0 -> 1.0
//        int randomInt = (int) (random * 100); //random tu 0-99
//        System.out.println("Random Double: " + random);
//        System.out.println("Random Integer: " + randomInt);
        //Sử dụng java.util.Random
        //Hỗ trợ nhiều kiểu dữ liệu (int, long, float, double).
//        Random rand = new Random();
//        int randInt = rand.nextInt(100); //random tu 0-99
//        System.out.println("Random Integer: " + randInt);
        //Ép kiểu ngầm định (Implicit Casting)
//        int num = 100;
//        double d = num; // Tự động chuyển từ int sang double
//        System.out.println("Double: " + d); // Output: 100.0
        //Ép kiểu tường minh (Explicit Casting)
//        double d1 = 100.99;
//        int num1 = (int) d1; // Chuyển từ double sang int
//        System.out.println("Integer: " + num1); // Output: 100 (mất phần thập phân)
        //Upcasting (Ép kiểu lên)
//            Animal animal = new Dog();
//            animal.sound();
        //Downcasting (Ép kiểu xuống)
//        Animal animal = new Dog();
//        Dog dog = (Dog) animal; //Downcasting
//        dog.bark();
        //Ép kiểu chuỗi (String Conversion)
        //Sử dụng String.valueOf() hoặc toán tử + ""
//        int num = 100;
//        String str = String.valueOf(num); // "100"
//        String str2 = num + "";           // "100"
        //Sử dụng các hàm như Integer.parseInt(), Double.parseDouble()
//        String str = "123";
//        int num = Integer.parseInt(str); // 123
//        double d = Double.parseDouble("123.45"); // 123.45
        //Khi ép kiểu từ kiểu lớn hơn xuống kiểu nhỏ hơn, cần kiểm tra để tránh lỗi tràn dữ liệu
        int large = 130;
        byte small = (byte) large; // -126 (dữ liệu bị tràn)
        System.out.println("Small: " + small);
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog makes a sound");
    }
    void bark(){
        System.out.println("Dog barks");
    }
}