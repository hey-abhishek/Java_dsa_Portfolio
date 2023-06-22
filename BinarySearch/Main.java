package BinarySearch;


public class Main {
    public static void main(String[] args) {

        int[] arr = {-18,-2,3,4,5,67,78,87,89,98,878,997 };
        int target = 87;
        int ans = binarysearch(arr, target);
        System.out.println(ans);
        
    }


    static int binarysearch(int[] a, int target){

        int start = 0;
        int end = a.length-1;

        while(end >= start){

            // find the middle element 
            // int mid  = (start + end ) / 2; // might be possible that (start + end) exceed
            int mid = start + (end - start) / 2;

            if( target > a[mid]){
                start = mid + 1;
            }

            if(target < a[mid]){
                end = mid - 1;
            }

            if(target == a[mid]){
               return mid;
            }


        }

        
        return -1;
    }
    
}
