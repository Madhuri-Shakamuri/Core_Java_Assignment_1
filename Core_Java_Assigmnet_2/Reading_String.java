//20. Write a program to accept a string from the user and display it vertically. use nextLine() to read a string from the user.
package Core_Java_Questions;

import java.util.Scanner;

public class Reading_String 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str=sc.nextLine();
        System.out.println("Displaying the String Vertically : ");
        for(int i=0;i<str.length();i++)
        {
          System.out.println(str.charAt(i));
        }
        
    }
    
}
