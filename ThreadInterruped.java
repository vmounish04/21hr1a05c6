public class ThreadInterruped extends Thread{
    public void run()

    {
        try{
            Thread.sleep(1000);
            System.out.println("Task");
        }
        catch(InterruptedException e)
        {
            throw new RuntimeException("Thread interrupted..."+e);

        }
    }

    public static void main(String[] args)
    {
        ThreadInterruped t1 = new ThreadInterruped();
        t1.start();

        try{
            t1.interrupt();
        }
        catch(Exception e)
        {
            System.out.println("Exception handeled"+e);
        }
    }
    
}
