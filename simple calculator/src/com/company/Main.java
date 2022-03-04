package com.company;

import java.util.Scanner;

public class Main {

    public static double getAddition(double a,double b){
        return a + b;
    }

    public static double getSubtraction(double a,double b){
        return a - b;
    }

    public static double getMultiplication(double a,double b){
        return a * b ;
    }

    public static double getDivision(double a,double b){
        return a / b;
    }

    public static void main(String[] args) {
        // write your code here
        int type;
        double n1,n2;
        double Addition, Subtraction , Multiplication , Division ;

        System.out.println("Hello");

        System.out.println("What do you want to do?");
        System.out.println("Press 1 for Addition ");
        System.out.println("Press 2 for Subtraction ");
        System.out.println("Press 3 for Multiplication ");
        System.out.println("Press 4 for Division\n");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter type : ");
        type = input.nextInt();

        System.out.print("Enter number 1 : ");
        n1 = input.nextDouble();
        System.out.print("Enter number 2 : ");
        n2 = input.nextDouble();

        switch (type) {
            case 1 : Addition = getAddition(n1, n2);
                        System.out.print("\nAnswer is : " + Addition);
                        break;
            case 2 : Subtraction = getSubtraction(n1, n2);
                        System.out.print("\nAnswer is : " + Subtraction);
                        break;
            case 3 : Multiplication = getMultiplication(n1, n2);
                        System.out.print("\nAnswer is : " + Multiplication);
                        break;
            case 4 : Division = getDivision(n1, n2);
                        System.out.print("\nAnswer is : " + Division );
                        break;
            default : System.out.print("\nInvalid Operation");

        }

    }
}
