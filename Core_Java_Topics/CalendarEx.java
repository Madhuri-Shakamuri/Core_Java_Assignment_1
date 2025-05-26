package Core_Java_Topics;

import java.util.Date;
import java.time.*;
import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Calendar;

public class CalendarEx 
{
    public static void main(String[] args) 
    {
        /* 
        Calendar c=Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        
        c.add(Calendar.MONTH,10);
        System.out.println("...................................");
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        c.setTime(new Date()); 
        System.out.println(c.getTime());
        c.set(2026,9,31); // 9 october jan-0 .......
        System.out.println(c.getTime());

        System.out.println("................................................................");
        Calendar c1=Calendar.getInstance(); //static method
        System.out.println(c1);
        System.out.println(c1.get(Calendar.YEAR));
        System.out.println(c1.get(Calendar.MONTH+1)); //jan =0
        System.out.println(c1.get(Calendar.DATE));
        System.out.println(c1.get(Calendar.WEEK_OF_MONTH));// mar 1 -sat week-1 ,,,mar 2 sun - week2 
        System.out.println(c1.get(Calendar.HOUR_OF_DAY));
        System.out.println(c1.get(Calendar.DAY_OF_MONTH));
        System.out.println(c1.get(Calendar.DAY_OF_WEEK));


        //Day + 10
        
        c1.add(Calendar.DATE,10);
        System.out.println("Current date +10 : "+c1.getTime());
        c1.set(2025,Calendar.OCTOBER,31);
        System.out.println(c1.getTime());
        c1.set(2025,Calendar.DECEMBER,14);
        System.out.println(c1.getTime());


        Date today=c1.getTime();
        Date date=new Date(today.getTime()+24*2*60*60*1000);
        c1.setTime(date);
        System.out.println(c1.getTime());


        
          System.out.println("...................Practice.................");
        //Practice
        Calendar c=Calendar.getInstance(); //object of  Calendar -system date and  time
        System.out.println((c.get(Calendar.MONTH)+1));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        c.add(Calendar.DATE, 2);
        System.out.println(c.getTime());
        c.set(Calendar.YEAR,Calendar.OCTOBER,Calendar.DATE);
        System.out.println(c.getTime());
        Date today=c.getTime();
        Date date=new Date(today.getTime()+24*3*60*60*1000);
        c.setTime(date);
        System.out.println(c.getTime());

        Date d1=new Date();
        DateFormat df=DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println(df.format(d1));

        System.out.println(".....LOCAL DATE........");
        LocalDate todayy =LocalDate.now();
        System.out.println(todayy.getYear());

        LocalDate add_days=todayy.plusDays(10);
        LocalDate add_MOnths=todayy.plusMonths(2);
        LocalDate minusdays=todayy.minusDays(2);
        System.out.println(add_days+"     "+add_MOnths+"      "+minusdays);


        
        System.out.println("Basic programs on Calendar");
        //Write a Java program to display the current date and time.
        Calendar c=Calendar.getInstance();
        System.out.println("Current Date and Time : "+c.getTime());

        //Write a Java program to extract the year, month, and day from a specific date.
        c.set(2002,10,31);
        System.out.println("Using Calendar :......... \nYear : "+c.get(Calendar.YEAR)+"\nMonth : "+c.get(Calendar.MONTH)+"\nDay : "+c.get(Calendar.DAY_OF_MONTH));
          
        LocalDate ld=LocalDate.of(2002,10,31);
        System.out.println("Using LocalDate : \nYear : "+ld.getYear()+"\nMonth : "+ld.getMonth()+"\nDay : "+ld.getDayOfMonth());

         
        // Write a Java program to find the day of the week for a given date.
        Calendar c=Calendar.getInstance();
        String[] str={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
        int day=c.get(Calendar.DAY_OF_WEEK);
        System.out.println("Day of week : "+str[day-1]);
        
        LocalDate ld=LocalDate.of(2025,3,4);
        DayOfWeek d=ld.getDayOfWeek();
        System.out.println(d); */

        //Write a Java program to add or subtract days from a date.
        Calendar c=Calendar.getInstance();
        c.set(2002,Calendar.OCTOBER,31);
        c.add(Calendar.DATE,10);
        System.out.println(c.getTime());
        c.add(Calendar.DATE,-11);
        System.out.println(c.getTime());
        





    }
    
}
