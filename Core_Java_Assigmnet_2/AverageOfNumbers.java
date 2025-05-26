//5. Write a program to accept five numbers from the user and display the average of numbers.
package Core_Java_Questions;
import java.util.Scanner;;
public class AverageOfNumbers 
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
      int sum=0;
      for(int i:arr)
      {
        sum+=i;
      }
      System.out.println("Average = "+(sum/arr.length));
    }
}
