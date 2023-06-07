public class WrapperClassEx {

    public static void main(String[] args)
    {
        byte b= 10;

        short s =20;

        int i = 50;

        long l =12345667L;

        float f =10.5F; //or 10.5f;
        double d =120.345D;  //or 120.34d;
   
        boolean bol = true;
        char ch ='a';


        System.out.printf("%d %d %d %d\n %f %f \n %b \n %c\n\n",b,s,i,l,f,d,b,ch);

        //AutoBoxing primitives into objects
        // converting: primitives into objects
        Byte byteobj = b;           //objects = primitives
        Short shortobj = s;
        Integer intobj = i;
        Long longobj =l;
        Float floatobj = f;
        Double doubleobj = d;
        Boolean booleanobj = bol;
        Character charobj = ch;

        System.out.println("\t Converting Primitives Into Objects \t\n");
        System.out.println("Byte Object :"+byteobj);
        System.out.println("Short Object :"+shortobj);
        System.out.println("Integer Object"+intobj);
        System.out.println("Long Object:"+longobj);
        System.out.println("Float Object :"+floatobj);
        System.out.println("Double Object :"+doubleobj);
        System.out.println("Boolean Object :"+booleanobj);
        System.out.println("Character Object :"+charobj);


        //Unboxing :Converting Objects to Primitives

        byte b1 =byteobj;          //primitives = objects
        short s1 = shortobj;
        int i1 = intobj;
        long l1 = longobj; 
        float f1 = floatobj;
        double d1=doubleobj;
        boolean bol1 = booleanobj;
        char ch1 = charobj;

        System.out.println("\n\t Converting Object into Primitives \t \n");
        System.out.println("byte value :"+b1);
        System.out.println("short value :"+s1);
        System.out.println("int value"+i1);
        System.out.println("long value:"+l1);
        System.out.println("float value :"+f1);
        System.out.println("double value :"+d1);
        System.out.println("boolean value :"+bol1);
        System.out.println("char value :"+ch1);




    }
    
}
