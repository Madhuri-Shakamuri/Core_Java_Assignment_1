package Core_Java_Topics;

import java.time.LocalDate;

class StaticMemClass 
{
  int  x=100;
  static class InnerStatic   //Static Member Class
  {
    int y=200;
    public void print()
    {
        System.out.println("Static class inside a class");
    }
  
  }
    
}
class  NonstaticMemClass 
{
  int x=300;
  class NonstaticClass    //Inner Class
  {
    int y=400;
    public void print()
    {
        System.out.println("NON - Static class inside a class");
    }
    /*or create an object in the method of nonstatic mem class - outer class 
     public void print()
     {
     NonstaticClass n=new NonstaticClass();
     n.print();
     }
    */
  }

  
}
class MethodClass
{
   int x=500;

  public void m1()  
  {
     int y=600;
     class LocalClass  //Local class
     {
     int z=700;
     public void print()
     {
      System.out.println("Class inside a method - Local Class");
     }
      
     }
     LocalClass l=new LocalClass();
     System.out.println(l.z);
     System.out.println(y);
     l.print();

  }
}
public class NestedClassesEx 
{
    public static void main(String[] args)
    {
        StaticMemClass s=new StaticMemClass();
        System.out.println(s.x);
        StaticMemClass.InnerStatic s1=new StaticMemClass.InnerStatic();
        s1.print();   
        System.out.println(s1.y);

        NonstaticMemClass n = new NonstaticMemClass();
        System.out.println(n.x);
        NonstaticMemClass.NonstaticClass n1=n.new NonstaticClass();
        n1.print();
        System.out.println(n1.y);

        MethodClass m=new MethodClass();
        System.out.println(m.x);
        m.m1();

        
        
        
    }
   
    
}
