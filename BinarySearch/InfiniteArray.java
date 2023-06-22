package BinarySearch;

import javax.naming.directory.SearchControls;

public class InfiniteArray {
    public static void main(String[] args) {

        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;

        System.out.println(ans(arr, target));

        
    }


    static int ans(int[] arr, int target){
        // first find the range
        //first start with a box of size 2
        int start = 0;
        int end = 1;

        // condtition for the target to lie in the range 
        while(target >= end){

            int temp = end + 1; // this is my new Start
            // double box value
            // end = previous end + sizeofbox*2 
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        return binarysearch(arr, target);
    }

    static int binarysearch(int[] arr, int target){
    int start = 0;
    int end = arr.length-1;

    while(end >= start){

        // find the middle element 
        // int mid  = (start + end ) / 2; // might be possible that (start + end) exceed
        int mid = start + (end - start) / 2;

        if( target > arr[mid]){
            start = mid + 1;
        }

        if(target < arr[mid]){
            end = mid - 1;
        }

        if(target == arr[mid]){
           return mid;
        }


    } 

        return -1;
    }
}
