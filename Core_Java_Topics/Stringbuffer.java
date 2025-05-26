package Core_Java_Topics;

import java.util.StringJoiner;

public class Stringbuffer 
{
    public static void main(String[] args) 
    {
        System.out.println("STRING BUFFER CLASS");
        StringBuffer s=new StringBuffer(); //defualt 16 char
        StringBuffer s1=new StringBuffer(45);// int capacity
        System.out.println(s.append("Madhuri"));
        System.out.println(s.append("Shakamuri"));
        System.out.println(s.append(' '));
        System.out.println(s.append("S"));
        System.out.println(s.delete(0, 7));
        System.out.println(s.deleteCharAt(s.length()-1));
        System.out.println(s.reverse());
        System.out.println(s);
        System.out.println(s.reverse());
        System.out.println(s.insert(0,"Madhuri "));
        s.setCharAt(0,'m');
        System.out.println(s);
        System.out.println(s.append("111111111111111111111111111111111"));


        System.out.println("...................................................");
        //StringJoiner Class
        System.out.println("STRING JOINER CLASS");
        StringJoiner s2=new StringJoiner(",","[","]");
        StringJoiner s3=new StringJoiner(" ");
        StringJoiner s4=new StringJoiner(" ");
        s2.add("Java");
        s2.add("Python");
        s2.add("C");
        System.out.println(s2.toString());
        System.out.println(s2);
        s3.add("C#");
        System.out.println(s2.merge(s3));
        System.out.println(s4.setEmptyValue("No items"));

        System.out.println("...................................................");
        System.out.println("MATH CLASS");
        int a=-10,b=8;
        double c=4.5,d=-3.5;
        System.out.println("PI: " +Math.PI);
        System.out.println("PI: " +Math.E);//euler number - 2.718281828459045
        System.out.println("MIN Valuee: " +Math.min(a, b));
        System.out.println("MAX Valuee: " +Math.max(a, b));
        System.out.println("ABSOLUTE Valuee of a : " +Math.abs(a));
        System.out.println("ABSOLUTE Valuee of b : " +Math.abs(b));

        
        System.out.println("Round off  : " +Math.round(c));
        System.out.println("Round off  : " +Math.round(d));  // return double value
        System.out.println("Ceil : " +Math.ceil(c)); // up
        System.out.println("Floor : " +Math.floor(c)); //down
        System.out.println("Random : " +Math.random());  // returns  >= 0.0 anf <1.0 by default
        System.out.println("Random : " +(int)(Math.random()*100));  //100 range  [0, 99]
        System.out.println("Random : " +(int)(Math.random()*100)+1); //[1, 100]
        System.out.println("Random : " +(int)(Math.random()*100)+2); //[0, 99] --->[2, 101]

        System.out.println("Power of  : " +Math.pow(4, 2)); // return double value
        System.out.println("SQRT : " +Math.sqrt(16));  // return double value
        System.out.println("CBRT : " +Math.cbrt(125)); //cuberoot
        System.out.println("HYpo: " +Math.hypot(a,b));//sqrt(x² + y²)
        System.out.println("Expo: " +Math.exp(a));
        //ALL trignometric functions
        




        
        
    }
    
}
