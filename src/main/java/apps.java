/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Gracie Bliss
 */
import java.util.*;
public class apps {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.print("Enter the principal: ");
        String principal=in.nextLine();

        System.out.print("Enter the rate of interest: ");
        String rate=in.nextLine();

        System.out.print("Enter the number of years: ");
        String years=in.nextLine();

        double p=Double.parseDouble(principal);
        double r=Double.parseDouble(rate)/100.00;
        double t=Double.parseDouble(years);

        double investment=p*(1+r*t);

        double rounded=Math.round(investment*100.0)/100.0;

        System.out.print("After "+years+" years at "+rate+"%, the investment will be worth $"+String.format("%.2f",rounded)+".");

    }
}
