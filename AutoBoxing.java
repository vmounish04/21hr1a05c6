// java program to convert primitive into objects 
// Auto boxing example of int to Integer S
public class AutoBoxing {

    public static void main(String[] args)
    {
        int a=30;
        Integer i = Integer.valueOf(a); //converting int into Integer explicity
        Integer j =a; //autoboxing, now compiler will write Integer.valueOf(a) internally

      System.out.println(a+" "+i+" "+j);
        
    }
    
}
