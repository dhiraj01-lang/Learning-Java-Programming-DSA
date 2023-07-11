public class Arrays {

    public static void update(int marks[], int nonChangeable){
        for(int i=0; i<marks.length; i++){
            marks[i]+=1;
        }
        nonChangeable = 10;
    }


    public static void main(String args[]){
        int marks[] = {99, 97, 88};
        int nonChangeable = 5;
        update(marks, nonChangeable);

        System.out.println(nonChangeable);

        //print our marks
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
        // System.out.println();


    }
    
}
