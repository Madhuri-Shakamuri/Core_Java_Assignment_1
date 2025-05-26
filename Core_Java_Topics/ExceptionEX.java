package Core_Java_Topics;
import java.lang.Exception;
public class ExceptionEX 
{

	public static void main(String[] args)
	{
		int n;
		try 
		{
		   n=Integer.parseInt(args[0]);  // thrown by Integer class
		   n=3/0;  //exception    // thrown by JVM
		   
		   if(99%n==0)
		   System.out.println(n);
		} 
		catch (NumberFormatException | ArithmeticException e)
		{
		    System.out.println("Invalid");
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
		   System.out.println("Array error");
		}
		
		finally
		{
		  System.out.println("Helllo");  
		}   

		
		
		
	}
}
class UserdefinedException extends Exception  
{
   public UserdefinedException()
   {
    super("Stack is full");
   }
}
class Stack  
{
   public void push() throws UserdefinedException
   {
    if(4%2==0)
      throw new  UserdefinedException();
   }
}

    

