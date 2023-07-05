import java.util.*;
public class loops{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //While Loop:
        // int num = 5;
        // int sum = 0;
        // int i = 1;
        // while(i<=num){
        //     sum+=i;
        //     i++;
        // }
        // System.out.println("Sum is: " + sum);

        //For Loop:
        // int n = 5;
        // for(int line=1; line<=(n-1); line++){
        //     System.out.println("****");
        // }

        //Reverse of a number:
        // int n = 10899;
        // while(n>0){
        //     int lastDigit = n%10;
        //     n = n/10;
        //     System.out.print(lastDigit + "");
        // }

        // int n = 342599;
        // while(n>0){
        //     int rev=0;
        //     int lastDigit = n%10;
        //     n = n/10;
        //     rev = (rev*10) + lastDigit;
        //     System.out.print(rev + "");
        // }
        
        //Do-While Loop:
        // do{
        //     System.out.print("Enter your number: ");
        //     int n = sc.nextInt();
        //     if(n%10==0){
        //         break;
        //     }
        //     System.out.println(n);
        // } while(true);

        //Continue statement:
        // for(int i=1; i>0; i++){
        //     System.out.print("Enter your number: ");
        //     int n = sc.nextInt();
        //     if(n%10==0){
        //         continue;
        //     }
        //     System.out.println(n);
        // }

        //Number is Prime or not:
        int n = sc.nextInt();
        if(n==2){
            System.out.println("It's a Prime number");
        }
        else{
            boolean isPrime = true;
            for(int i=2; i<=n-1; i++){
                if(n % i == 0){
                    isPrime = false;
                }
            }

            if(isPrime == true){
                System.out.println("It's a Prime number");
            } else{
                System.out.println("It's not a Prime number");
            } 
        }  
    }
}