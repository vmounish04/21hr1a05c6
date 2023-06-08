public class StaticBlock {
    static {
        System.out.println("Static block is invocked"); // static block exicutes before main

        
    }
    public static void main(String[] args)
         {
            System.out.println("Hello main");
        }
}
