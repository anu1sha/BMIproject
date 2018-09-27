package lickingheights.com;

import sun.awt.Symbol;

import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
	//
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        String pounds;
        int pound;
        int secondNumber;
        double totalp;
        int feet;
        double totalf;
        String hello;
        int inches;
        Double totali;
        double totalm;







        System.out.println("Hello there!");
        hello = keyboard.nextLine();
        System.out.println("Today we will calculate your BMI");
        System.out.println("I will need your weight in pounds ");
        pound = keyboard.nextInt();
        totalp = ((1/2.2)*(pound));
        System.out.println("Your weight in kilograms is "+ totalp);
        System.out.println("Now I need to know how many feet you are");
        feet = keyboard.nextInt();
        totalf = (feet*.3);
        System.out.println("Now I need the amount of inches");
        inches= keyboard.nextInt();
        totali = (inches * .025);
        totalm = (totali + totalf);
        System.out.println("Your height in meters is " + totalm );
        System.out.println("With that information I can calculate that your BMI is ");
        System.out.println((totalp)/(totalm * totalm));












    }
}
