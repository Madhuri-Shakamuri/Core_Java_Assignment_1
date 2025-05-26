package Core_Java_Topics;

public class String_ex 
{
    public static void main(String... args)
    {
        String s="  Madhuri Shakamuri";
        String s2="madhuri Shak";
        String x=" ";
        System.out.println(s.length());  

        System.out.println(s.toLowerCase()); 
        System.out.println(s.toUpperCase()); 

        System.out.println(s.indexOf('w'));
        System.out.println(s.indexOf(5));
        System.out.println(s.indexOf('m',13));
        System.out.println(s.indexOf("Sha"));

        System.out.println(s.toCharArray());
        System.out.println(s.charAt(5));
        System.out.println(s.substring(4));
        System.out.println(s.substring(3,9));
        System.out.println(s.startsWith("M")); 
        System.out.println(s.endsWith("I")); 

        System.out.println(s.compareTo(s2));  // return 0 if content equals,lexicographically  < 0 if s is less than s1
        System.out.println(s2.compareTo(s));  
        System.out.println(s.compareToIgnoreCase(s2)); // ignore upper/lowercase check content

        System.out.println(s.concat(s2)); 
        System.out.println(s.contains("madhu")); 
        System.out.println(s.contentEquals("Madhuri Shakamuri")); 
        System.out.println(s.startsWith("M")); 
        System.out.println(s.equals(s2)); 
       

        System.out.println(s.split(","));  // split based on regex[String that contains chars like ,[,],(,).......]
        System.out.println(s.trim());  // remove spaces at front and end
        System.out.println(s.strip());  //remove spaces at front and end and all non breaking(\u00A0)
        System.out.println(s.join(",[ ",s,"Anchor")); //delimiter
        System.out.println(s.replace("Madhuri","Madhu"));
        System.out.println(s.isBlank());
        System.out.println(x.isBlank()); //even blank it has white space
        
       


       


    }
    
}
