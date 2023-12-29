import java.util.Scanner;

public class Shirt {
    /*     Write a Java program to create a class called "Shirt"
     with instance variables "size," "color," and "price."
     Include a method to calculate the discount on the shirt with instance variables "size," "color," and "price." Include a method to calculate the discount on the shirt based on  its size and
    a method to print the shirt's size, color, and discounted price*/
    String size; //instance variables
    String color;
    int price;
    Shirt(String size,String color,int price) //parameterised ctor
    {
        this.size=size;
        this.color=color;
        this.price=price;
    }
    public int discountonshirt()   //Discount Method
    {
        int dis=0;
        if(color.equals("black"))
        {
            dis=price-200;
        } else if (color.equals("white"))
        {
         dis=price-300;
        }
        else if(color.equals("excepblackwhite"))
        {
            dis=price-100;
        }
        int discount=dis;
        return discount;
    }
    public void Displaydetails()  //Display data Method.
    {
        System.out.println("Size of shirt is:"+size);
        System.out.println("Color of shirt is:"+color);
        System.out.println("price of shirt is:"+discountonshirt());
    }
    public static void main(String args[])
    {
        Shirt s1=new Shirt("xL","black",2000);
        s1.discountonshirt();
        s1.Displaydetails();
        System.out.println("--------------------------------------");
        Shirt s2=new Shirt("M","white",3000);
        s2.discountonshirt();
        s2.Displaydetails();

    }
}
