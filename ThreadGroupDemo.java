public class ThreadGroupDemo implements Runnable{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());

    }
    public static void main(String[] args)
    {
        ThreadGroupDemo runnable = new ThreadGroupDemo();

        ThreadGroup tg = new ThreadGroup("parent  Thread Group");

        Thread t1=new Thread(tg,runnable,"one");
        t1.start();

        Thread t2 = new Thread(tg,runnable,"Two");
        t2.start();
        
        Thread t3 = new Thread(tg,runnable,"Three");
        t3.start();

        System.out.println("Thread group name :"+tg.getName());
        tg.list();
    }
    
}
