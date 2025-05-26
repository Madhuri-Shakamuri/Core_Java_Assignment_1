package Core_Java_Topics;
import java.lang.Exception;
interface Ex 
{
     int x=10000;  // not instance but constant by default - public static final
     void Test(); //declaration
     public void Test1();
}

abstract class outer implements Ex // implementing class
{
    public void Test()
    {
        System.out.println(Ex.x);  
    }
}
class UserdefinedException extends Exception  
{
   public UserdefinedException()
   {
    super("Stack is full"); //custom error message  and then passed to exception class and can be retrieved by getMessage()
   }
   /*public UserdefinedException(String message) 
   {
        super(message);
    } */
}
interface Stack 
{
void push(String val) throws UserdefinedException;  //declaration
String pop() throws UserdefinedException;  
int length();

   private void privatemethod1()
    {
        System.out.println("Private method in java");
    }
   default void defaultmethod() //define - with body
    {
        System.out.println("Some default method with body");
        privatemethod1();
    }
   static void staticmethod() //cannot be inherited so cannot be overriden (specific to that interface only not for implementing classes)
    {
        System.out.println("Some Static method");
    }
    
    
}


interface  Printable extends Stack
{
    void print();
    
}

@FunctionalInterface
 interface  FunctionalInterface1 
 {
  abstract void abstractmethod(); //only one abstract method
  default void defaultmethod1()
  {
    System.out.println("Default - 1 in functional interface");
  }  
   default void defaultmethod2()
  {
    System.out.println("Default - 2 in functional interface");
  }  
  static void staticmethod1()
  {
    System.out.println("static method in functional interface");
  }

}
//multiple  inheritance
class MyStack implements Stack,Printable,FunctionalInterface1   
{
 String s[]=new String[3];
 private int top=0;
 public void push(String val)  throws UserdefinedException
 {
    if(top>=s.length)
    {
    throw new UserdefinedException();
    }
    s[top]=val;
    top++;
 }
 public String pop()  throws UserdefinedException
{
    if(top==0)
    {
        throw new UserdefinedException();
    }
    top--;
    return s[top];
}
public int length()
{
    return top;
}
public void print()
{
    for(int i=0;i<top;i++)
    {
        System.out.println(s[i]+" ");
       
    }
}
public void abstractmethod()
{
    System.out.println("Abstract method in implementing class");
}

}

public class InterfaceEx  
{
    public static void main(String[] args) 
    {
        MyStack m=new MyStack();
        Stack ref=new MyStack();
       // ref.print(); //C.E as it has nterface reference
        try
        {
            ref.push("Friends");
       
            m.push("madhu");
            m.push("Madhuri");
            m.push("Shakamuri");
    
        m.print();
        System.out.println(m.pop()); 
        System.out.println("............................");
        Printable p = new MyStack();
        p.print(); //C.E as it has nterface reference
        m.print();
        Stack.staticmethod(); 
        FunctionalInterface1 f=new MyStack();
        f.defaultmethod1();
        FunctionalInterface1.staticmethod1(); // can only be called by interface name
        ref.defaultmethod();
        try 
        {
            throw new UserdefinedException();
            //throw new UserdefinedException("Custom error: Stack overflow detected!");
        }
        catch(UserdefinedException e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        }
  
        catch(UserdefinedException e)
        {
            //System.out.println(e.getMessage());
            //e.printStackTrace();
            
        }
        
       
        
        
    } 
    
}

