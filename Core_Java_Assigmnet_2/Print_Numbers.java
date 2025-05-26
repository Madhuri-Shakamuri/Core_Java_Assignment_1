//1. Write a program to print numbers from 10 to 1.
package Core_Java_Questions;
import java.util.Scanner;
public class Print_Numbers 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter starting and end number to print:");
        int start=sc.nextInt();
        int end=sc.nextInt();
       for(int i=start;i>=end;i--)
       {
        System.out.print(i+" ");
       } 
    }
}
