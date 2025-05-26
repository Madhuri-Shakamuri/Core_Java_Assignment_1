/*
    Problem 47 : Write a program to display the file which contains the given string in a path.
*/
package Core_Java_Questions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DisplayFiles_ContainsGivenString 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the path of Directory to be searched : ");
        String directory_Path=sc.nextLine();
        System.out.println("Enter the String to be serached : ");
        String str=sc.nextLine();
        
        if(read_Find(directory_Path,str))
            
          System.out.println("String existed in : "+directory_Path);
        
          else 
          System.out.println("String does not exists in this file.");
        

    }
    public static boolean read_Find(String file,String str)
    {
        try(FileReader fr=new FileReader(file);
        BufferedReader br=new BufferedReader(fr))
        {
        String line;
         while((line=br.readLine())!=null)
         {
          if(line.equalsIgnoreCase(str))
          {
            return true;
          }
         }
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }  
        return false;

    }
}
