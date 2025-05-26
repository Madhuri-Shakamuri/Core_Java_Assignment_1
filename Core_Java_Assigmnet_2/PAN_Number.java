//43. Write a program to accept pan no and check whether it is valid or not.
package Core_Java_Questions;

import java.util.Scanner;
public class PAN_Number 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your PAN card number: ");
        String pan = scanner.nextLine().trim();
        
    
        String panRegex = "[A-Z]{5}[0-9]{4}[A-Z]";
        
        if (pan.matches(panRegex)) {
            System.out.println("Valid PAN card number");
        } else {
            System.out.println("Invalid PAN card number");
        }
        
        scanner.close();
    }
}

    
