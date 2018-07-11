package com.knoldus.ankita;

public class Ruble {

    public static double findCurrency2(String currency2,double amt) {
        Ruble ruble=new Ruble();
        double convertdAmt=0;
        if(currency2.equals("EURO"))
            convertdAmt=ruble.convertRubleEuro(amt);
        if(currency2.equals("USD"))
            convertdAmt=ruble.convertRubleDollar(amt);
        if(currency2.equals("INR"))
            convertdAmt= ruble.convertRubleInr(amt);
        if(currency2.equals("YEN"))
            convertdAmt=ruble.convertRubleYen(amt);
        return convertdAmt;
    }


    public double convertRubleInr(double amt)
    {
        amt = amt*1.09;
        return amt;
    }
    public double convertRubleEuro(double amt)
    {
        amt = amt*0.014;
        return amt;
    }
    public double convertRubleDollar(double amt)
    {
        amt = amt*0.016;
        return amt;
    }
    public double convertRubleYen(double amt)
    {
        amt = amt*1.75;
        return amt;
    }
}
