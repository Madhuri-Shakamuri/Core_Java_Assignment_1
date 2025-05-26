//25. Write a program to accept names until the END is given and display all the names separated by '-'.
package Core_Java_Questions;
import java.util.Scanner;
import java.util.StringJoiner;

public class String_Until_END_Delimiter 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter names until END : ");
        StringJoiner sb=new StringJoiner("-");
        while(true)
        {
            String str=sc.nextLine();
            if(str.equalsIgnoreCase("END"))
            {
              break;
            }
            else 
            {
                sb.add(str);
            }

        }
        System.out.println(sb);
        
    }
    
}
