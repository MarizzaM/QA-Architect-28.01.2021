package com.company;

import lombok.ToString;

import java.util.Random;
@ToString
public class MagicNumber {

    static Random r = new Random();
    public final int magic_number;
    public  int min;
    public  int max;
    public static final int lucky_number = 777;
    public static int counter;
    public static int lowest_random_number;
    public static int highest_random_number;

    public MagicNumber(int min, int max) {
        this.min = min;
        this.max = max;
        this.magic_number = r.nextInt(max - min) + min + 1;
        if (magic_number < lowest_random_number || lowest_random_number == 0) {
            lowest_random_number = magic_number;
        }
        if (magic_number > highest_random_number) {
            highest_random_number = magic_number;
        }
        if (magic_number == lucky_number) {
            counter++;
        }

    }
    //    member int number -- will never change
//    final, in-line final, static, static final:
//    what was the lowest random number created
//    what was the highest random number created
//    luck number = 777 (will never change)
//    how many times the lucky number was randomized
//    ctor (min, max)
//    create the random number and store it in member number
}
