package BinarySearch;

public class SearchInMountain {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,3,3,1};
        int target = 3;

        int ans = search(arr, target);
        System.out.println(ans);
        
    }
    static int search (int[] arr, int target ){
        int peak = PeakIndexInMountainArray(arr);
        int firstTry = OrderAgnosticBS(arr, target,0,peak);

        
        if(firstTry != -1){
            return firstTry;
        }
        // try to search in second half 
        return OrderAgnosticBS(arr, target, peak+1, arr.length-1);

    }




    static int PeakIndexInMountainArray(int[] arr ){
        int start = 0;
        int end = arr.length - 1;

        while( start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                // you are in dec part of array
                // this may be ans, but at left
                // this is why end != mid - 1
                end = mid;
            }
            else{
                // you are in asc part of array 
                start = mid + 1; // beacuse we know that mid + 1 element > than mid element
            }
        }
        // in the end, start == end and pointing to the largest number beacause of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: for every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that one item is remaining, hence cuz of above line that is the best possible answer
        return start; // or end as both are =     
    }


    static int OrderAgnosticBS(int[] a, int target, int start, int end){

        /*
         if (a[start] < a[end]){
            isAsc = true;
         }
         else{
            isAsc = false;
         }
         */

        boolean isAsc = a[start] < a[end];

        while(end >= start){

            // find the middle element 
            // int mid  = (start + end ) / 2; // might be possible that (start + end) exceed
            int mid = start + (end - start) / 2;


            if(target == a[mid]){
                return mid;
             }

            if(isAsc){
                if( target > a[mid]){
                    start = mid + 1;
                } 
                if(target < a[mid]){
                    end = mid - 1;
                }
            }
            else{
                if( target > a[mid]){
                       end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }     
        }
        
        return -1;
    }
    
}
