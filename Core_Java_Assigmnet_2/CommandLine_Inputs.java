//11. Write a program to consider command line arguments num, length as inputs (where length is optional) if you won't get that use default number as length.
package Core_Java_Questions;

public class CommandLine_Inputs
{
    public static void main(String[] args) 
    {
        int num=Integer.parseInt(args[0]);
        int len=Integer.parseInt(args[1]);
        System.out.println("Number: "+num+"\nLength: "+len);
        
    }
    
}
 