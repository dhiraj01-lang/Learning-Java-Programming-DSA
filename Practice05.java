import java.util.*;
public class Practice05 {

    public static int avgNum(int a, int b, int c){
        // System.out.println("Enter number: " + a);
        // System.out.println("Enter number: " + b);
        // System.out.println("Enter number: " + c);

        int avg = (a+b+c)/3;
        System.out.println(avg);

        return avg;

    }

    public static boolean isPalindrome(int number) {
        int palindrome = number; // copied number into variable
        int reverse = 0;
        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        
        if (number == reverse) {
            return true;
        }
        return false;
    }

    //SumofDigits:
    public static int sumOfDigits(int n){
        int sum = 0;
        while(n>0){
            int lastDigit = n%10;
            sum+=lastDigit;
            n = n/10;
        }
        return sum;
    }
    
    public static void main(String args[]) {
        // System.out.println("Please Enter a number : ");
        // Scanner sc = new Scanner(System.in);
        // int palindrome = sc.nextInt();
        // if(isPalindrome(palindrome)) {
        //     System.out.println("Number : " + palindrome + " is a palindrome");
        // } else {
        //     System.out.println("Number : " + palindrome + " is not a palindrome");
        // }

        System.out.println(sumOfDigits(1567));
    }

    
    
}
