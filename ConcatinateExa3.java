public class ConcatinateExa3 {

    public static void main(String[] args) {
        String st1="Hello";
        String st2 ="java";
        String st3 ="Reader";


        String st4 = st1.concat(" ").concat(st2).concat(" ").concat(st3);

        System.out.println(st4);

        String st5 = st1.concat("!!!");

        System.out.println(st5);

        String st6 = st1.concat("@").concat(st2);

        System.out.println(st6);

    }
    
}
