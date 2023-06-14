import java.util.*;


public class TokensEX {
    public static void main(String[] args)
    {
        StringTokenizer st = new StringTokenizer("My,name,is,v,mounish");

        //printing next token

        System.out.println("Next token is :"+st.nextToken(","));
        System.out.println("Next token is :"+st.nextToken(","));
        System.out.println("Next token is :"+st.nextToken(","));
        System.out.println("Next token is :"+st.nextToken(","));
        System.out.println("Next token is :"+st.nextToken(","));

    }
    
}
