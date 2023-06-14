public class ThreadInterEx extends Thread{
    
    public void run()

    {
        try{
            Thread.sleep(1000);
            System.out.println("Task");
        }
        catch(InterruptedException e)
        {
            System.out.println("Exception Handled "+e);

        }

        System.out.println("Thread is Running...");
    }

    public static void main(String[] args)
    {
        ThreadInterEx t1 = new ThreadInterEx();
        t1.start();
        t1.interrupt();

       
    }
    
}

    

