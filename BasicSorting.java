public class BasicSorting {

    //Bubble Sort:
    public static void bubbleSort(int numbers[]){
        for(int turn=0; turn<numbers.length-1; turn++){
            for(int j=0; j<numbers.length-1-turn; j++){
                //swap
                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;

                }
            }
        }
    }

    public static void printArr(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }

    //Selection Sort:
    public static void selectionSort(int numbers[]){
        for(int i=0; i<numbers.length-1; i++){
            int minPos = i;
            for(int j = i+1; j<numbers.length; j++){
                if(numbers[minPos]>numbers[j]){
                    minPos = j;
                }
            }
            //swap
            int temp = numbers[minPos];
            numbers[minPos] = numbers[i];
            numbers[i] = temp;
        }
    }

    //Insertion Sort:
    public static void insertionSort(int numbers[]){
        for(int i=1; i<numbers.length; i++){
            int curr = numbers[i];
            int prev = i-1;
            //finding correct pos to insert
            while(prev>=0 && numbers[prev]>curr){
                numbers[prev+1]=numbers[prev];
                prev--;
            }

            //insertion
            numbers[prev+1]=curr;
        }
    }

    public static void countingSort(int numbers[]){
        //Largest (Range)
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            largest = Math.max(largest, numbers[i]);
        }

        //Count (Frequency)
        int count[] = new int[largest+1];
        for(int i=0; i<numbers.length; i++){
            count[numbers[i]]++;
        }

        //Sorting
        int j = 0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
            numbers[j]=i;
            j++;
            count[i]--;
            }
        }
    }


    public static void main(String args[]){
        // int numbers[] = {5, 4, 1, 3, 2};
        int numbers[] = {1, 4, 1, 3, 2, 4, 3, 7};
        // bubbleSort(numbers);
        // selectionSort(numbers);
        // insertionSort(numbers);
        countingSort(numbers);
        printArr(numbers);

    }
    
}
