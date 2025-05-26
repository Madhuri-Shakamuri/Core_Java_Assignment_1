//40. Write a program to assume names1.txt & names2.txt where we have one name for line & display unique names from both the files in the order they appear.
package Core_Java_Questions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

public class Display_Uniquenames_2files 
{
    public static void main(String[] args) 
    {
        Set<String> names=new LinkedHashSet();
        String f1_path="/home/madhuri/Documents/Workspace/Core_Java_Questions/names1.txt";
        String f2_path="/home/madhuri/Documents/Workspace/Core_Java_Questions/names2.txt";
        read_and_store(f1_path,names);
        read_and_store(f2_path,names);     
        for(String name:names)
        {
            System.out.println(name);
        }

    }
    public static void read_and_store(String file,Set<String> names)
    {
       
        try(FileReader fr=new FileReader(file);
        BufferedReader br=new BufferedReader(fr))
        {
        String line;
        while((line=br.readLine())!=null )
        {
            names.add(line);
        }
        
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
