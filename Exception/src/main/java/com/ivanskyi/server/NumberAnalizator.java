package com.ivanskyi.server;

import com.ivanskyi.exceptions.custom.NumberBiggerHundredException;
import com.ivanskyi.exceptions.custom.OddNumberException;

public class NumberAnalizator {
    Integer number;
    final int maxAllowedNumber = 100;

    public String start(String data) {
        this.number = Integer.parseInt(data);

        if (number % 2 > 0 && number < maxAllowedNumber) {
            try {
                throw new OddNumberException("Odd number");
            } catch (OddNumberException e) {
                e.printStackTrace();
            }
        } else if (number > maxAllowedNumber) {
            try {
                throw new NumberBiggerHundredException("Number bigger 100");
            } catch (NumberBiggerHundredException e) {
                e.printStackTrace();
            }
        }
        return "You wrote number : " + number;
    }
}
