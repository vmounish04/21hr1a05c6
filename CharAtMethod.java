public class CharAtMethod {
    public static void main(String[] args){
        String str ="Welcome to Java training";

        int length = str.length();
        System.out.println("Character at 0 index is "+str.charAt(0));
        System.out.println("Character at last index "+str.charAt(length-1));

        System.out.println();

        for(int i=0;i<=str.length()-1;i++)
        {
            if (i%2!=0)  //odd index  (i%2==0 for even index)
            {
                System.out.println("Char at "+i+" place is "+str.charAt(i));

            }

        }

    }
    
}
