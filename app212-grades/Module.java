/**
 * Modules form part of a course and contain
 * credits that students achieve when they
 * pass the module with a mark of 40%
 * 
 * @author     
 * Modified by Fiza Ayub
 * @version19-10-2021
 */
public class Module
{
    // Most modules are worth 15 credits
    public static final int CREDIT = 15;
    
    private String code;
    private String title;
    private int credits;
    private Course course;
    
    /**
     * Constructor for objects of class Module 
     * which initialises the module code and title.
     */
    public Module(String code, String title)
    {
        this.code = code;
        this.title = title;
        credits = 15;
    }
    /**
     * Returns the code of the module.
     */
    public String getCode()
    {
        return code;
    }
    /**
     * Returns the title of the module.
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Print out the code and title of this module
     * but stay on the same line so that credits
     * can be added if needed.
     */
    public void print()
    {
        System.out.println();
        System.out.print("\t " + code + ": " + "\t" + title);
    }
    
    /**
     * Prints the credits of the module.
     */
    public void printCredit()
    {
        System.out.print("\t " + CREDIT + " credits");
    }
    
    /**
    * Prints out the details of module.
    */
    public void printModuleDetails()
    {
        System.out.println("Module code: " + code);
        System.out.println("Module title: " + title);
        System.out.println("Module credit: " + credits);       
    }
}
