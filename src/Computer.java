import java.util.Objects;
/* Write a Java program to create a class called "Computer"
 with instance variables "processor," "RAM," and "storage."
 Include a method to calculate the price of the computer based on the processor, RAM, and storage capacity and
a method to print the computer's processor, RAM, and storage capacity.*/
public class Computer {
   public String processor; //instance variable
   int RAM;
   int storage;
   Computer(String processor,int RAM,int storage) //Ctor of class computer.
   {
       this.processor=processor;
       this.RAM=RAM;
       this.storage=storage;
   }
   public double calculateprice() //Method to calculate price of computer.
   {
       double price=0;
     if(processor.equals("i3"))
       {
        price=30000;
       }
else if (processor.equals("i5"))
   {
       price=45000;
   }
else if (processor.equals("i7"))
       {
           price=55000;
       }
return price+=storage+200;
   }
   public void printdetails() //Method to show details of computer
   {
       System.out.println("Processor id:"+processor);
       System.out.println("RAM is:"+RAM);
       System.out.println("Storage is:"+storage);
       System.out.println("price of computer is:"+calculateprice());
   }
   public static  void main(String[] args)
   {
       Computer cs= new Computer("i3",4,128);
       cs.calculateprice();
       cs.printdetails();
   }

}
