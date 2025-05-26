//29. Accept five strings which contain numbers and display the total for those numbers. Make your program fault tolerant.
package Core_Java_Questions;

import java.util.Scanner;

public class String_Totalnumbers 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 strings that contain numbers :");
        StringBuilder str = new StringBuilder();
        for(int i=0;i<5;i++)
        {
          str.append(sc.nextLine()); 

        }
        
        int total=0;
        
        for(int i=0;i<str.length();i++)
        {
          char ch=str.charAt(i);
          if(Character.isDigit(ch))
          {
            total+= Integer.parseInt(String.valueOf(ch));
            //total+=Character.getNumericValue(ch); 
          }
        }
        System.out.println("Total : "+total);
    }
}
