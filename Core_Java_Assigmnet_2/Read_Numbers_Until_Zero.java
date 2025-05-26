package Core_Java_Questions;

import java.util.Scanner;

public class Read_Numbers_Until_Zero 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        while(true)
        {
            String s=sc.nextLine();
            if(s.equalsIgnoreCase("O"))
            {
            break;
            }
            else 
            {
                int i=Integer.parseInt(s);
               
            }
        }
        
    }
    
}
