// Encapsulation - binding fields/variables and methods to a single unit usually within a class, and restricting access to them  
// Encapsulation - hiding the internal details and showing only the essential features of an object 
//Abstraction is the process of hiding the implementation details of a system and exposing only the essential features to the user.
package Core_Java_Topics;  //Package - group of classes

 class Customer 
{
    
    private String name;
    private static String size;        // Data hiding
    private Clothing[] items;   // instance variable
   
    public Customer(String name,int measurement)   //Constructor
    {
        this.name=name;               // this keyword referncing to the current object
        setSize(measurement);
        class Hello 
        {
            void display(){
                System.out.println("Class inside a Constructor");
            }
           
        }
        
    }
    public void addItems(Clothing[] someItems)       // Array of objects  to create object we have to use new Clothing()   // local varable
    {
        items=someItems;   // this.items=items 
        class Hello1 {
            void display(){
                System.out.println("Class inside a method");
            }
            
        }                            
    }
    public Clothing[] getItems()                      
    {
       
            return items;
        
    }
    public void print()
    {
        System.out.println(name);
        System.out.println(size);

    }
    public double getTotalClothingCost()
    {
        double total=0.0,tax=0.2;
        for(Clothing item:items)
      {
        //if(c1.getSize().equals(item.getSize())) {
            total+=item.getPrice();
       // }
        //total=total+(total*tax);
      //  if(total>15) break;
      //  System.out.println("Item: "+item.getDescription()+","+item.getPrice()+","+item.getSize());
      }

        
       return total;
    }
    public void setName(String name)
    {
     this.name=name;
    }
    public String getName()
    {
     return name;
    }
    public void setSize(String size)
    {
     this.size=size;
    }
    public String getSize()
    {
     return size;
    }

    public void setSize(int measurement)
    {
        
        switch (measurement) 
        {
          case 1:case 2: case 3:   //Recommended
              setSize("S");
              break;
          case 4,5,6:   //Not Recommended
              setSize("M");
              break;
          case 7,8,9:
              setSize("L");
              break;  
          
          default:
              setSize("XL");
        } 
    }
    
    public static void hello()
    {
      System.out.println("static method called without object refernce");
      
    }
    public static void hello(String size)
    {
        Customer.size=size;
        //this.size=size; not possible as static method does not belong to instance variable
      System.out.println("static method does not support this keyword ");
      
    }
    

    
}
 class InnerCustomer {
    public static void m5(){
        System.out.println("New class");
    }
   
}

    


