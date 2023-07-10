public class Patterns2 {

    public static void hollowRectangle(int totRow, int totCols){
        //outer-loop
        for(int i=1; i<=totRow; i++){
            //inner-columns
            for(int j=1; j<=totCols; j++){
                if(i==1 || i==totRow || j==1 || j==totCols){
                    //boundary-cells
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void invertedPyramid(int totRows, int totCols){
        for(int i=1; i<=totRows; i++){
            for(int j=1; j<=totRows-i; j++){
                //spaces
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertedNumbers(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void flyodTriangle(int n){
        int num = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    //Zero-One Triangle:
    public static void binTriangle(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1"); //even
                } else{
                    System.out.print("0"); //odd
                }
            }
            System.out.println();
        }
    }

    public static void butterFly(int n){
        //1st Half:
        for(int i=1; i<=n; i++){
            //stars = i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd Half:
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
            
        }
    }

    //Solid Hollow:
    public static void solidHollow(int n){
        for(int i=1; i<=n; i++){
            //spaces:
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars:
            for(int k=1; k<=n; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollowRhombus(int totRows, int totCols){
        for(int i=1; i<=totRows; i++){
            //spaces - n-i
            for(int j=1; j<=totRows-i; j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=totCols; j++){
                if(i==1 || i==totRows || j==1 || j==totCols){
                    //boundary-cells
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    public static void diamond(int n){
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }

            System.out.println();
        }
        for(int i=n; i>=1; i--){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }

            System.out.println();

        }
    }

    public static void numberPyramid(int n){
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //numbers
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void palindromicNumber(int n){
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //numbers - descending
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            //numbers - ascending
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pyramid(int n){
        //outerloop
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        pyramid(4);
    }
    
}
