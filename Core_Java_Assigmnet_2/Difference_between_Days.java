/* 26. Write a program to accept starting_date and ending_date in DD-MM-YYYY format 
and display no of days between those two dates.*/
package Core_Java_Questions;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Difference_between_Days 
{
public static void main(String[] args) 
{

    Scanner sc=new Scanner(System.in);
    DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
    System.out.println("Enter two dates in DD-MM-YYYY format : ");
    String d1=sc.nextLine();
    String d2=sc.nextLine();
    LocalDate starting_date=LocalDate.parse(d1,formatter);
    LocalDate ending_date=LocalDate.parse(d2,formatter);
    long no_of_days=ChronoUnit.DAYS.between(starting_date,ending_date);
    System.out.println(no_of_days);
}
    
}
