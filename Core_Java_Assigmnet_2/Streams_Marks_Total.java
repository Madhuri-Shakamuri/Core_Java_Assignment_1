//36. File Marks.txt, which have marks separated by comma in different lines.Find the total marks of each line and display them.(Use fault tolerance)
package Core_Java_Questions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Streams_Marks_Total 
{
    public static void main(String[] args) 
    {
        try(FileReader fr=new FileReader("/home/madhuri/Documents/Workspace/Core_Java_Questions/Marks.txt");
        BufferedReader br=new BufferedReader(fr))
        {
            String line="";
            int total=0;
           
             while((line=br.readLine())!=null)
             {
                String[] str=line.split(",");
                for(String mark:str)
                {
                  total+=Integer.parseInt(mark);
                }
             }
             System.out.println("Total Marks : "+total);
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
       
    }
    
}
