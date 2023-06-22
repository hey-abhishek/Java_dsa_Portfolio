package LinearSearch;

public class EvenDigit {
    
    public static void main(String[] args) {
        int[] nums = {12,345,6,5,7896};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums){
        int count = 0 ;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    //function to check whether a number contains even digits  or not
    static boolean even(int num){

        int numberOfDigits = digits(num);
        /*
         if (numberOfDigit % 2 ==0){
            return true;
         }
         */

         return numberOfDigits % 2 == 0;
    }


    //count number of digits in  a number 
    static  int digits(int num){

        if (num < 0){
            num = num * -1;
        }
        if (num == 0){
            return 1;
        }

        int count = 0;

        while (num > 0 ){
            count++;
            num = num/10;
        }
        return count;
    }
}
