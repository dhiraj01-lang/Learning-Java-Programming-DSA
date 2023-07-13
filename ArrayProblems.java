public class ArrayProblems {


    //Reverse an Array:
    public static void reverse(int numbers[]){
        int first = 0, last = numbers.length-1;

        while(first<last){
            //swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    
    }

    //Pairs in an array:

    public static void pairsArray(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            int curr=numbers[i];
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("(" + curr + "," + numbers[j] + ")" );
            }
            System.out.println();
        } 
    }

    //Subarrays:
    public static void subArrays(int numbers[]){
        int ts = 0;
        for(int i=0; i<numbers.length; i++){
            int start = i;                        
            for(int j=i; j<numbers.length; j++){
                int end = j;
                for(int k = start; k<=end; k++){ //print
                    System.out.print(numbers[k] + " " ); //subarray
                }
                ts+=1;
                System.out.println();
            }
             System.out.println();
            
        }
        System.out.println("Total Subarray are: " + ts);
    }

    //Max-Subarray:
    public static void maxSubArray(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                currSum = 0;
                for(int k=start; k<=end; k++){ //print
                    //subarray sum
                    currSum+=numbers[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                } 
            }
        }
        System.out.println("Max sum is: " + maxSum);
    }

    public static void kadanes(int numbers[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            cs += numbers[i];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }

        System.out.println(ms);
    }
    
    public static void trappedWater(int height[]){
        //Calculate leftmax boundary
        int leftmax = new 
        for(int i=0; )


        //Calculate rightmax boundary

        //loop


    }


    public static void main(String args[]){
        // int numbers[] = {2, 4, 6, 8, 10};
        // int numbers[] = {1, -2, 6, -1, 3};
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -1};

        int height[] = {4, 2, 0, 6, 3, 2, 5};

        // reverse(numbers);

        // for(int i=0; i<numbers.length; i++){
        //     System.out.print(numbers[i] + " ");
        // }
        // System.out.println();

        // pairsArray(numbers);

        //subArrays(numbers);

        // maxSubArray(numbers);

        kadanes(numbers);

    }
}
