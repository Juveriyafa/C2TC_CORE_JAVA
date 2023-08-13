package com.tnsif.daythree;

public class TaxCalculation {
    public void calculateTax(Person p) {
        if (p.getAge() > 65 || p.getGender().equalsIgnoreCase("female")) {
            p.setTaxes(0);
            System.out.println("Tax not applicable");
        } else {
            if (p.getIncome() > 800000) {
                p.setTaxes((p.getIncome() - 800000) * 30 / 100 + 94000);
            } else if (p.getIncome() > 500000 && p.getIncome() <= 800000) {
                p.setTaxes((p.getIncome() - 500000) * 20 / 100 + 34000);
            } else if (p.getIncome() > 160000 && p.getIncome() <= 500000) {
                p.setTaxes((p.getIncome() - 160000) * 10 / 100);
            } else {
                p.setTaxes(0);
            }
        }
    }
}

