package Functions;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20 ;
        String name = "Kunal";

        {
             a= 78; // already initialized outside the block in the same block
             a  = 100; //reassign the origin  ref variable to some  other value
             System.out.println(a);
             System.out.println(name);
             // values initialised in this block, will remain in the block 
        }
        int  c= 900;
        System.out.println(a);
        System.out.println(name);
        System.out.println(c);

        //scoping in for loops  
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int num = 90;
            a = 10000;
            
        }
        System.out.println(a);


    }
    
}
