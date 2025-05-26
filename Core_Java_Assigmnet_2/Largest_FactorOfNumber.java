//6. Write a program to accept the number and display the largest factor other than the number.
package Core_Java_Questions;

import java.util.Scanner;

public class Largest_FactorOfNumber 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        int fact=0;
        for(int i=1;i<=num/2;i++)
        {
            if(num%i==0)
            {
                fact=i;
            }
        }
        System.out.println("Largest Factor: "+fact);
    }
    
}
