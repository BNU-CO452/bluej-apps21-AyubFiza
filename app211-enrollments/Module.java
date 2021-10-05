
/**
 * Write a description of class Module here.
 *
 * @author Fiza Ayub
 * @version 05/10/21
 */
public class Module
{
    // instance variables - replace the example below with your own
    private String code; 
    private String title;
    private int credit;
    /**
     * Constructor for objects of class Module
     */
    public Module()
    {
        this.code = code;
        this.title = title;
        this.credit = 0;
    }

    public void setCredits(int credit)
{
    this.credit = credit;
}
    
    
    
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param 
     * @return credit
     */
    public int getCredit()
    {
        // put your code here
        return credit;
    }


public String getCode()
{
    return code;
}

public String getTitle()
{
    return title;
}

/**
 * Print the details of the course, the list
 * of students enrolled and the module
 */
public void print()
{
    System.out.println(" Module Code: " + code + " : " + title + " " + credit);
    System.out.println();
}

public void setCredits(int credit)
{
    this.credit = credit;
}