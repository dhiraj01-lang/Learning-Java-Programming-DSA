public class Functions{
    public static void printHelloWorld(){
        System.out.println("Hello World");
    }

    public static int sumAb(int a, int b){
        int sum = a+b;
        // System.out.println(sum);
        return sum;
    }

    public static int productNo(int a, int b){
        int product = (a*b);
        // System.out.println(product);
        return product;
    }

    public static int factorialNo(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact*=i;
        }
        // System.out.println(fact);
        return fact;
        
    }

    public static int binCoefficient(int n, int r){
        int fact_n = factorialNo(n);
        int fact_r = factorialNo(r);
        int fact_nmr = factorialNo(n-r);
        int binCoeff = fact_n / (fact_r * fact_nmr);
        // System.out.println(f);
        return binCoeff;
    }

    //Function Overloading:
    public static int sum(int a, int b){
        return a+b;
    }

    public static float sum(float a, float b){
        return a+b;
    }

    //Prime or Not:
    // public static boolean isPrime(int n){
    //     boolean isPrime = true;
    //     for(int i = 2; i<=(n-1); i++){
    //         if(n%i==0){
    //             isPrime = false;
    //             break;
    //         }
    //     }
    //     return isPrime;
    // }

    public static boolean isPrime(int n){
        //corner-case:
        if(n==2){
            return true;
        }

        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }

        return true;
    }

    public static void primeInRange(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        // System.out.println();
    }


    public static void main(String args[]){
        // printHelloWorld();
        // sumAb(5, 6);
        // productNo(3, 5);
        // factorialNo(7);
        // System.out.println(binCoefficient(5, 2));
        // System.out.println(sum(4, 5));
        // System.out.println(sum(4.4f, 6.2f));
        // System.out.println(isPrime(7));
        primeInRange(20);

    }
}