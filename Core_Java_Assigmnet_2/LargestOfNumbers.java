//9. Write a program to create a function that takes a set of integers and returns the largest of integers.

package Core_Java_Questions;

import java.util.Scanner;

public class LargestOfNumbers 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int large=largest(31,22,298,67,32,88,22,99);
        System.out.println("Largest is: "+large);
    }
    public static int largest(int... arr)
    {
        int large=arr[0];
        for(int i:arr)
        {
            if(i>large)
            {
                large=i;
            }
        }
      return large; 
    }
    {

    }
    
}
