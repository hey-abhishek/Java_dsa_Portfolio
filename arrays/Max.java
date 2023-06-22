package arrays;

public class Max {
    public static void main(String[] args) {

        int [] arr = {1,3,23,9,32,18};

        //int ans = max(arr);
        int ans = maxRange(arr,1,5);
        System.out.println(ans);
    }


    static int maxRange(int[] arr, int start, int end){

       // work on edge cases here, like array being null
        if (end < start){
            return -1;
        }

        if(arr == null){
            return -1;
        }

        if(arr.length == 0 ){
            return -1;
        }

        int MaxVal = arr[0];
        for (int i = start;  i< end; i++) {

            if (arr[i] > MaxVal){
                MaxVal = arr[i];
            } 
        }
        return MaxVal;
            
    }
    
    // static int max(int[] arr){

    //     int MaxVal = arr[0];
    //     for (int i = 0; i < arr.length; i++) {

    //         if (arr[i] > MaxVal){
    //             MaxVal = arr[i];
    //         } 
    //     }
    //     return MaxVal;
            
    // }
}
