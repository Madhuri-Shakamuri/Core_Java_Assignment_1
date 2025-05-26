//37. Write 20 marks into Marks.data.
package Core_Java_Questions;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Read_MarkstoFile 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter 20 Marks : ");
        try(FileWriter fw=new FileWriter("/home/madhuri/Documents/Workspace/Core_Java_Questions/Marks.data");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))
        {
            String line;
            int i=0;
            while((line=br.readLine())!=null && i<20)
            {
             
             fw.write(line+"\n");
             i++;
            }
           

        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
