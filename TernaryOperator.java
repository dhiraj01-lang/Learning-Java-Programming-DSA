import java.util.*;
public class TernaryOperator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Odd-Even No.:
        // int num = 8;
        // String type = ((num%2==0)? "even":"odd");
        // System.out.println(type);

        //Check student is PASS or FAIL:
        int marks = sc.nextInt();
        String status = (marks>=33?"PASS":"FAIL");
        System.out.println(status);


    }
}
