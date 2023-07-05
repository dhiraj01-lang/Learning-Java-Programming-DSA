import java.util.*;
public class Practice04 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Hello Printed how many times?
        // for(int i=0; i<=5; i++){
        //     System.out.println("Hello");
        //     i+=2;
        // }

        //Sum of odd even integers

        // int n;
        // int choice;
        // int oddSum = 0;
        // int evenSum = 0;

        // do{
        //     System.out.println("Enter your number: ");
        //     n = sc.nextInt();
        //     if(n%2==0){
        //         evenSum+=n;
        //     } else{
        //         oddSum+=n;
        //     }
        //     System.out.println("If you want to continue, press 1 for yes or 0 for no");
        //     choice = sc.nextInt();

        // } while(choice==1);
        // System.out.println("Sum of even no: " + evenSum);
        // System.out.println("Sum of odd no: " + oddSum);


        //Factorial of a number:
        // int num = sc.nextInt();
        // int factorial = 1;
        
        // for(int i=1; i<=num; i++){
        //     factorial*=i;
        // }
        // System.out.println("Factorial of " + num + " is " + factorial);

        //Multiplication of a number:
        int n = sc.nextInt();
        System.out.println("Multiplication of " + n + " is:");
        for(int i=1; i<=10; i++){
            System.out.print(n ' * '  + ' = ' + n*i);
        }

    }
    
}
