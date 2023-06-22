package BinarySearch;

public class OrderAgnosticBS {
    
    public static void main(String[] args) {
//        int[] arr = {-18,-2,3,4,5,67,78,87,89,98,878,997 };
        int[] arr = {99,80,75,22,11,10,5,2,-3};
        int target = 22;
        int ans = OrderAgnosticBS(arr, target);
        System.out.println(ans);  
    }

    static int OrderAgnosticBS(int[] a, int target){

        int start = 0;
        int end = a.length-1;


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
