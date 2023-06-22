package LinearSearch;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {18,12,7,3,14,28};
     
        int ans = min(arr);
        System.out.println(ans);
    }


    // assume arr.length!= 0
    // return the minium value in the array

    static int min(int[]arr){

        int ans = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] < ans){
                ans = arr[i];
            }
            
        }

        return ans;
    }
    
}
