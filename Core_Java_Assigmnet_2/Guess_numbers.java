//18. Write a program to guess the random number in three attempts. The range is (1 to 25).

package Core_Java_Questions;

import java.util.Scanner;
import java.lang.Math;
public class Guess_numbers
{
    
    public static void main(String[] args) 
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Guess the number between 1 to 25 in 3 attempts: "); 
      int num=(int)Math.random();
      
       int input=sc.nextInt();
       
       if(num==input)
       {
        System.out.println("Congratulations! Your guess is correct");
        
       } 
       else 
       System.out.println("Wrong number ! Try again");   

       
      

    }
    
}
