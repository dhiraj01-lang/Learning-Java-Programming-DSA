import java.util.*;
public class Practice03{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Positive or Negative numbers:
        // int input = sc.nextInt();
        // String ans = (input<0)?"Negative":"Positive";
        // System.out.println(ans);

        //Calculator:
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        // int option = sc.nextInt();
        // switch(option){
        //     case 1: System.out.println("Addition: " + (num1+num2));
        //     break;
        //     case 2: System.out.println("Subtraction: " + (num1-num2));
        //     break;
        //     case 3: System.out.println("Multiplication: " + (num1*num2));
        //     break;
        //     case 4: System.out.println("Division: " + (num1/num2));
        //     break;
        //     case 5: System.out.println("Modulo: " + (num1%num2));
        //     break;
        //     default: System.out.println("Invalid");
        // }

        //Day of week name:
        // int number = sc.nextInt();
        // switch(number){
        //     case 1: System.out.println("Monday");
        //     break;
        //     case 2: System.out.println("Tuesday");
        //     break;
        //     case 3: System.out.println("Wednesday");
        //     break;
        //     case 4: System.out.println("Thursday");
        //     break;
        //     case 5: System.out.println("Friday");
        //     break;
        //     case 6: System.out.println("Saturday");
        //     break;
        //     case 7: System.out.println("Sunday");
        //     default: System.out.println("Invalid");
        // }

        //Leap year or not:
        int year = sc.nextInt();
        if ((year%4==0) && ((year%100!=0) || (year%400==0))){
            System.out.println("It's a Leap Year");
        } 
        else {
            System.out.println("It's not a Leap Year");
        }

    }
}