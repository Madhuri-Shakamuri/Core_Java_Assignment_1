package Core_Java_Topics;
import java.util.Arrays;
 class ShopApp
{
  static final int x=40;
  public static void main(String[] args)
   {    
       
      double tax=0.2,total=0.0;
      float f=10;
      float f1=10l;
      double d=10;
      double d1=10l;
      

      Customer c1=new Customer("Pinky",15);
      //c1.setName("Pinky");  
      //c1.setSize("S"); 
      c1.print();
      System.out.println(".........");
      System.out.println(Clothing.MIN_PRICE);
      System.out.println(c1.getName()+" "+c1.getSize());

      Clothing item1=new Clothing("Blue jacket",20.9,"M"); //object creation
      Clothing item2=new Clothing("Orange T shirt",10.5,"S");
      Clothing item3=new Clothing("Orange T shirt",10.5,"S");
      System.out.println("............................................................................................");
      
      System.out.println(item1.equals(item2));
      System.out.println(item2.equals(item3));
      
      System.out.println("............................................................................................");

      Clothing[] items={item1,item2,new Clothing("Green scarf",5,"S"),new Clothing("Blue T-shirt",10.5,"S")};

    
      /* 

      items[3].setDescription("Blue T-shirt");
      items[3].setPrice(10.5);
      items[3].setSize("S");
      */

      
     // total=(item1.price+item2.price*2)*(1+tax);
      
      

      int measurement=8;
      c1.setSize(measurement);
      
      
      c1.addItems(items);
      System.out.println(c1.getName()+" "+c1.getSize()+" "+c1.getTotalClothingCost());
      for(Clothing item:c1.getItems())  
      {
        //System.out.println(item.getDescription());
        System.out.println("Item output: "+item);
        
      }
      int average=0;
      int count=0;
      for(Clothing item:c1.getItems())
      {
        
          if(item.getSize().equals("L"))
        {
          count++;
          average+=item.getPrice();
        }

        }
       try{
        average=average/count;      // 0/0 - AE     // Solve error -  average=count==0?0:average/count; 
        System.out.println("Average: "+average+" Count: "+count);
       }
      
       catch(ArithmeticException e)
        {
          System.out.println("There are no such items");
        }
       Arrays.sort(c1.getItems());   // here it calls compareTo() to compare a pair of objects by its length 
       for(Clothing item:c1.getItems())  
       {
         //System.out.println(item.getDescription());
         System.out.println("Item output: "+item);
         
       }
      System.out.println(Clothing.instance_var);  // instance variable calling from other class using an object
      Clothing.hello(); //Static method called without object refernce called by class name

      c1.hello();
      c1.hello("hello");
      System.out.println("Without static variable: "+item1.x);
      System.out.println();
   

      InnerCustomer i=new InnerCustomer();
      i.m5();
      InnerCustomer.m5();
      Innershop inshop=new Innershop();
      inshop.m6();
      Innershop.m6();
      inshop.y=50;
      System.out.println(Innershop.y);
      System.out.println("First class static final var : "+x);

     /* Customer.Hello h=new Customer.Hello();
      h.display();*/ 
      
     
    }
     
}
 class Innershop 
{
  static final int x=10;
  static  int y=10;
  public static void m6(){
        y=30;
      System.out.println("In same class without a class declared as public ");
      System.out.println("Second class static final var : "+x);
  }
}

 


/* Clothing[] item=new Clothing[10]; only memory space is created 
   item.setdescription("Pinky");  ---> wrong
    
   first 
   1.  item[0]=new Clothing();
   then item[0].setdescription("pumpkin");


*/
