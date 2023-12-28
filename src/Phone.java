import java.util.Scanner;

public class Phone
{
    /*WAP to create a class called "Phone" with instance variables "make," "model," and "storage."
     Include a method to calculate the price of the phone based on the make, model, and storage capacity and
    a method to print the phone's make, model, and storage capacity.*/
    String make;
    String model;
    int storage;


    public static  void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Phone make by company:");
        String make=sc.nextLine();
        System.out.println("Enter the RAM storage of phone");
        int stor=sc.nextInt();
        if(stor>=8)
        {
            System.out.println("Mobile phone is above 30 thousand");
        }
        else
        {
         System.out.println("Mobile phone is below 20 thousand");
        }

    }
}
