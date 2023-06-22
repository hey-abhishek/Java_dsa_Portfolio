package BinarySearch;

public class ceiling {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 7;

        int ans = search(arr, target);
        System.out.println(ans);

    }
    // return the smallest number >= target 

    static int search(int[] arr, int target ){

         // but what  if the  target is greater than the greatest number in the array

         if(target > arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target == arr[mid]){
                return arr[mid];
            }

            if(target > arr[mid]){
                start = mid + 1 ;

            }
            if(target < arr[mid]){
                end = mid - 1;
            }
        }

        return arr[start];
    }
    
}
