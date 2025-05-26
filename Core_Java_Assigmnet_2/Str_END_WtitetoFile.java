//33. Write a program to accept names from users until 'END' is given and write them into names.txt as one name for the line.
package Core_Java_Questions;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Str_END_WtitetoFile 
{
     public static void main(String[] args) 
     {
            
            try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                 FileWriter fw = new FileWriter("/home/madhuri/Documents/Workspace/Core_Java_Questions/names.txt")) {
                 
                String line;
               
                
                while ((line = br.readLine()) != null) 
                {
                    if (line.equalsIgnoreCase("END")) {
                        break; 
                    }
                    // Write the name to the file, followed by a newline character.
                    fw.write(line+"\n");
                }
                
            } catch (IOException e) 
            {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }
      

