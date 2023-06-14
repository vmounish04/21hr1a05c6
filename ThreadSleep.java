class ChildThread extends Thread{
    public void run()
    {
        for(int i=1;i<=4;i++)
        {
            try{
                Thread.sleep(500);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }

            System.out.println("Children Thread execution -"+i);
        }
    }
}

public class ThreadSleep{

    public static void main(String[] args) throws Exception
    {
        ChildThread th1 = new ChildThread();
        // starting the child Thread
        th1.start();
        //main thread joining the child Thread
        th1.join();
        //main thread printing statements 

        System.out.println("Main Thread Completed");

    }

    
}
