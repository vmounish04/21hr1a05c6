// Shutdown hook anoanymous class

public class ShutdownHook {
    public static void main(String[] args) throws Exception
    {
        Runtime r = Runtime.getRuntime();
        r.addShutdownHook(
            new Thread()
            {
                public void run()
                {
                    System.out.println("shut Down hook task Completed");
                }//run()
            }

        );

        System.out.println("Now main sleeping... press ctrl+c to exit");
        try{
            Thread.sleep(3000);
        }
        catch(Exception e)
        {

        }

    }

    
}
