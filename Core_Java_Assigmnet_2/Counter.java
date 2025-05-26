/* 14. Create a class called Counter that stores a number and provides methods to increment, decrement and return the count. 
Provide the constructor without parameters that sets the values to zero and another constructor with parameters takes the values and starts from there. */

package Core_Java_Questions;

public class Counter 
{
    private int count;

    public Counter()
    {
        this.count=0;
    }
    public Counter(int count)
    {
        this.count=count;
    }

    public void increment()
    {
        count++;
    }
    public void decrement()
    {
        count--;
    }
    public void setCount(int count)
    {
        this.count=count;
    }
    public int getCount()
    {
        return count;
    }
    public String toString()
    {
        return "Count : "+count;
    }
    public static void main(String[] args) 
    {
        
        System.out.println("Constructor with no parameters: ");
        Counter c=new Counter();
        System.out.println(c);// Automatically calls to String method
        System.out.println("Incremented by 2 times: ");
        c.increment();
        c.increment();
        System.out.println(c);
        System.out.println("Decremented by 1 time: ");
        c.decrement();
        System.out.println(c);



        System.out.println("Constructor with  parameters: ");
        Counter c1=new Counter(11);
        System.out.println(c1);
        System.out.println("Incremented by 2 times: ");
        c1.increment();
        c1.increment();
        System.out.println(c1);
        System.out.println("Decremented by 1 time: ");
        c1.decrement();
        System.out.println(c1);

    }
    
}
