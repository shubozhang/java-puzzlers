package com.puzzlers.chap04.exceptionalpuzzlers;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by k26511 on 11/16/2016.
 */
public class TaxCalculator {

    public static final BigDecimal[][] oldRate = new BigDecimal[][] {
            {new BigDecimal("0"), new BigDecimal("18550"), new BigDecimal("0.1")},
            {new BigDecimal("18550"), new BigDecimal("75300"), new BigDecimal("0.15")},
            {new BigDecimal("75300"), new BigDecimal("151900"), new BigDecimal("0.25")},
            {new BigDecimal("151900"), new BigDecimal("231450"), new BigDecimal("0.28")},
            {new BigDecimal("231450"), new BigDecimal("413350"), new BigDecimal("0.33")},
            {new BigDecimal("413350"), new BigDecimal("466950"), new BigDecimal("0.35")},
            {new BigDecimal("466950"), null, new BigDecimal("0.396")}
    };
    public static final BigDecimal[][] newRate = new BigDecimal[][] {
            {new BigDecimal("0"), new BigDecimal("75000"), new BigDecimal("0.12")},
            {new BigDecimal("75000"), new BigDecimal("225000"), new BigDecimal("0.25")},
            {new BigDecimal("225000"), null, new BigDecimal("0.33")},
    };

    public static final BigDecimal ZERO = new BigDecimal("0");

    public static void main(String[] args) {
        List<ArrayList<BigDecimal>> results = new ArrayList<ArrayList<BigDecimal>>();

        BigDecimal income = ZERO;
        BigDecimal increment = new BigDecimal("1000");
        BigDecimal end = new BigDecimal("250000");

        while(income.compareTo(end) < 0) {
            BigDecimal newTax = getTax(income,newRate);
            BigDecimal oldTax = getTax(income,oldRate);
            //if (newTax.compareTo(oldTax) < 0) {
            if (true) {
                ArrayList<BigDecimal> row = new ArrayList<BigDecimal>();
                row.add(income);
                row.add(newTax);
                row.add(oldTax);
                row.add(newTax.subtract(oldTax));
                results.add(row);
            }
            income = income.add(increment);
        }

        for (ArrayList row: results) {
            System.out.println(row.toString());
        }

    }


    private static BigDecimal getTax(BigDecimal income, BigDecimal[][] taxRate) {
        BigDecimal tax = ZERO;
        if (income.compareTo(ZERO) < 1) {
            return ZERO;
        }
        int length = taxRate.length;
        for (int i = 0; i < length; i++) {
            if (i == length - 1) {
                for (int j = 0; j < i; j++) {
                    tax = tax.add((taxRate[j][1].subtract(taxRate[j][0])).multiply(taxRate[j][2]));
                }
                tax = tax.add((income.subtract(taxRate[i][0])).multiply(taxRate[length - 1][2]));
            } else {
                if (taxRate[i][0].compareTo(income) < 0 && taxRate[i][1].compareTo(income) >= 0) {
                    for (int j = 0; j < i; j++) {
                        tax = tax.add((taxRate[j][1].subtract(taxRate[j][0])).multiply(taxRate[j][2]));
                    }
                    tax = tax.add((income.subtract(taxRate[i][0])).multiply(taxRate[i][2]));
                    break;
                }
            }
        }
        return tax;
    }
}



