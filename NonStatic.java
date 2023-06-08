//The static method can not be use non static data member or call non-static 

public class NonStatic {
    //int a =40;  // non static or Instance variable //Error

    static int a =40; // static variable

    public static void main(String[] args) {
        System.out.println(a); // error
    }


}
