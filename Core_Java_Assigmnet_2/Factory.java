/*16. Create a subclass called FactoryEmployee, for all factory employees we need to store bus_no, emp_boards.
Create a super class related to this subclass. */

package Core_Java_Questions;

class Employee
{
    private String emp_name;
    private String emp_id;

    public Employee(String emp_name,String emp_id)
    {
        this.emp_name=emp_name;
        this.emp_id=emp_id;
    }
    public void emp_details()
    {
        System.out.println("Employee Name  : "+emp_name);
        System.out.println("Employee ID  : "+emp_id);
    }

}
class FactoryEmployee extends Employee
{
    private int bus_no;
    private String emp_boards;

    public FactoryEmployee(String emp_name,String emp_id,int bus_no,String emp_boards)
    {
        super(emp_name, emp_id);
        this.bus_no=bus_no;
        this.emp_boards=emp_boards;
    }
    public void emp_details()
    {
        super.emp_details();
        System.out.println("Bus number : "+bus_no);
        System.out.println("Employye Shift : "+emp_boards); 
    }
}
 class  Factory 
 {
    public static void main(String[] args) 
    {
        FactoryEmployee e1=new FactoryEmployee("Bhavani", "1", 4, "Night shift");
        FactoryEmployee e2=new FactoryEmployee("Wesley", "2", 4, "Morning shift");
        FactoryEmployee e3=new FactoryEmployee("Hema", "3", 3, "Night shift");
        e1.emp_details();
        e2.emp_details();


    }

    
}
