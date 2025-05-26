package hrapp;

public class HRapp 
{
    public static void main(String[] args) 
    {
        System.out.println("HR App Starts");
        Employee e1=new Employee(101,"Ann",1234.56);
        Employee e2=new Employee(102,"Bob",1200.34);
        Employee e3=new Employee(103,"Ray",1122.33);

        Department dept=new Department("Department : Department Education");
        System.out.println(dept.getname());
        dept.addEmployye(e1);
        dept.addEmployye(e2);
        dept.addEmployye(e3);
         
        Employee[] emp=dept.getEmployees();
        for(Employee e:emp)
        {
            System.out.println(e);   
        }
       /*  System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3); */

        System.out.println("Total Salary: "+dept.getTotalSalaray());
        System.out.println("Average Salary: "+dept.getAverageSalary());
        //System.out.println(dept.getEmployeeByID(102));
        System.out.println(dept.getEmployeeByID(172));
    }
    
}
