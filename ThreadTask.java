 class ThreadTask extends Thread{

    String threadName="";
    public ThreadTask(String name )
    {
        threadName=name;

    }
    public void run()
    {
        if(Thread.currentThread().isDaemon());
        {
            System.out.println(threadName+"is Daemon Thread");
        }
      //else 
        {
            System.out.println(threadName +"is User Thread");
        }

    }
    public static void main(String[] args)
    {
        ThreadTask t1 = new ThreadTask("thread1");
        ThreadTask t2 = new ThreadTask("thread2");
     //Making t1 as Daemon 
        t1.setDaemon(true);
        t1.start();
        t2.start();
    }
    
}
