//19. Write a program to create an array of 10 elements, fill it with random no's and display array elements which are greater than average of array.
package Core_Java_Questions;
import java.lang.Math;
import java.util.Arrays;

public class Average_Of_Array 
{
    public static void main(String[] args) 
    {
      
        int[] arr=new int[10];
        System.out.println("Elements are entered by JVM randomly: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=(int)(Math.random()*100);
            System.out.println(arr[i]);
        }
        int avg=0,sum=0;
        for(int i:arr)
        {
            sum+=i;
            avg=sum/arr.length;
            
        }
        System.out.println("Average : "+avg);
        System.out.println("Elements which are greater than the avg of elements: ");
        for(int i:arr)
        {
            if(i>avg)
            {
                System.out.println(i+" ");
            }
        }
        System.out.println(Arrays.toString(arr));
       
        
    }
    
}
