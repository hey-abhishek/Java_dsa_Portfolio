package LinearSearch;

import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String str = "Kunal";
        char target = 'n';

        boolean ans = search(str, target);
       System.out.println(ans);


        // converting string to character Array
      // System.out.println(Arrays.toString(str.toCharArray()));
    }


    // 2nd way 

    // static boolean search2(String str, char target){

    //     if( str.length()==0){
    //         return false;
    //     }

        // using a enhanced for loop

    //     for (char ch : str.toCharArray()) {

    //         if(ch == target){
    //             return true;
    //         }
            
    //     }
    //     return false;



    // }


    // first way 
    static boolean search(String str, char target){

        for (int i = 0; i < str.length(); i++) {

            if(target == str.charAt(i)){
                return true;
            }
            
        }
        return false;



    }
    
}
