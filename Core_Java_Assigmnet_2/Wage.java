/*4. Write a program to accept the day of a week and the number of hours worked and calculate the wage.
Conditions:
     1,2,3 —>  Rs200/ hour
        4,5  —> Rs400 / hour
           6  —> Rs600 / hour
           7  —> Rs800 / hour
        1 to 7 is Monday to Friday.
If the total amount exceeds Rs2000 then there will be a bonus of 10%.  (Use Switch Expression) */

package Core_Java_Questions;
import java.util.Scanner;
public class Wage 
{
   public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day: ");
        int day=sc.nextInt();
        System.out.println("Enter the no of hours: ");
        int hours=sc.nextInt();
        int wage=0;
        switch (day) {
            case 1:case 2:case 3:
                 wage=hours*200;
                break;
            case 4:case 5:
                 wage=hours*400;
                 break;
            case 6:
                 wage=hours*600;
                 break;
            case 7:
                  wage=hours*800;
                  break;
            default:
                 System.out.println("Invalid Input");
        }
        if(wage<2000)
        {
            System.out.println("Wage: "+wage);
        }
        else 
        {
            
            double totalwage=0.1 * wage+wage;
            System.out.println("Totalwage with bonus: "+(int)totalwage);

        }
   }

}
