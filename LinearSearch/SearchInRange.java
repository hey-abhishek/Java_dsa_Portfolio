package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {

        int[] arr = {18,12,-7,3,14,28};
        int target = 14;
        

        int ans = linearsearch(arr, target, 1, 4);
        System.out.println(ans);
        
    }
    
    //search in the array: return the index if item found
    //otherwise if item not found return -1

    static int linearsearch(int[] arr, int target, int start, int end){

        if(arr.length ==0){
            return -1;
        }

        //run a for loop 
        for (int index = start; index <= end; index++) {
            //check element at every index if it is = target 
            int element = arr[index];

            if (element == target){
                return index;
            }

        }


        //this line will excute if none of the return statements above have executed
        //hence the target not found
        return -1;
    }
}
