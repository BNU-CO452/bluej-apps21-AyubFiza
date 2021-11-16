import java.util.ArrayList;
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author Fiza Ayub
 * @version 02/11/2021
 */
public class StockDemo
{
    // The stock manager.
    private StockList stock;
    
    public ArrayList<Product> products;

    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo(StockList stock)
    {
        this.stock = stock;
        
        // Add at least 10 products, they must be unique to you
        // Make sure the ids are sequential numbers
        
        stock.add(new Product(101, "Samsung Galaxy S20"));
        stock.add(new Product(102, "Apple iPhone 12"));
        stock.add(new Product(103, "Google Pixel 4A"));
        stock.add(new Product(104, "Apple iPad Air"));
        stock.add(new Product(105, "Apple Airpods Pro"));
        stock.add(new Product(106, "Google Chromebook"));
        stock.add(new Product(107, "Samsung Z Flip"));
        stock.add(new Product(108, "HP Inspiron 15 Laptop"));
        stock.add(new Product(109, "Beats Headphones"));
        stock.add(new Product(110, "Apple Pen"));
    }
    
    /**
     * Provide a demonstration of how the ProductList meets all
     * the user requirements by making a delivery of each product 
     * buying it in various amounts and then selling each
     * product by various amounts. Make sure all the requirements
     * have been demonstrated.
     */
    public void runDemo()
    {
        // Show details of all of the products before delivery.
        
        stock.print();

        buyProducts();
        stock.print();        

        sellProducts();
        stock.print();     
    }
    
    private void buyProducts()
    {
        stock.buyProduct(101, 6);
        stock.buyProduct(102, 8);
        stock.buyProduct(103, 8);
        stock.buyProduct(104, 7);
        stock.buyProduct(105, 9);
        stock.buyProduct(106, 5);
        stock.buyProduct(107, 9);
        stock.buyProduct(108, 5);
        stock.buyProduct(109, 6);
        stock.buyProduct(110, 6);
        
    }

    private void sellProducts()
    {   stock.sellProduct(101, 4);
        stock.sellProduct(102, 6);
        stock.sellProduct(103, 7);
        stock.sellProduct(104, 5);
        stock.sellProduct(105, 7);
        stock.sellProduct(106, 2);
        stock.sellProduct(107, 8);
        stock.sellProduct(108, 4);
        stock.sellProduct(109, 4);
        stock.sellProduct(110, 3);
        
    }    
}