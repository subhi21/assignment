package com.knoldus.ankita;

public class Yen {
    public static double findCurrency2(String currency2,double amt) {
        Yen yen=new Yen();
        double convertdAmt=0;
        if(currency2.equals("EURO"))
            convertdAmt= yen.convertYenEuro(amt);
        if(currency2.equals("USD"))
            convertdAmt= yen.convertYenDollar(amt);
        if(currency2.equals("RUBLE"))
            convertdAmt= yen.convertYenRuble(amt);
        if(currency2.equals("INR"))
            convertdAmt= yen.convertYenInr(amt);
        return convertdAmt;
    }

    public  double convertYenInr(double amt)
    {
        amt = amt*0.62;
        return amt;
    }
    public double convertYenDollar(double amt)
    {
        amt = amt*0.0090;
        return amt;
    }
    public double convertYenEuro(double amt)
    {
        amt = amt*0.0077;
        return amt;
    }
    public double convertYenRuble(double amt)
    {
        amt = amt*0.57;
        return amt;
    }

}
