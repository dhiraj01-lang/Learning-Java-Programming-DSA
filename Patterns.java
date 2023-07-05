import java.util.*;
public class Patterns {
    public static void main(String args[]){
        //Star Pattern:
        // for(int line = 1; line <= 4; line++){
        //     for(int star = 1; star <= line; star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //User - Input Star Pattern:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        // for(int line=1; line<=n; line++){
        //     for(int star=1; star<=line; star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Inverted Star pattern:
        // for(int line=1; line<=n; line++){
        //     for(int star=1; star<=n-line+1; star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Half-Pyramid pattern:
        // for(int line=1; line<=n; line++){
        //     for(int num=1; num<=line; num++){
        //         System.out.print(num);
        //     }
        //     System.out.println();
        // }

        //Character Pattern:
        char ch = 'A';
        for(int line=1; line<=n; line++){
            for(int chars=1; chars<=line; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    
    }
}
