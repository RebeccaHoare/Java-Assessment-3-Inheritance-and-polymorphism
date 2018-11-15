

/**
 * The test class DatabaseTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DatabaseTest extends junit.framework.TestCase
{
    /**
     * Default constructor for test class DatabaseTest
     */
    public DatabaseTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    protected void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    protected void tearDown()
    {
    }
    
    public void testAll()
    {
        // Creat new database
        System.out.println("1. Create new Database");
        Database db = new Database();
        
        //create new book
        System.out.println("2. Create new Books");
        Book b1 = new Book("Objects First with Java",20012, "Barnes & Kolling", "Prentice Hall" );
        Book b2 = new Book ("Book 2", 2002, "author 2", "publisher 2");
        Book b3 = new Book ("Book 3", 2002, "author 3", "publisher 3");
        Book b4 = new Book ("Book 4", 2007, "author 4", "publisher 4");
        
        // Add publication to database
        System.out.println("3. Add publications to database");
        db.addPublication(b1);
        db.addPublication(b2);
        db.addPublication(b3);
        db.addPublication(b4);
        
        // Test printPublicationsInYear method
        System.out.println("4. Tests the printPublicationsInYear method");
        System.out.println("     In this case it will print all Publications published in 2002 ");
        db.printPublicationsInYear(2002);
        
        //Test the deletePublicationsBefore Method
        System.out.println("5. Tests the deletePubliationsBefore method");
        System.out.println("       In this case it will delete all publications before 2007");
        db.deletePublicationsBefore(2007);
        
        
        // create new Journal
        System.out.println("6. Creae 4 new Journals");
        Journal j1 = new Journal("Journal 1", 1999, 8);
        Journal j2 = new Journal("Journal 2", 2000, 6);
        Journal j3 = new Journal("Journal 3", 2002, 4);
        Journal j4 = new Journal("Journal 3", 2002, 4);
        
        //Test boolean equals method
        System.out.println("7. Test the public Boolean equals method in Journal");
        System.out.println("This one should return true");
        j3.equals(j4);
        System.out.println("This one should return false");
        j2.equals(j3);
        
        //Test toString method
        System.out.println("8. Test toString method in Journal");
        j1.toString();
        
        //Creates new TravelGuide
        System.out.println("9. Create new Travelguide");
        TravelGuide tg1 = new TravelGuide("TravelGuide 1", 2006, "author 1", "Publisher 1"); 
        
        //Tests toString method in Travelguide
        System.out.println("10. Tests toString method in Travelguide");
        tg1.toString();
      
        
    }
}
