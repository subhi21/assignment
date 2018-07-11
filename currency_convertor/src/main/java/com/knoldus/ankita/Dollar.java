package com.knoldus.ankita;

public class Dollar {
    public static double findCurrency2(String currency2, double amt) {

        Dollar dollar=new Dollar();
        double convertdAmt=0;
        if (currency2.equals("EURO"))
            convertdAmt=dollar.convertDollarEuro(amt);
        if (currency2.equals("INR"))
            convertdAmt=dollar.convertDollarInr(amt);
        if (currency2.equals("RUBLE"))
            convertdAmt=dollar.convertDollarRuble(amt);
        if (currency2.equals("YEN"))
            convertdAmt=dollar.convertDollarYen(amt);
        return convertdAmt;
    }


    public double convertDollarInr(double amt) {
        amt = amt * 68.95;
        return amt;
    }

    public double convertDollarEuro(double amt) {
        amt = amt * 0.857;
        return amt;
    }

    public double convertDollarRuble(double amt) {
        amt = amt * 63.19;
        return amt;
    }
    public double convertDollarYen(double amt) {
        amt = amt * 110.62;
        return amt;
    }
}
