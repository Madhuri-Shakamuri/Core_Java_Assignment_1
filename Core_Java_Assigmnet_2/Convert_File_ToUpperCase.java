//38. Write a program to accept a file and convert its contents to uppercase.(write in compact way)
package Core_Java_Questions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Convert_File_ToUpperCase 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the file path : ");
        String file_path=sc.nextLine();
        File inputFile = new File(file_path);
        File temp_file=new File("temp.txt");
        
        sc.close();
        try(FileReader fr=new FileReader(file_path);
        BufferedReader br=new BufferedReader(fr);
        FileWriter fw=new FileWriter("/home/madhuri/Documents/Workspace/Core_Java_Questions/temp.txt"))
        {
          
          String line;
          while((line=br.readLine())!=null)
          {
            fw.write(line.toUpperCase()+"\n");
          }
     
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        if(inputFile.delete() && temp_file.renameTo(inputFile))
        {
            System.out.println("You successfully deleted original and deleted it");
        }
    }
}
