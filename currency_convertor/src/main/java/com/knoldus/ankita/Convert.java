package com.knoldus.ankita;
import java.util.*;
public class Convert {
    public static void main(String args[])
    {
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter the currency u have\n");
     String currency1=sc.nextLine();
     System.out.println("enter the currency u want to have\n");
     String currency2=sc.nextLine();
     System.out.println("enter the amount\n");
     double amt=sc.nextDouble();
     double convertdCurrency;
    if(currency1.equals("INR")) {
        convertdCurrency = INR.findCurrency2(currency2, amt);
        System.out.println("Converted Currency: "+convertdCurrency);
    }

    if(currency1.equals("EURO")) {
        convertdCurrency = Euro.findCurrency2(currency2, amt);
        System.out.println("Converted Currency: "+convertdCurrency);
    }
     if(currency1.equals("USD"));
        {
            convertdCurrency = Dollar.findCurrency2(currency2, amt);
            System.out.println("Converted Currency: "+convertdCurrency);
        }
     if(currency1.equals("RUBLE")) {
         convertdCurrency = Ruble.findCurrency2(currency2, amt);
         System.out.println("Converted Currency: "+convertdCurrency);
     }
    if(currency1.equals("YEN")) {
        convertdCurrency = Yen.findCurrency2(currency2, amt);
        System.out.println("Converted Currency: "+convertdCurrency);
    }

    }
}
