//3. Write a program to print a table for number 15 with length 10.(use printf)

package Core_Java_Questions;
import java.util.Scanner;
public class Table_number 
{
public static void main(String[] args) 
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a table number: ");
    int num=sc.nextInt();
    for(int i=1;i<=10;i++)
    {
        System.out.printf("%d * %d = %d\n",num,i,i*num); 
    }
}
    
}
