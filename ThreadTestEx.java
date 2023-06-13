public class ThreadTestEx extends Thread{
    public static void min(String[] args)
    {
        ThreadTestEx tt = new ThreadTestEx();

        tt.start();

        System.out.println("This code is outside of the thread");

        
    }
    public void run()
    {
        System.out.println("This code is running in a Thread");

    }
}
