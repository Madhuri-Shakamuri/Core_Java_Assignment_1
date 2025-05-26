package Core_Java_Topics;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Streams 
{
    public static void main(String[] args) 
    {
      System.out.println("INPUT : reading from the stream");
     /*  //INPUT
     
     try (InputStreamReader isr=new InputStreamReader(System.in))
     {
                                                                            //taking byte stream and convert into char stream
         System.out.println("Enter letters : ");
         int letters; //int letters=isr.read();                             takes char and returns ascii value of char 
         while ((letters=isr.read())!=-1)                                   //while(isr.ready())
         {
            System.out.println((char)letters); 
            System.out.println(letters);                                     //letters=isr.read();
            
         }
         

     }
     catch (IOException e)
     {
        System.out.println(e.getMessage());
     } 


     try (FileReader fr=new FileReader("/home/madhuri/Documents/Workspace/duke/file1.txt"))
     {
          
         System.out.println("Enter letters : ");
         int letters=fr.read(); 
         while (fr.ready())  
         {
            System.out.println((char)letters); 
            letters=fr.read();         
            
         }
         

     }
     catch (IOException e)
     {
        System.out.println(e.getMessage());
     } 
     //byte to char and reading char by bufferedreader
      try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))) 
     {
        
         System.out.println("Just you typed : "+br.readLine()); // reads a line of text
        
     }
     catch(IOException e)
     {
      System.out.println(e.getMessage());
     }
     try(BufferedReader bf=new BufferedReader(new FileReader("/home/madhuri/Documents/Workspace/duke/file1.txt"))) 
     {
        while (bf.ready()) 
        {
         System.out.println("Just you typed : "+bf.readLine()); // reads a line of text
        }
     }
     catch(IOException e)
     {
      System.out.println(e.getMessage());
     }

     System.out.println("OUPUT : writing to the stream");

     //OUTPUT
     //convert char to byte stream before writing console
     try(OutputStreamWriter osr=new OutputStreamWriter(System.out)) 
     {
      osr.write("Hello world");
      osr.write('A');
      osr.write(10); // \n - asii
      osr.write(97);  // a
      osr.write('\n');
      char[] ch="character array gets writed".toCharArray();
      osr.write(ch);

     }
     catch(IOException e)
     {
      System.out.println(e.getMessage());
     }
*/
// will not be ovvrided just appended it to the original
  //try(FileWriter fw=new FileWriter("/home/madhuri/Documents/Workspace/duke/file1.txt",true))
     try(FileWriter fw=new FileWriter("/home/madhuri/Documents/Workspace/duke/file1.txt"))
     {
      fw.write("Hello world original file is overided"); 
      

     }
     catch(IOException e)
     {
      System.out.println(e.getMessage());
     }
     try(BufferedWriter bw=new BufferedWriter(new FileWriter("/home/madhuri/Documents/Workspace/duke/file1.txt")))
     {
      bw.write("Hare Krishna.."); 
     }
     catch(IOException e)
     {
      System.out.println(e.getMessage());
     }
     
     

   } 

}

