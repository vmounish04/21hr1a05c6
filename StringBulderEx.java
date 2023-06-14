public class StringBulderEx {
    public static void main(String[] args)
    {
        StringBuilder sb=new StringBuilder("Hello ");
        sb.append("Java");// now original string is changed
        System.out.println(sb);//prints Hello java

        sb.insert(2,"(world)");
        System.out.println(sb);

        sb.replace(2,9,"king");
        System.out.println(sb);

        sb.delete(2,6);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        

    }
    
}
