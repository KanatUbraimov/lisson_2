package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(ageTemperature(22, -11));
        System.out.println(ageTemperature(17, 32));
        System.out.println(ageTemperature(9, -7));
        System.out.println(ageTemperature(13, 29));
        System.out.println(ageTemperature(32, 14));
        System.out.println(ageTemperature(generateRandomAge(), generateRandomTemperature()));

    }

    public static String ageTemperature(int age, int temperature) {
        if (20 <= age && age <= 45 && -20 <= temperature && temperature <= 30)
            return "Можно идти гулять";
        else if (20 >= age && 0 <= temperature && temperature <= 28)
            return "Можно идти гулять";
        else if (45 <= age && -10 <= temperature && temperature <= 25)
            return "Можно идти гулять";
        else
            return "Оставайтесь дома";
    }


    public static int generateRandomAge() {
        Random random = new Random();
        int age = random.nextInt(101);
        return age;
    }
        public static int generateRandomTemperature () {
            Random random = new Random();
            int temperature = random.nextInt(71);
            return temperature;
        }
    }