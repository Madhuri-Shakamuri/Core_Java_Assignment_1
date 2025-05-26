//23. Write a program to take a String and invert the case of characters.
package Core_Java_Questions;

import java.util.Scanner;

public class String_Inversion 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String : ");
        String s=sc.nextLine();
        StringBuffer sb=new StringBuffer();
        sb.append(s);
        for(int i=0;i<sb.length();i++)
        {
            char ch=sb.charAt(i);
            if(Character.isUpperCase(ch))
            {
             sb.setCharAt(i, Character.toLowerCase(ch));   
            }
            else if(Character.isLowerCase(ch))
            {
                sb.setCharAt(i, Character.toUpperCase(ch)); 
            }
        }
        System.out.println(sb.toString());


    }
    
}
