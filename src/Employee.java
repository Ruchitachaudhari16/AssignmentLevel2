public class Employee {
    String empName;
    int empSalary;
    int empID;
    Employee(int empID,String empName,int empSalary)
    {
        this.empID=empID;
        this.empName=empName;
        this.empSalary=empSalary;
    }
    public void yearlySalary(int perMonthSalary)
    {
        //int perMonthSalary=30000;
        int yearSalary=perMonthSalary*12;
        System.out.println("Employee yearly salary is:"+yearSalary);
    }
    public void employeeInfo()
    {
        System.out.println("Emp Name:"+empName);
        System.out.println("Emp ID:"+empID);

    }
    public static void main(String[] args)
    {
        Employee employee=new Employee(1,"Tanavi",30000);
        employee.employeeInfo();
        employee.yearlySalary(30000);
       System.out.println("---------------------------------------------------");
        Employee emp=new Employee(2,"Rasika",40000);
        emp.employeeInfo();
        emp.yearlySalary(40000);

    }
}
