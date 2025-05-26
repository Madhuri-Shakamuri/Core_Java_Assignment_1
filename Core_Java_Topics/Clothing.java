package Core_Java_Topics;


public class  Clothing implements Comparable<Clothing>  // Implement the Comparable<T> interface in your class  <Clothing> --> generic -type of object that it is used to work on  
{
   static int instance_var=10000;
   int x=404; //default
   private static String description;
   private double price;
   private String size="M";   

   public Clothing (String description,double price,String size)
   {
    this.description=description;
    this.price=price;
    this.size=size;
    
   }

   public static final double  MIN_PRICE=10.0;   // Instance variable 
   public  static final double TAX_RATE=0.2;

   public void setDescription(String description)   
    {
     this.description=description;

     
    }
    public String getDescription()
    {
     return description;
    }

    public void setPrice(double price)
    {
      this.price=(price>MIN_PRICE)?price:MIN_PRICE;
     
    }
    public double getPrice()
    {
     return price+(price*TAX_RATE);
    }

    public void setSize(String size)
    {
     this.size=size;
    }
    public String getSize()
    {
     return size;
    }
    public String toString()
    {
      return getDescription()+","+getPrice()+","+getSize();
    }
    @Override   // Annotations - info about program and used to give instructions to the compiler,runtime or tools  --- documentation
    public int compareTo(Clothing c)    // Override the compareTo(T o) method to define the logic for comparison 
    {
     return this.description.compareTo(c.description);  // sort by string description is less than c.description remains same else swap  here it compare every pair of objects
    // System.out.println("hello"); not possible as the class is not static
    }
    //Use the comparison logic to sort objects of the class using Collections.sort() or arrays using Arrays.sort().


    public static void hello()
    {
      System.out.println("static method called with object refernce");
    }


   

    
}
