package Core_Java_Topics;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Word_Count 
{
    public static void main(String[] args) 
    {
        try
        {
        FileReader fr=new FileReader("/home/madhuri/Documents/Workspace/duke/file1.txt");
        BufferedReader br=new BufferedReader(fr);
        String line;
        String[] arr;
        int count=0;
        while((line=br.readLine())!=null)
        {
         arr=line.trim().split(" ");
         count+=arr.length;
        }
        System.out.println("Word Count: "+count);
        }

        catch(IOException e)
        {
            System.out.println(e.getMessage());
        } 
        /* for string 
        Scanner sc=new Scanner(System.in);
        String line=sc.nextLine();
        sc.close();
        String[] arr ;
        int count=0,i=0;
        arr=line.trim().split(" ");
        count+=arr.length;

        System.out.println(count);
         */
    }  
    
}
