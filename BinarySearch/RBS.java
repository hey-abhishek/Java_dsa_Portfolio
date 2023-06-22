package BinarySearch;

public class RBS {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        //System.out.println(findpivot(arr));
        System.out.println(findpivotWithDuplicates(arr));
        
    }
    static int search(int[] nums, int target ){
        //int pivot = findpivot(nums);
        int pivot = findpivotWithDuplicates(nums);
        // if you did not find pivot, it means the array is not rotated
        if(pivot == -1){
            // just do normal binary search
            return binarysearch(nums, target, 0, nums.length-1);
        }
        
        // if pivot is found, you have found 2 asc sorted arrays
        if (nums[pivot] == target){
            return pivot;
        }
        if(target > nums[0]){

            return binarysearch(nums, target, 0, pivot - 1);
        }
        return binarysearch(nums, target, pivot + 1, nums.length - 1);

    }
    static int binarysearch(int[] a, int target,int start, int end){

      

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

    // this will not work in duplicate values

    static int findpivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while( start < end){
        int mid = start + (end - start) / 2;
        // 4 cases
        if(mid < end && arr[mid] > arr[mid + 1]){
            return  mid;
        } 
        if(mid > start && arr[mid] < arr[mid - 1]){
            return  mid-1;
        } 
        if(arr[mid] <= arr[start]){
            return  end = mid - 1;
        } 
        else{
            return start = mid + 1;
        }

        }
        return -1;
    }




    static int findpivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while( start < end){
        int mid = start + (end - start) / 2;
        // 4 cases
        if(mid < end && arr[mid] > arr[mid + 1]){
            return  mid;
        } 
        if(mid > start && arr[mid] < arr[mid - 1]){
            return  mid-1;
        } 
        // if elements at middle, start, end are equal then just skip the duplicates
        if(arr[mid] == start && arr[mid] == end){
            // skip the duplicates
            // NOTE: what if these elements at start and end were the pivot??
            // check if start is pivot
            if(arr[start] > arr[start + 1]){
                return start;
            }
            start++;

            // check if end is pivot
            if(arr[end] < arr[end - 1]){
                return end - 1;
            }
            end--;
        }

        // left side [start] is sorted, so pivot should be in right
        else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
            start = mid + 1;
        }
        else{
            end = mid - 1;
        }

        }
        return -1;
    }
    
}
