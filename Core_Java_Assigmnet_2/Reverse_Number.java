//7. Write a program to accept the number and display the number in reverse order.
package Core_Java_Questions;

import java.util.Scanner;

public class Reverse_Number
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int rem=0,sum=0;
        while(n>0)
        {
            rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        System.out.println("Reverse of "+n+": "+sum);
    }
    
}
