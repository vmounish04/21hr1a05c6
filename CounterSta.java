public class CounterSta {

    static int count=0; //will get memory only once and retain its value

    CounterSta()
    {
        count++;  // incrementing the value of static variables
        System.out.println(count);
    }
    
    public static void main(String[] args)
    {
        CounterSta c1 = new CounterSta();
        CounterSta c2 = new CounterSta();
        CounterSta c3 = new CounterSta();

    }

    
}
