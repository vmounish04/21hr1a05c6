import java.util.*;
import java.lang.*;

public class MathPack {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();
        //double area = Math.PI*radius*radius;
        double area = Math.PI*Math.pow(radius,2);

        System.out.println(area);

    }

    
}
