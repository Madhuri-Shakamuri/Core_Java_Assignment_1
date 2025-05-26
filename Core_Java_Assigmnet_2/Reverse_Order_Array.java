//8. Write a program to create an array of 5 elements and store values into it by taking them from the keyboard and display them in reverse order.


package Core_Java_Questions;

import java.util.Scanner;

public class Reverse_Order_Array
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Reverse of an Array: ");
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
