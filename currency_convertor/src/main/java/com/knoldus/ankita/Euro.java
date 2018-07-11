package com.knoldus.ankita;

public class Euro {

    public static double findCurrency2(String currency2,double amt) {
        Euro euro=new Euro();
        double convertdAmt=0;
        if(currency2.equals("INR"))
            convertdAmt=euro.convertEuroInr(amt);
        if(currency2.equals("USD"))
            convertdAmt= euro.convertEuroDollar(amt);
        if(currency2.equals("RUBLE"))
            convertdAmt= euro.convertEuroRuble(amt);
        if(currency2.equals("YEN"))
            convertdAmt=euro.convertEuroYen(amt);
        return convertdAmt;
    }


    public double convertEuroInr(double amt)
    {
        amt = amt*80.77;
        return amt;
    }
    public double convertEuroDollar(double amt)
    {
        amt = amt*1.17;
        return amt;
    }
    public double convertEuroRuble(double amt)
    {
        amt = amt*74.03;
        return amt;
    }
    public double convertEuroYen(double amt)
    {
        amt = amt*129.59;
        return amt;
    }
}
