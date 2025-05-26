//21. Write a program to accept a string that contains marks separated by commas and display total.
package Core_Java_Questions;
import java.util.Scanner;

public class String_Total_Marks 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Elements seperated by , : ");
        String s=sc.nextLine();
        String[] arr=s.split(",");
        int total=0;
        for(int i=0;i<arr.length;i++)
        {
           total+=Integer.parseInt(arr[i]); 
        }
        System.out.println("Total Marks : "+total);
        
        
    }
}

