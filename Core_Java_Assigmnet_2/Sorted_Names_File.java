/*48. Assume a txt file customers.txt which contains name & mobile no and
 you need to display in sorted order of name.(Use regular expression) */  
package Core_Java_Questions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;
import java.util.regex.Pattern;
import java.util.Set;

public class Sorted_Names_File 
{
    public static void main(String[] args) 
    {
        Set<String> names=new TreeSet<>();
        try(FileReader fr=new FileReader("/home/madhuri/Documents/Workspace/Core_Java_Questions/customers.txt");
        BufferedReader br=new BufferedReader(fr))
        {
         String line;
         String[] arr;
         while((line=br.readLine())!=null)
         {
           arr=line.split(" ");
           if(arr.length>0)
           {
            names.add(arr[0]);
           }
          
         }
         for(String name:names)
         {
            System.out.println(name);
         }
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    
    }
    
}
