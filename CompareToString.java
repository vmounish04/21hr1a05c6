public class CompareToString {
    
    public static void main(String[] args)
    {
        String s1 = "Mounish";

        String s2 = "Mounish";

        String s3 ="V Mounish";

        System.out.println(s1.compareTo(s2)); //0  s1=s2
        System.out.println(s1.compareTo(s3)); //1   s1>s3  (if s1<s3  then -1)

    }
}
