package hrapp;

public class Department 
{
    private String name;

    private Employee[] employees=new Employee[10];
    private int last_emp_index=-1;    
    public Department(String name)
    {
        this.name=name;
    }

    public void setname(String name)
    {
        this.name=name;
    }
    public String getname()
    {
        return name;
    }
    public String toString()
    {
        return getname();
    }
    public void addEmployye(Employee anemployee)
    {
        if(last_emp_index<employees.length)          //if length is 2 then -1<2  and next 0<2  and 1<2 
        {
           last_emp_index++;                       // 0 --> 1--->2
           employees[last_emp_index]=anemployee;  //employees[0]= anemployee ---> employees[1]= anemployee --->employees[2]= anemployee fails as employee has length 2 when we add even it is 10
        }

    }
    public Employee[] getEmployees()
    {
      Employee[] actuaEmployees=new Employee[last_emp_index+1];   //1+1=2
      for(int i=0;i<actuaEmployees.length;i++)
      {
       actuaEmployees[i]=employees[i];
      }
      return actuaEmployees;
    } 
    public int getnoEmployees()
    {
        return  last_emp_index+1;   
    }
    public Employee getEmployeeByID(int empID)
    {
        
        for(Employee e:employees)
        {
        if(e!=null)
        {   
         if(e.getID()==empID)
         {
            return e;
         }
        }
    }
        return null;
    }
    public double getTotalSalaray()
    {
        double total=0.0;
        for(int i=0;i<last_emp_index;i++)
        {
           total+=employees[i].getsalary();
        }
        
        return total;
    }
    public double getAverageSalary()
    {
        if(last_emp_index>-1)
        {
            return getTotalSalaray()/(last_emp_index+1);
        }
        return 0.0;
        

    }
    
}
