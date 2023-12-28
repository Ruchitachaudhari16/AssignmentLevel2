public class TV {
    //instance variable
    int size;
    String brand;
    int price;

    public TV(int size,String brand,int price)
    { this.brand=brand;
        this.size=size;
        this.price=price;
    }
public  int discountOnTV()
{
    int discount,finalprice;
    if (size < 20)
    {
        discount = 500;
    }
    else if (size <=40)
    {
        discount = 1000;
    } else
    {
        discount = 5000;
    }
   return finalprice=price-discount;
}
public void printDetails()
{
    System.out.println("TV Brand is:"+brand);
    System.out.println("TV Size is:"+size);
    System.out.println("TV price is:"+discountOnTV());
}
public static  void main(String[] args)
{
    TV tv=new TV(10,"sony",20000);
    tv.discountOnTV();
    tv.printDetails();
    System.out.println("----------------------------------------");
    TV tvs=new TV(50,"Samsung",50000);
    tvs.discountOnTV();
    tvs.printDetails();
}
}

