package Core_Java_Topics;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEX 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

       // Pattern class and matcher
       Pattern p=Pattern.compile("[a-z]");
       Matcher m=p.matcher("hello123world"); //matches it 
       while(m.find())
       {
        System.out.println("Found : "+m.group());
       }
       //matches()- boolean
       if(Pattern.matches("[a-z]", str))
       System.out.println("Valid");
       else 
       System.out.println("INValid");

       //split method - words are come as output
       String[] s=str.split("//d");
       for(String i:s)
       {

       }
        Pattern p1 = Pattern.compile("\\d+");
        Matcher m1 = p.matcher("abc123xyz");
       if(Pattern.matches("he123","he123"))
       System.out.println("............");

        System.out.println("Matches: " + m.matches());
       
    }
    
}
