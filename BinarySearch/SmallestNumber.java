package BinarySearch;

public class SmallestNumber {
    public static void main(String[] args) {

    char[] letters = {'c','d','f','j'};

    char target = 'd';
    char ans = search(letters, target);
    System.out.println(ans);
    
}
static char search(char[] letters, int target){
    int start = 0;
     int end = letters.length-1;

     while (start <= end){
         int mid = start + (end - start ) / 2;

    //      if(target >= letters[mid]){
    //         start = mid + 1 ;
    //      }
    //      else{
           
    //         end = mid - 1 ;
    //      }

    //  }

    // Another way

    
    if(target < letters[mid]){
        end = mid - 1 ;  
     }
     
     else{
        start = mid + 1 ;
     }

 }

     return letters[start % letters.length];
 }

    
}
