
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author    Fiza Ayub
 * @version    25.01.2022
 */

public class StockApp
{
    private InputReader reader;
    
    private StockList stock;
    
    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        reader = new InputReader();
        
        stock = new StockList();
        StockDemo demo = new StockDemo(stock);
    }

    /**
     *  Display a list of menu choices and execute
     *  the user's choice.
     */
    public void run()
    {
        boolean finished = false;
        
        while(!finished)
        {
            printHeading();
            printMenuChoices();
           
            String choice = reader.getString("Please enter your choice > ");
            
            finished = executeChoice(choice.toLowerCase());
        }
    }
    
    /**
     * Checking the statement of what has been selected.
     */
    private boolean executeChoice(String choice)
    {
        if(choice.equals("quit"))
        {
            return true;
        }
        else if(choice.equals("print"))
        {
            stock.print();
        }
        else if(choice.equals("add"))
        {
            addProduct();
        }
        else if(choice.equals("remove"))
        {
            removeProduct();
        }
        else if(choice.equals("buy"))
        {
            getProduct();
        }
        else if(choice.equals("sell"))
        {
            loseProduct();
        }
        else if(choice.equals("check"))
        {
            checkProduct();
        }
        else if(choice.equals("stock"))
        {
            stockProduct();
        }
        return false;
    }
   
    /**
     * Adds a new product
     */
    private void addProduct()
    { 
        System.out.println("Adding a new Product");
        System.out.println();
        
        int id = reader.getInt("Please enter a product id >");
        String name = reader.getString("Please enter the product name >");
        
        Product product = new Product(id, name);
        
        stock.add(product);
        stock.print();
    }
    
    /**
     * Removes a new product
     */
    private void removeProduct()
    { 
        System.out.println("Removing a new Product");
        System.out.println();
        
        int id = reader.getInt("Please enter a product id >");
        
        stock.remove(id);
        stock.print();
    }
    
    /**
     * Purchases a new product
     */
    private void getProduct()
    { 
        System.out.println("Purchases a new Product");
        System.out.println();
        
        int id = reader.getInt("Please enter a product id >");
        int ammount = reader.getInt("Please an ammount to stock>");
        
        stock.buyProduct(id,ammount);
    }
    
    /**
     * Sells a new product
     */
    private void loseProduct()
    { 
        System.out.println("sell a new Product");
        System.out.println();
        
        int id = reader.getInt("Please enter a product id >");
        int ammount = reader.getInt("Please an ammount to sell> ");
        
        stock.sellProduct(id,ammount);
    }
    
    /**
     * Searches for a new product
     */
    private void checkProduct()
    { 
        System.out.println("Search for a new Product");
        System.out.println();
        
        String phrase = reader.getString("Please enter a product id >");
        
        stock.searchForProduct(phrase);
    }
    
    /**
     * Checks Stock
     */
    private void stockProduct()
    {
        stock.lowStocklist();
    }
    
    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    Buy:        Buys a product");
        System.out.println("    Sell:       Sells a product");
        System.out.println("    Search:     Searches for part of name or product");
        System.out.println("    Stock:      Restocks the for part of name or product");
        System.out.println("    Print:      Print all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println();        
    }
    
    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("********************************");
        System.out.println("  App21-04: Stock Application ");
        System.out.println("      by Fiza Ayub");
        System.out.println("********************************");
    }
}