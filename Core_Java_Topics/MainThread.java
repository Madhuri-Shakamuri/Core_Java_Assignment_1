package Core_Java_Topics;

class MyThread extends Thread  //creating a new Thread
{
    @Override //overidding the thread classs run()
   public void run()
   {
     System.out.println("My own thread is created by extending thread class");
   }
}
class NewThread implements Runnable  //Runnable inteface has only one run()
{
    public void run()
    {
    System.out.println("New thread is created by implementing Runnable interface");
    }
}
public class MainThread //implicitly creted by jvm when we run it 
{
   public static void main(String[] args) 
   {
    /* Implicitly creted by jvm when we run it 
    Thread t=Thread.currentThread();  //main 
    System.out.println(t.getName());  //main 
    System.out.println(t.getPriority()); // Based on thread priority */

     MyThread t=new MyThread(); // object for subclass of Thread 
     t.start();  // it start the thread and call the run method

     NewThread n=new NewThread(); //object of implemnting class '
     Thread t1=new Thread(n); //passing object od implementing class to Thread constructor
     t1.start();


   } 
}
