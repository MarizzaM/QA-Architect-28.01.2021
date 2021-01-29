package com.company;

public class Main {

    public static void main(String[] args) {

        MagicNumber mn1 = new MagicNumber(1,1000);
        MagicNumber mn2 = new MagicNumber(1,1000);
        MagicNumber mn3 = new MagicNumber(1,1000);
        MagicNumber mn4 = new MagicNumber(1,1000);
        MagicNumber mn5 = new MagicNumber(1,1000);
        MagicNumber mn6 = new MagicNumber(1,1000);
        MagicNumber mn7 = new MagicNumber(1,1000);

        System.out.println(String.format("%d times the lucky number was randomized",MagicNumber.counter ));
        System.out.println(String.format("%d - the highest random number", MagicNumber.highest_random_number));
        System.out.println(String.format("%d - the lowest random number", MagicNumber.lowest_random_number));
    }
}
