//31. Create an insufficientBalanceException Class with the message "Insufficient Balance X for withdrawal of Y". linked to Account.java

package Core_Java_Questions;

class InsufficientBalanceException  extends RuntimeException
{

    public InsufficientBalanceException(String message)
    {
        super(message);
    }
}
//Connected to Account class with additional functionality withdraw()
