public class BankAccount {
    /*Write a Java program to create a class called "BankAccount"
     with instance variables "balance" and "accountNumber."
     Include a method to deposit money into the account and
     a method to withdraw money from the account.
*/
//Instance variables
int balance;
int  accountNumber;
int remainbalance;
int withdrwamount;

public BankAccount(int balanc ,int acno) //Ctor to intialise instance variable.
{
 balance=balanc;
 accountNumber=acno;
}
public void deposit(double amount)
{
    balance+=amount;
}
public void withdraw(int withdrwamount)
{
    remainbalance=balance-withdrwamount;
    System.out.println("Withdraw amount is:"+withdrwamount);
}
public void displaydata()
{
    System.out.println("Account number is:"+accountNumber);
    System.out.println("Bank Balance is:"+balance);
    System.out.println("Remaining balance is:"+remainbalance);

}
public static  void main(String[] args)
{BankAccount ba=new BankAccount(10000,101);
    ba.deposit(2000);
    ba.withdraw(1000);
    ba.displaydata();
}
}
