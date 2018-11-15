
/**
 * Write a description of class TravelGuide here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * Extends Book makes this class the subclass of Book
 * methods can be inherited from the superclass Book
 */
public class TravelGuide extends Book
{
    private String Country;     // The country of the Travelguide

    /**
     * Constructor for objects of class TravelGuide
     */
    public TravelGuide(String title,int year, String author, String publisher)
    {
        // gets variables title, year, author and publisher from superclass Book
        super(title, year, author, publisher);
        // sets the default country as the UK
        this.Country = "UK";
    }

    public void setCountry(String Country)
    {
        // Mutator method that means the user can change the name of the country
        this.Country = Country;
    }
    
    public String getCountry()
    {
        // accessor method that allows the user to access the name of the country
        return Country;
    }
    
    public String toString()
    {
        // toString method that returns info about the travelguide
        // THis toString method calls the toString method from its superclass book
        return "Travel Guide " + super.toString() + " Country: " + Country;
    }
}
