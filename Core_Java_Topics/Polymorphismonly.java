//Polymorphism - many froms - you can create a method that works for any Animal type, and it will behave differently depending on the actual object type.
package Core_Java_Topics;
class Animal {
    public void m1() 
    {
        System.out.println("Animals make sounds.");
    }
     static void hello() 
    {
        System.out.println("Parent");
    }

}
class Dog extends Animal    
{
   
    public void m2() {            // child overrides parent
        System.out.println("Dogs bark.");
    }
    
     static void hello() {
        //super.hello();
        System.out.println("Child");
    }
}
class Cat extends Animal {
    //@Override
    public void m3() {
        //super.sound();    // parent overrides child
        System.out.println("Cats meow.");
    }
}
public class Polymorphismonly
{
        public static void main(String[] args) 
        {
            Animal pp = new Animal();  //Parent  reference to parent object  -  access only parent methpds 
            Dog   cc=new Dog();       //Child reference to Child object      -  access both parent and child
            Animal pc = new Dog();    // parent reference to child object    -  access only parent methods  // Upcasting        
            //Dog cp= new Animal(); // child reference to parent object    // downcasting   It is not executed as parent does not inherit child properties
          
          /* Cat c=new Cat();     
          
           
            
            // Calling overridden methods
            pp.m1();       // Output: Animals make sounds.
            cc.m2();      // Output: Dogs bark.
            pc.m1();     // Output: Dogs bark.
            cc.m2();    // Output: Animals make sounds.   //overriding child class using super to get parent method  */

            pp.m1();
            cc.m2();
            cc.m1();
            pc.m1();
           // pc.m2(); access only parent methods
            

            pp.hello();  //pp calling -object, hello()- called object
            cc.hello();
            pc.hello(); 

            System.out.println(pc instanceof Dog);
          // wrapper classes
            int i=2;
            Integer j=100;
            int x=j.intValue();
            System.out.println(x);
            
           System.out.println(pp instanceof Animal);// object refernce refers to object of a class
           System.out.println(pp instanceof Dog);// object refernce refers to object of a class
           System.out.println("...............................................");
           pp.m1();
           pp.hello(); //only parent methods

           cc.m1();      //both parent and child as child inherits parent properties
           cc.m2(); 
           cc.hello();   //normal overriding

           pc.m1();       //parent methods
           pc.hello();    //normal overriding   // for static the sub class methods are hided for only pc

           System.out.println(".......................");
           Dog cp= (Dog) pc;   
           cp.m1();
           cp.m2();
           
           cp.hello(); //normal overiding
           System.out.println(".......................");
           Dog cpe= (Dog) cc;   
           cpe.m1();
           cpe.m2();
           
           cpe.hello(); //normal overiding


           pp.hello();
           cc.hello();
           pc.hello();
           cc.hello();

     
        }
    
    
}

