import java.util.StringTokenizer;

public class StringTokens {
    public static void main(String[] args)
    {
        StringTokenizer st = new StringTokenizer("My name is V mounish");
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());

        }

    }
    
}
