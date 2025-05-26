//2. Write a program to print all even numbers between 1 to 50.

package Core_Java_Questions;
import java.util.Scanner;
public class Even_Numbers 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a range: ");
        int start=sc.nextInt();
        int end= sc.nextInt();
        System.out.println("Even numbers between "+start+" and "+end+": ");
       for(int i=start+1;i<end;i++) 
       {
        if(i%2==0)
        {
            System.out.print(i+" ");
        }
       }
    }
    
}
