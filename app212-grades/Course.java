import java.util.ArrayList;
/**
 * This class stores information about a course
 * that enrolled students may want to complete.
 *
 * @author Fiza Ayub
 * @version 24/10/2021
 */
public class Course
{
    public final static int MAXN_MODULES = 4;
    public final static int MAXN_STUDENTS = 4;
    
    public ArrayList<Module> modules;
    public ArrayList<Student> students;
    
    private String code;
    private String title;
    
    private Grades finalGrade;
    
    /**
     * This constructor creates a new course with a fixed code and title.
     */
    public Course()
    {
        this("B400", "Bsc Business Management and Information Technology");
    }
    /**
     * Constructor for objects of class Course.
     */
    public Course(String code, String title)
    {
        // initialise instance variables
        this.code = code;
        this.title = title;
        
        modules  = new ArrayList<Module>();
        students = new ArrayList<Student>();
        
        createModules();
    }
    /**
     * This method creates four predetermined modules, and is used to speed up the testing of an app each time it is booted and run.
     */
    public void createModules()
    {
        Module co452 = new Module ("CO452", "Programming Concepts");
        Module co456 = new Module ("CO456", "Web Development");
        Module co454 = new Module ("CO454", "Digital Technologies");
        Module co450 = new Module ("CO450", "Computer Architectures");
        addModule(co452);
        addModule(co456);
        addModule(co454);
        addModule(co450);
    }

    /**
     * Adds a module to the course.
     */
    public void addModule(Module module)
    {
        if(modules.size() < MAXN_MODULES)
        {
            modules.add(module);
        }
    }
    
    /**
     * Adds a student to the course.
     */
    public void addStudent(Student student)
    {
        if(students.size() < MAXN_STUDENTS)
        {
            students.add(student);
        }
    }
    /**
     * This method converts input marks into Grade values.
     */
    public Grades convertToGrade(int mark)
    {
        if(mark >= 0 && mark <= 39)
            return Grades.F;
        else if(mark >= 40 && mark <= 49)
            return Grades.D;
        else if(mark >= 50 && mark <= 59)
            return Grades.C;
        else if(mark >= 60 && mark <= 69)
            return Grades.B;
        else if(mark >= 70 && mark <= 100)
            return Grades.A;
        else 
            return Grades.NS;
    }
    /**
     * Calculate the average mark from the four module marks
     * and convert that into a final grade.
     */
    public Grades calculateGrade(ArrayList<ModuleMark> marks)
    {
        int total = 0;
        int finalMark = 0;
        for(ModuleMark mark : marks)
        {
            total = total + mark.getValue();
        }
        finalMark = total / 4;
        finalGrade = convertToGrade(finalMark);
        return finalGrade;
    }
    
    /**
     * Prints out the details of a course and the
     * four modules.
     */
    public void print()
    {
        System.out.println();
        System.out.println(" Course " + code + ": " + title);
        //System.out.println();
        
        printModules();
    }
    
    /**
     * Print the course's four modules.
     */
    public void printModules()
    {
        for (Module module : modules)
        {
            module.print();
            module.printCredit();
        }
    }
    
    /**
     * Print's the course's four students.
     */
    public void printStudents()
    {
        for (Student student : students)
        {
            student.print();
        }
    }
}
