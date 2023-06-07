class AB{

   void m()
    {
        System.out.println("Hello m");
    }

    void n()
   {
    System.out.println("Hello n");
    this.m();
   }
   
}

public class ThisKeyEx1 {
    public static void main(String[] args) {
        AB a =new AB();
        a.n();
    }
}
