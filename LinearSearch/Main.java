package LinearSearch;

public class Main {
    public static void main(String[] args) {
        
        int[] arr = {23,45,1,2,8,19,-3,16,-11,28};

        int target = 16;

        boolean ans = linearsearch3(arr, target);
        System.out.println("item found: "+ ans);

    }

    // search the target and return true or false

    static boolean linearsearch3(int[] arr, int target){

        if(arr.length ==0){
            return false;
        }

        //run a for loop 
        for (int index = 0; index < arr.length; index++) {
            //check element at every index if it is = target 
            int element = arr[index];

            if (element == target){
                return true;
            }

        }
        //this line will excute if none of the return statements above have executed
        //hence the target not found
        return false ;

    //search the target and return the element

    // static int linearsearch2(int[] arr, int target){

    //     if(arr.length ==0){
    //         return -1;
    //     }

    //     //run a enhanced for loop 
    //     for (int element : arr) {
    //         //check element at every index if it is = target 
    //         if (element == target){
    //             return element;
    //         }

    //     }

    // search in the array: return the index if item found
    // otherwise if item not found return -1

    // static int linearsearch(int[] arr, int target){

    //     if(arr.length ==0){
    //         return -1;
    //     }

    //     //run a for loop 
    //     for (int index = 0; index < arr.length; index++) {
    //         //check element at every index if it is = target 
    //         int element = arr[index];

    //         if (element == target){
    //             return index;
    //         }

    //     }


    //     this line will excute if none of the return statements above have executed
    //     hence the target not found
    //     return -1;

    }
    
}
