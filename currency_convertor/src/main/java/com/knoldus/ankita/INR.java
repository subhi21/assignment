package com.knoldus.ankita;

public class INR {


    public static double findCurrency2(String currency2,double amt) {
        INR rs=new INR();
        double convertdAmt=0;
       if(currency2.equals("EURO"))
           convertdAmt=rs.convertInrEuro(amt);
       if(currency2.equals("USD"))
           convertdAmt = rs.convertInrDollar(amt);
       if(currency2.equals("RUBLE"))
           convertdAmt=rs.convertInrRuble(amt);
       if(currency2.equals("YEN"))
           convertdAmt= rs.convertInrYen(amt);


        return convertdAmt;

    }


    public double convertInrEuro(double amt)
    {
        amt = amt*0.012;
        return amt;
    }
    public double convertInrDollar(double amt)
    {
        amt = amt*0.015;
        return amt;
    }
    public double convertInrRuble(double amt)
    {
        amt = amt*0.92;
        return amt;
    }
    public double convertInrYen(double amt)
    {
        amt = amt*1.61;
        return amt;
    }

    }
