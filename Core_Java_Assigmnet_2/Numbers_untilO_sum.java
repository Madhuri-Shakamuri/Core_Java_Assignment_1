//32. Write a program to accept some numbers from the user until 'O' and display the sum of +ve numbers.
package Core_Java_Questions;
import java.io.StringReader;
import java.util.Scanner;

import Core_Java_Topics.Stringbuffer;

public class Numbers_untilO_sum 
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      StringBuilder sb=new StringBuilder();  //  BufferedReader can also be used 
      System.out.println("Enter numbers until O : ");
      while(true)
      {
        String str=sc.nextLine();
        if(str.equalsIgnoreCase("o"))
        {
            break;
        }
        else 
        {
         sb.append(str);
        }

      }  
      int sum=0;
      for(int i=0;i<sb.length();i++)
      {
        char ch=sb.charAt(i);
        if(Character.isDigit(ch))
        {
          sum+= Integer.parseInt(String.valueOf(ch));
         
        }
      }
      System.out.println("Sum : "+sum);
    }
    
}
