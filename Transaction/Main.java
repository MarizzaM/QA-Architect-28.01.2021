package com.company;

import lombok.Data;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Transaction t1 = new Transaction( 1000000);
        Transaction t2 = new Transaction( 1000000);
        Transaction t3 = new Transaction(  1000000);
        Transaction t4 = new Transaction(  10000000);

        System.out.println(Transaction.amount_count);
        System.out.println(Transaction.amount_sum);

        double count = Transaction.amount_count;
        double sum = Transaction.amount_sum;

        System.out.println(Transaction.GetAvg(sum, count));
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
    }

}
