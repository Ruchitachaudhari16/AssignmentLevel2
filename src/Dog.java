public class Dog {
    /*  Write a Java program to create a class called "Dog"
 with instance variables "breed," "age," and "weight."
Include a method to calculate the dog's age in human years and
a method to print the dog's breed, age, and weight.*/

    //Using Encapsulation
    private String breed;
    private int age;
    private int weight;

//getter setter method for breed
    public String getBreed()  //get method:- read only
    {
        return breed;
    }
    public void setBreed(String breed) //set method :- write method it will written value.
    {
        this.breed=breed;
    }
//getter setter property for Age
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
//Getter setter property for weight.
public int getWeight()
{
    return  weight;
}
public void setWeight(int weight)
{
    this.weight=weight;
}
public static  void main(String[] args)
{
    Dog ds=new Dog();
    ds.setAge(4);
    ds.setWeight(5);
    ds.setBreed("German");
    System.out.println("Age of Dog is:"+ds.getAge());
    System.out.println("Weight of Dog is:"+ds.getWeight());
    System.out.println("breed of dog is:"+ds.getBreed());
}
}
