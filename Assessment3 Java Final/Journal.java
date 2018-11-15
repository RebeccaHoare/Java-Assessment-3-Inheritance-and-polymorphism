/**
 * A simple model of a Journal
 * 
 * @author  (your name)
 * @version (a version number or a date)
 * Extends Publication makes this class the subclass of publication
 * methods can be inherited from the superclass Publication
 */
public class Journal extends Publication 
{   
    private int month;          // The month when the journal was published
    private String author;      // The author of the Journal 
    
    /**
     * Create a journal. 
     * 
     * @param title     The title of the journal.
     * @param month     The month when the journal was published.
     * @param year      The year when the journal was published.     
     */
    public Journal(String title,int year,int month)
    {
        // gets variables title and year from the superclass Publication
        super(title,year);
        this.month = month;
    }

    /**
     * 
     */
    @Override 
    public boolean equals(Object obj)
    {
        // checks if the object entered is the same the object which the method is called from
        // returns true if it is 
        if (obj == this)
        {
            return true;
        }
        // checks if the object entered isn't the same the object which the method is called from
        // returns false if its not
        if(!(obj instanceof Journal))
        {
            return false;
        }
        Journal other = (Journal) obj;
        return super.getTitle().equals(other.getTitle())
        && month == (other.month) && super.getYear() == (other.getYear());
    }
    

    /**
     * Get the month of the journal when it was published
     *  
     * @return  The month of the journal when it was published
     */
    public int getMonth()
    {
        return month;
    }
                
    
    public String toString()
    {
        // returns a the title, month and year of the Journal
        // it calls the getTitle and getYear method form the superclass publication
        return "Journal: " + super.getTitle() + " (" + getMonthName(month) + " " + super.getYear() + ") ";
    }
    
    /**
     * To get the first three letters of a given month's name
     * 
     * @param month A given month
     * @return   The first three letters of the given month's name
     */
    private String getMonthName(int month) {
        switch (month) {
            case 1: return "Jan";
            case 2: return "Feb";
            case 3: return "Mar";
            case 4: return "Apr";
            case 5: return "May";
            case 6: return "Jun";
            case 7: return "Jul";
            case 8: return "Aug";
            case 9: return "Sep";
            case 10: return "Oct";
            case 11: return "Nov";
            case 12: return "Dec";
            default: return "Unknow";
        }
    }    
}
