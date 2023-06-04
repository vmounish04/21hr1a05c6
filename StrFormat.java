public class StrFormat {
    public static void main(String[] args) {
        String s1 = new String("Hello");

        String s2 = new String ("world");

        String s3 = new String("java");

        String sf = String.format("%s %s",s1,s2);
        System.out.println(sf.toString());

        String sj = String.join(",",s1,s2,s3);
        System.out.println(sj.toString());





    }
    
}
