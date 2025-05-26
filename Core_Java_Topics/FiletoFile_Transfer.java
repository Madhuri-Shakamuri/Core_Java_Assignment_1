package Core_Java_Topics;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class FiletoFile_Transfer
{
    public static void main(String[] args) 
    {
        try
        {
            File f=new File("new-file.txt");
         f.createNewFile();
         /*if(f.delete())
         {
            System.out.println(f.getName());
         } */
         
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        try(FileWriter fw=new FileWriter("new-file.txt"))
        {
            fw.write("Radhe radheee");
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        try(FileReader fr=new FileReader("/home/madhuri/Documents/Workspace/duke/file1.txt");
        
            BufferedReader br=new BufferedReader(fr);
            FileWriter fw=new FileWriter("/home/madhuri/Documents/Workspace/duke/file2.txt"))
            
            {
            
             /*   String line;
            
                while((line=br.readLine())!=null)
                {

                  fw.write(line+"\n");
                }
            
              }
    */
        fw.write(br.readLine()); 
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
