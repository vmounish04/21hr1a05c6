// java program to check if a given string is a valid integer 
import java.util.*;
import java.io.*;

public class StringValiInteger {

    static boolean isNUmber(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i))==false)
            {
                return false;
            }

            
        }

        return true;

    }
     static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.next();
// Function returns 1 if all elements  Are in range '0-9'
        if(isNUmber(str))
        {
            System.out.println("Integer");
        }
// Function returns 0 is it is not an integer 
       else
       {
        System.out.println("String");
       }

    }
    
}
