public class TestDeadLock {
    public static void main(String[] args)
    {
        final String resource1 = "Mounish";
        final String resource2="King";
        //t1 tres to lock resource then resource2
        Thread t1= new Thread()
        {
            public void run()
            {
                synchronized(resource1)
                {
                    System.out.println("Thread 1 : locked resource 1");
                    try{
                        Thread.sleep(100);

                    }
                    catch(Exception e)
                    {

                    }
                    synchronized(resource2)
                    {
                        System.out.println("Thread 1 : locked resource 2");
                    }

                    
                }// synchronized resource
                
            }// public void run()
        };
    }// main
    
}// class
