import java.util.Scanner;

public class BankAccount {
    /* Write a Java program to create a class called "BankAccount"
    with instance variables "balance" and "accountNumber."
     Include a method to deposit money into the account and
     a method to withdraw money from the account.*/

    //Creating Properties of Employee Class.
    private int emp_Salary;

    //Getter and Setter properties.
    public int getEmp_Salary() {
        return emp_Salary;
    }

    public void setEmp_Salary(int emp_Sal) {
        emp_Salary = emp_Sal;
    }
}
class Emp
{
       public static void main(String[] args)
        {
       BankAccount ba=new BankAccount();
       ba.setEmp_Salary(350000);
       System.out.println(ba.getEmp_Salary());
        }
    }

