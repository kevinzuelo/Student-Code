package com.techelevator;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // BigDecimal
        BigDecimal cost = new BigDecimal("3.5");
        BigDecimal discount = new BigDecimal("0.5");

        BigDecimal finalCost = cost.subtract(discount);
        System.out.println(finalCost);


        // LocalDate
        LocalDate dueDate = LocalDate.of(2022, 5, 27);
        LocalDate submitDate = LocalDate.parse("2022-05-27");
        LocalDate postSubmission = submitDate.plusDays(7);



    }
}
