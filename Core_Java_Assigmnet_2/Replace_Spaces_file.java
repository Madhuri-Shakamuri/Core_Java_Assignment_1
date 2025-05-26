//45. Write a program to accept a file and replace one (or) more spaces with a single space.

package Core_Java_Questions;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Replace_Spaces_file 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the file path : ");
        String file_path=sc.nextLine();
        File input_file=new File(file_path);
        File temp_file=new File("/home/madhuri/Documents/Workspace/Core_Java_Questions/temp_space.txt");
    try(FileReader fr=new FileReader(file_path);
    FileWriter fw=new FileWriter("/home/madhuri/Documents/Workspace/Core_Java_Questions/temp_space.txt");
    BufferedReader br=new BufferedReader(fr))
    {
      String line;
      while ((line=br.readLine())!=null) 
      {
        String cleaned_line=line.replaceAll("\\s+"," ");
        fw.write(cleaned_line+"\n");
      }
      
    }
    catch(IOException e)
    {
        System.out.println(e.getMessage());
    }
    if(input_file.delete() && temp_file.renameTo(input_file))  //renamed  and replaced to original file
   {

   }
    }
    
}
