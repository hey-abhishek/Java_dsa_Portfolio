package BinarySearch;

import java.lang.module.FindException;
import java.util.Arrays;

public class FirstAndLastOccurence {
    public static void main(String[] args) {
        int[] arr = {5,7,7,7,7,8,8,10};
        int target = 7;

        int [] ans = searchRange(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchRange(int[] nums, int target){


        int[] ans = {-1,-1};
        // check for the first occurence of target first
        ans[0] = search(nums, target, true);
        if(ans[0] != -1){
            ans[1] = search(nums, target, false);
        } 
        return ans; 
    }

    // this functin just returns the index value of target 
    static int search(int[]nums, int target, boolean findStartIndex){
        int ans = -1 ;
        int start = 0;
        int end = nums.length-1;

        while(end >= start){

            // find the middle element 
            // int mid  = (start + end ) / 2; // might be possible that (start + end) exceed
            int mid = start + (end - start) / 2;

            if( target > nums[mid]){
                start = mid + 1;
            }

            else if(target < nums[mid]){
                end = mid - 1;
            }

           else{
            //potential ans found
              ans = mid ; 
              if(findStartIndex ){
                end = mid - 1;
              }else{
                start = mid + 1;
              }
            }
        }  
        return ans;
            
    }   
    
}
