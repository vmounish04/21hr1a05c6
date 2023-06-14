import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Worker implements Runnable{
    private String message;
    public Worker(String s)
    {
        this.message=s;

    }
    public void run()
    {
        System.out.println(Thread.currentThread().getName()+"(Start) message ="+message);
         processmessage();//call processmessage Method that sleeps the thread
         System.out.println(Thread.currentThread().getName()+"(End)");
    
    }
    private void processmessage()
    {
        try{
            Thread.sleep(2000);

        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }



   


}

public class WorkerThradEx {
    public static void main(String[] args)
    {
        ExecutorService executor = Executors.newFixedThreadPool(5);// creat

        for(int i=0;i<10;i++)
        {
            Runnable worker = new Worker(""+i);
            executor.execute(worker);//calling execute method


        }
        executor.shutdown();
        while(!executor.isTerminated())
        {

        }
        System.out.println("Fineshed all Threads ");

    }
    
}
