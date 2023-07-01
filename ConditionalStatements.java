import java.util.*;
public class ConditionalStatements{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // If-Else Statements:
        // int age=16;
        // if (age>=18){
        //     System.out.println("Yes, You can vote");
        // } 
        // if (age>13 && age<18){
        //     System.out.println("Teenager");
        // }
        // else{
        //     System.out.println("Sorry, You cannot vote");
        // }

        //Greatest of Two Numbers:
        // int a = 19;
        // int b = 13;
        // int c = 10;
        // if (a>b){
        //     System.out.println("a is Greatest");
        // }
        // if (b>c){
        //     System.out.println("b is the greatest");
        // }
        // else{
        //     System.out.println("c is the greatest");
        // }

        //Odd-Even Numbers:
        // int num = 9;
        // if (num%2==0){
        //     System.out.println("It's a Even Number");
        // } else{
        //     System.out.println("It's a Odd Number");
        // }

        //Income Tax:
        // int income  = sc.nextInt();
        // // int tax;
        // if (income<500000){
        //     int tax = 0;
        //     System.out.println("Your Tax is:" + tax);
        // }
        // else if((income>=500000) && (income<1000000)){
        //     int tax = (int) (income * 0.2);
        //     System.out.println("Your Tax is:" + tax);
        // }
        // else {
        //     int tax = (int) (income * 0.3);
        //     System.out.println("Your Tax is:" + tax);
        // }

        //Greatest of 3 no.:
        int a = 1;
        int b = 3;
        int c = 6;

        if ((a>=b) && (a>=c)){
            System.out.println("A is the Greatest");
        }
        else if (b>c){
            System.out.println("B is the Greatest");
        }
        else{
            System.out.println("C is the Greatest");
        }



    }
}