import java.util.ArrayList;
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 *
 * @author    Fiza Ayub
 * @version    30.11.21
>>>>>>> 76fc6d59158ca991c6793eee2478f4162da7515a
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
        
        stock.add(new Product(101, "iPhone 12"));
        stock.add(new Product(102, "iPad Air "));
        stock.add(new Product(103, "AirPods Pro"));
        stock.add(new Product(104, "Samsung Galaxy Z"));
        stock.add(new Product(105, "Apple Pen"));
        stock.add(new Product(106, "MacBook"));
        stock.add(new Product(107, "Samsung Earbuds"));
        stock.add(new Product(108, "Apple Watch"));
        stock.add(new Product(109, "One Plus"));
        stock.add(new Product(110, "Samsung Z Flip"));
        
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
    
    /**
     * Buys product
     */
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

    /**
     * sells product
     */
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
