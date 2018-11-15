
/**
 * Write a description of class Publication here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * Superclass, with the subclasses Book and Journal
 */
public  class Publication
{
    // variables which were moved from book and Journal 
    private String name;
    private int yr;

    /**
     * Constructor for objects of class Publication
     */
    public Publication(String title, int year)
    {
        // this is the constructor that iniates the variables 
        name = title;
        yr = year;
    }

    public String getTitle()
    {
        // new getTitle method which can be called from the subclasses so they can access the title
        return name;
    }
    
    public int getYear()
    {
        // new getYear method which can be called from the subclasses so they can access the year
        return yr;
    }
}
