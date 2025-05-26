//22. Write a program to accept a string and display the position of space for all spaces.
package Core_Java_Questions;

import java.util.Scanner;

public class String_Spaces 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                System.out.println((i+1));
            }
        }

    }
    
}
