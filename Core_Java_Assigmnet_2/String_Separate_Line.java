//44. Write a program to accept a string & display each word on a separate line (use any separator)
package Core_Java_Questions;

import java.util.Scanner;

public class String_Separate_Line 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str=sc.nextLine();
        String[] arr=str.split(" ");
        for(String word:arr)
        {
            System.out.println(word);
        }    
    }
    
}
