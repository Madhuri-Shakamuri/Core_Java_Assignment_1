/*15. Create a class Student that stores the details like admin_no, stu_name, course_joined and fees_paid.
—> Courses are: JAVA, PYTHON.
—> The total fees for java is 10k and for python is 7.5k.
—> Provide a constructor to take required details.The default course is JAVA.
—> Provide the following methods: getTotalFee(), getDue(), getFeePaid(), payment(amount). */
package Core_Java_Questions;

public class Student
{
    private String admin_no;
    private String stu_name;
    private String course_joined;
    private double fees_paid;


    private static final double JAVA_FEES=10000;
    private static final double PYTHON_FEES=7500;

    public Student(String admin_no,String stu_name,String course_joined,double fees_paid)
    {
        this.admin_no=admin_no;
        this.stu_name=stu_name;
        this.course_joined=(course_joined.equalsIgnoreCase("PYTHON"))?"PYTHON":"JAVA";
        this.fees_paid=fees_paid;
    }

   
     public double getTotalFee()
     {
         if(course_joined.equals("JAVA"))
         {
            return JAVA_FEES;
         }
         else 
         return PYTHON_FEES;
     }
     public double getDue()
     {
        return getTotalFee()-fees_paid;
     } 
     public double getFeePaid()
     {
         return fees_paid;
     }
     public void payment(double amount)
     {
        if(amount>0 && (amount+fees_paid)<=getTotalFee())
        {
         fees_paid+=amount;
         System.out.println("Payment  Successfull : "+amount+" \nRemaining fee : "+getDue());
        }
        else 
        System.out.println("INVALID Amount");
        
     }
     public String toString()
     {
      return "Student Name:"+stu_name +"\nStudent ID: "+admin_no+"\nCourse Joined  : "+course_joined+"\nTotal Fees     : "+ getTotalFee()+"\nFees Paid      : "+ getFeePaid()+"\nRemaining Fees : "+ getDue();
     }
     
     public static void main(String[] args) 
     {
        Student s=new Student("20A21A05G1", "Madhuri Shakamuri", "Java",6000);
        
        System.out.println(s.toString());
        s.payment(1500);
        

        
     }
    
}
