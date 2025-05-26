//27. Write a program to create an interface called account operation with methods deposit(), getBalance().Implement this interface in Account class.
package Core_Java_Questions;

interface Account_Operation 
{
   void deposit(double amt);
   double getBalance();
    
}
public class Account implements Account_Operation 
{
   private double balance;
   @Override
   public void deposit(double amt)
   {
    balance+=amt;
   }
   @Override
   public double getBalance()
   {
    return balance;
   }
   public double withdraw(double amt)
   {
      if(amt>balance)
      {
         throw new InsufficientBalanceException("Insufficient Balance  "+balance+" for withdrawal of "+amt);
      }
      balance-=amt;
      return balance;
   }
   public static void main(String[] args)
   {
    Account_Operation a=new Account();
    a.deposit(10000);
    a.deposit(5000);
    System.out.println(a.getBalance());
   Account a1=(Account)a;
   try {
      a1.withdraw(50000);
   }
   catch(InsufficientBalanceException e)
   {
     System.out.println(e.getMessage());
   }
    
   }
    
}
