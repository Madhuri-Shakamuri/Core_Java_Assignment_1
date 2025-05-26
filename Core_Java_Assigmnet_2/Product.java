//12,13,28

/* 12. Create a class(Product) to store details of a product and provide required methods with the details 
prod_id, prod_name, price,quantity_on_hand
Methods are:  init(prod_id,prod_name, price)
getNetPrice() (returns the price after adding 12% tax)
purchase()
sell() */
//13. Introduce multiple constructors in Product class.
//28. Design classes that need to sort a collection of Product objects either by product name or by price.

package Core_Java_Questions;

public class Product
{
    private int prod_id;
    private String prod_name;   
    private double price;
    private int quantity_on_hand;
    

    public Product(int prod_id,String prod_name,double price)
    {
     this.prod_id=prod_id;
     this.prod_name=prod_name;
     this.price=price;
     this.quantity_on_hand=0;
    }
    public Product(int prod_id,String prod_name)
    {
        this.prod_id=prod_id;
        this.prod_name=prod_name;
    }
    public Product()
    {
        System.out.println("Default Constructor");
    }

    public double getNetPrice()
    {
        
        return price+(price*0.12); //tax= 12%
    }
    public void purchase()
    {
     quantity_on_hand++;
    }
    public void sell()
    {
        if(quantity_on_hand>0)
        quantity_on_hand--;
        else 
        System.out.println("Product Unavailable");
    }



   //Getters and Setters
    public void setProductId(int prod_id)
    {
     this.prod_id=prod_id;
    }
    public int getProductId()
    {
        return prod_id;
    }
    public void setProductName(String prod_name)
    {
     this.prod_name=prod_name;
    }
    public String getProductName()
    {
        return prod_name;
    }
    public void setProductPrice(double price)
    {
      this.price=price;
    }
    public double getProductPrice()
    {
        return price;
    }
    public void setQuantity(int quantity_on_hand)
    {
     this.quantity_on_hand=quantity_on_hand;
    }
    public int getQuantity()
    {
        return quantity_on_hand;
    }

    public static void sortByName(Product[] products) 
    {
        int n = products.length;
        for (int i = 0; i < n - 1; i++) 
        {
            for (int j = 0; j < n - i - 1; j++) 
            {
                if (products[j].getProductName().compareToIgnoreCase(products[j + 1].getProductName()) > 0) 
                {
                    
                    Product temp = products[j];
                    products[j] = products[j + 1];
                    products[j + 1] = temp;
                }
            }
        }
    }

    public static void sortByPrice(Product[] products) 
    {
        int n = products.length;
        for (int i = 0; i < n - 1; i++) 
        {
            for (int j = 0; j < n - i - 1; j++) 
            {
                if (products[j].getProductPrice() > products[j + 1].getProductPrice())
                {
                    
                    Product temp = products[j];   
                    products[j] = products[j + 1];
                    products[j + 1] = temp;
                }
            }
        }
    }
    public String  toString()
    {
        return "Product ID:"+prod_id+"  Product Name:"+prod_name+"   Product price: "+price;
    }

    
        public static void main(String... args) 
        {
        Product p=new Product(101,"Ipad",200000);
        System.out.println("Product ID: "+p.getProductId()+"\nProduct Name: "+p.getProductName()+ "\nProduct Price: "+p.getProductPrice());
        System.out.println("NetPrice: "+p.getNetPrice());

        p.purchase();
        p.purchase();
        System.out.println("Quantity after Purchasing : "+p.getQuantity());
        p.sell();
        System.out.println("Quantity after selling :"+p.getQuantity());



        System.out.println("----------------------------------");
        Product p1=new Product(102,"IPhone");
        System.out.println("Product ID: "+p1.getProductId()+"\nProduct Name: "+p1.getProductName());
        


        System.out.println("----------------------------------");
        Product p2=new Product();

        Product[] products = 
        {
            new Product(101, "Ipad", 200000),
            new Product(102, "IPhone", 120000),
            new Product(103, "Laptop", 75000),
            new Product(104, "Smartwatch", 5000),
            new Product(105, "Headphones", 1500)
        };
        sortByName(products);
        for(Product pro:products)
        {
            System.out.println(pro);
        }
        
        sortByPrice(products);
        for(Product pro:products)
        {
            System.out.println(pro);
        }

        }

    
}
