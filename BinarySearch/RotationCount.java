package BinarySearch;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};

        System.out.println(countRotations(arr));
    }
    static int countRotations(int[] arr){
        int pivot = findpivot(arr);
        return pivot + 1;
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

    // this will work in duplicate values
    // static int findpivotWithDuplicates(int[] arr){
    //     int start = 0;
    //     int end = arr.length-1;

    //     while( start < end){
    //     int mid = start + (end - start) / 2;
    //     // 4 cases
    //     if(mid < end && arr[mid] > arr[mid + 1]){
    //         return  mid;
    //     } 
    //     if(mid > start && arr[mid] < arr[mid - 1]){
    //         return  mid-1;
    //     } 
    //     // if elements at middle, start, end are equal then just skip the duplicates
    //     if(arr[mid] == start && arr[mid] == end){
    //         // skip the duplicates
    //         // NOTE: what if these elements at start and end were the pivot??
    //         // check if start is pivot
    //         if(arr[start] > arr[start + 1]){
    //             return start;
    //         }
    //         start++;

    //         // check if end id pivot
    //         if(arr[end] < arr[end - 1]){
    //             return end - 1;
    //         }
    //         end--;
    //     }

    //     // left sir[start]e is sorted, so pivot should be in right
    //     else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
    //         start = mid + 1;
    //     }
    //     else{
    //         end = mid - 1;
    //     }

    //     }
    //     return -1;
    // }
    
    
}
