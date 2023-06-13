class Second implements Runnable
{
    Thread t;
    String S;
    Second(String Name)
    {
        S=Name;
        t=new Thread(this,S);
        System.out.println("CHILD :"+t);
        t.start();
    }
    public void main()
    {
        try{
            for(int i=5;i>0;i--)
            {
                System.out.println(S+":"+i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {

        }
        System.out.println("EXICTING"+S);
    }
}

public class ThreadRunnableEx {
    public static void main(String[] args) 
    {
        
        new Second("ONE");
        new Second("TWO");
        new Second("THREE");

        try{
            for(int i=5;i>0;i++)
            {
                System.out.println("MAIN :"+i);
            Thread.sleep(20000);
            }

        }
        catch(InterruptedException e)
        {

        }

        System.out.println("EXCTING MAIN");
    }
    
}
