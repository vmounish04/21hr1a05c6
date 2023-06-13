public class AliveThread extends Thread{
     public static int amount=0;

    public static void main(String[] args)
    {
        AliveThread thread = new AliveThread();
        thread.start();
        while(thread.isAlive())
        {
            System.out.println("Waiting....");
        }
        System.out.println("Main :"+amount);
        amount++;
        System.out.println("Main :"+amount);
    }



    public void run(){
        amount++;

    }
    
}
