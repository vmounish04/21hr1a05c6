import java.util.StringTokenizer;

public class MoreTokens {
    public static void main(String[] args)
    {
        //StingTokenizer object
        StringTokenizer st = new StringTokenizer("Demonstrating methods from StringTokenzier class");

        while(st.hasMoreTokens())
    {
        System.out.println(st.nextToken());
    }
    
    }

    
    
}
