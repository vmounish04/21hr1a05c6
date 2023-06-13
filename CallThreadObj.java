public class CallThreadObj {
    public static void main(String[] args) {
        CallThreadObj obj = new CallThreadObj();

        Thread to = new Thread();

        to.start();

        System.out.println("Threads inside main are very much helpfull in java ");
    }

    public void run()
    {
        System.out.println("Threads from overridden run method are helpful");
    }
    
}
