package com.company;

import lombok.ToString;

import javax.xml.crypto.Data;
import java.util.Date;
@ToString
public class Transaction {

    public final Date creationTime;
    public final int transactionAmount;
    public static double amount_sum = 0;
    public static double amount_count = 0;

    public Transaction(int transactionAmount) {
        this.creationTime = new Date();
        this.transactionAmount = transactionAmount;
        amount_sum += transactionAmount;
        amount_count ++;
    }

    public static double GetAvg (double amount_sum, double amount_count ){
        return amount_sum/amount_count;
    }
}
