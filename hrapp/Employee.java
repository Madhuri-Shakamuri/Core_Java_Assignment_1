package hrapp;

public class Employee 
{
    private int ID;
    private String name;
    private double salary;

    public Employee(int ID,String name,double salary)
    {
        this.ID=ID;
        this.name=name;
        this.salary=salary;
    }

    public void setID(int ID)
    {
        this.ID=ID;
    }
    public int getID()
    {
        return ID;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public String getname()
    {
        return name;
    }

    public void setsalary(double salary)
    {
        this.salary=salary;
    }
    public double getsalary()
    {
        return salary;
    }
    public String toString()
    {
        return "Employee: "+getID()+" "+getname()+" "+getsalary();
    }
    
}
