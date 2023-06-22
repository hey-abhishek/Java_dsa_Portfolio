package Sorting.CyclicSort;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {4,3,-1,1};
        int ans = FirstPositive(arr);
        System.out.println(ans);
    }
    
    static int FirstPositive(int[] arr){

        int i = 0;
        while( i < arr.length){
            int correct = arr[i] - 1;
            if( arr[i] > 0 && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
            for (int index = 0; index <= arr.length; index++) {
                if(arr[index] != index + 1){
                    return index+1;
                }
                
            }
        
        return arr.length+1;
       
    }
    
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    } 
}
