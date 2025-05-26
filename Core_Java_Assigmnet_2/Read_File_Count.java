//34. Write a program to accept a filename from the user and display how many uppercase, lowercase and digits the file has.
package Core_Java_Questions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Read_File_Count 
{
    public static void main(String[] args) 
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the File name : ");
     String file_path=sc.nextLine();
     int UC=0,LC=0,digit=0;
     try(FileReader fr=new FileReader(file_path);
     BufferedReader br=new BufferedReader(fr))
     {
        int ch;
     while((ch=fr.read())!=-1)
     {
        if(Character.isUpperCase((char)ch))
        {
            UC++;
        }
        else if(Character.isLowerCase((char)ch))
        {
            LC++;
        }
        else if(Character.isDigit((char)ch))
        {
         digit++;
        }
        
     }
     
     }
     catch(IOException e)
     {
        System.out.println(e.getMessage());
     }
       System.out.println("Upper Case : "+UC+"\nLower Case : "+LC+"\nDigits : "+digit);
    }
    
}
