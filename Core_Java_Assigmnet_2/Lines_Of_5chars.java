//35. Write a program to display lines that contains more than 5 characters.
package Core_Java_Questions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lines_Of_5chars 
{
    public static void main(String[] args) 
    {
        try(FileReader fr=new FileReader("/home/madhuri/Documents/Workspace/Core_Java_Questions/names.txt");
        BufferedReader br=new BufferedReader(fr))
        {
            String line;
            int ch;
         while((line=br.readLine())!=null)
         {
            
            if(line.length()>5)
            {
                System.out.println(line);
            }
         }
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
