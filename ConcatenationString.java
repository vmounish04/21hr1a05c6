public class ConcatenationString {
    public static void main(String[] args)
    {
        String m = "M S "+"Dhoni";

        System.out.println(m);
        
        String s = 30+40+"Mounish"+40+40;  //30+40=80, 80+Mounish=80Mounish , 80Mounish+40=80mounish40 ,80mounish40+40=80mounish4040
        String s1 = "mounish"+100+"king";  // mounish+100 = mounish100, mounish100+king=mounish100king
        String s2 = "mounish100"+20+20+40+"king"; // mounish100+20 = mounish10020 , mounish10020+20=mounish1002020 ,mounish1002020+40=mounish100202040 , mounish100202040 +king = mounish100202040king

        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);

    }
    
}
