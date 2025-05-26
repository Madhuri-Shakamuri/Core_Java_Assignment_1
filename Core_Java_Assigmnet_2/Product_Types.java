/*17. Create classes to store details for two different types of Products,
   a) ImportedProducts which have import duty.
   b) DiscountedProducts which have a discount rate.
All products have name and base_price.Create required Constructors and following methods: 
print(), getNetPrice(), setPrice(), setImportDuty(), setDiscountRate() also experiment with upcasting and downcasting. */
package Core_Java_Questions;

class  Product_1
{
    protected String name;
    protected double base_price;
    
    public Product_1(String name,double base_price)
    {
        this.name=name;
        this.base_price=base_price;
    }
    public void print()
    {
    System.out.println("Name  : "+name);
    System.out.println("Base Price: "+base_price);
    }
    public void setPrice(double base_price)
    {
        this.base_price=base_price;
    }
    public double getNetPrice()
    {
     return base_price;        
    }
    
} 
 class ImportedProducts  extends Product_1        // includes import cost
 {
    private double import_duty;

     public ImportedProducts(String name,double base_price,double import_duty)
     {
      super(name,base_price);
      this.import_duty=import_duty;
     }
    public void set_import_duty(double import_duty)
    {
        this.import_duty=import_duty;
    }
    public double getNetPrice()
    
    {
        return base_price+(base_price*import_duty/100);
    }
 }
   
class DiscountedProducts  extends Product_1
{
    private double discount_rate;
    public DiscountedProducts(String name,double base_price,double discount_rate)
    {
        super(name, base_price);
        this.discount_rate=discount_rate;
    }
    public void set_discount_rate(double discount_rate)
    {
        this.discount_rate=discount_rate;
    }
    public double get_discount_rate()
    {
        return base_price-(base_price*discount_rate/100);
    }

}
public class Product_Types 
{
    public static void main(String[] args) 
    {
       
        System.out.println("Upcasting : ");
        Product_1 p=new ImportedProducts("Thar",1200000,2000); 
        p.print();
        System.out.println("Net price: "+p.getNetPrice());

        
        System.out.println("..........................................................");
        System.out.println("Downcasting : ");
        ImportedProducts d=(ImportedProducts)p;
        d.print();
        d.set_import_duty(7000);
        System.out.println("Net price: "+p.getNetPrice());
        
        


    }
    
}
