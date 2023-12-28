public class Student
{
    /*Write a Java program to create a class called "Student"
    with instance variables "name," "age," and "ID."
    Include a method to print the name and age of the student.
*/
    String name;
    int age;
    int id;
    Student(String nam,int ag,int i)
    {
        //Constructor of Student class.
        name=nam;
       age=ag;
       id=i;
    }
   void Displaydata()
   {
       System.out.println("Name of the student is:"+name);
       System.out.println("Age of Student is:"+age);
       System.out.println("ID of student is:"+id);
   }
    public static  void main(String[] args)
    {
        //Display data using displaydata method.
        Student stu=new Student("Ruchita",26,101);
        Student stud=new Student("Nikita",30,102);
        stu.Displaydata();
        stud.Displaydata();

    }
}
