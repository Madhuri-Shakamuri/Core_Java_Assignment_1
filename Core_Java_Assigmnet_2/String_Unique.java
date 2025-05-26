//39. Write a program to take names from names.txt & display unique names in sorted order.
package Core_Java_Questions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;
import java.util.Set;
import java.util.Collections;


public class String_Unique 
{
    public static void main(String[] args) 
    {
      Set<String> s=new TreeSet<>();
        
        try(BufferedReader br=new BufferedReader(new FileReader("/home/madhuri/Documents/Workspace/Core_Java_Questions/names.txt")))
        {
            String line;
            while((line=br.readLine())!=null)
            {
               s.add(line.trim());
            }
            
            System.out.println("Unique names in a sorted format : ");
           for(String val:s)
           {
            System.out.println(val+"\n");
           }
        }
        
        
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
