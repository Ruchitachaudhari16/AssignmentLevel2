public class Furniture {
    /* Write a Java program to create a class called "Furniture" 
    with instance variables "type," "material," and "price." 
    Include a method to calculate the discount on the furniture based on its material and 
    a method to print the furniture's type, material, and discounted price.
    */
    String type;
    String material;
    int price;
    public  Furniture(String type,String material,int price)
    {
        this.type=type;
        this.material=material;
        this.price=price;
    }
    public int discountOnFurniture() //Calculate discount for furniture.
    {
        int discount=0;
        if(material.equals("wooden"))
        {
            discount =price-200;
        } else if (material.equals("plywood"))
        {
            discount=price-500;
        }
        else if (material.equals("salwood"))
        {
            discount=price-300;
        }
       int disprice= discount;
        return disprice;
    }
    public void DisplayFurnitureInfo() //Method to display info
    {
        System.out.println("Type of furniture:"+type);
        System.out.println("Material of furniture:"+material);
        System.out.println("Final Price of Furniture:"+discountOnFurniture());
    }
    public static void main(String[] args)
    {
        Furniture fs=new Furniture("Table","salwood",5000);
        fs.discountOnFurniture();
      fs.DisplayFurnitureInfo();
    }
}
