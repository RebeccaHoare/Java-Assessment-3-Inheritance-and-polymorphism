import java.util.ArrayList;

/**
 * A database for collections of publications, e.g. books and journals
 * 
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Database 
{
    // Array list of the collection of Publications
    private ArrayList<Publication> publicationList;
    
    /**
     * Create a new database
     */
    public Database()
    {
        // Creates new Array List
        publicationList = new ArrayList<Publication>();
    }
    
    /**
     * Add a new publicayion
     * 
     * @param newPublication The publication to be added
     */
    public void addPublication(Publication newPublication) {
        // Checks if the array list of Publications contains a publication 
        // which has the same information as the publication just created 
        if(publicationList.contains(newPublication))
        {
            // prints out a message saying that the publication already exists
            System.out.println("The following publication already exists: ");
            // prints out the details of the publication
            System.out.println(newPublication);
        }
        else {
            // if the publication doesn't exist then the publiction is added to the array list
            publicationList.add(newPublication);   
        }
    }    
               
    
    /**
     * Get the total number of collections 
     * 
     * @return The total number of collections  
     */
    public int getTotal() {
        return publicationList.size() ;
    }    
    
    /** 
     * This is the print list method that prints the string returned by the toString() method from 1b)
     * for(Journal j: journalList)
       {
        System.out.print(j.toString());
       }
     * Print the details of all collections
     */
    public void printList() {
       // This method prints all the information of the publication in the array list
       {
           // this refers to the array list of publications
           for(Publication p: publicationList)
           {
               // this prints out all the publications in the arrayList
               System.out.println(p);
           }
       }
       
    } 
    
    
    public void printPublicationsInYear(int year)
        // This method prints all the publications that were published in the year that the user enters
    {
        // this refers to the array list of publications
        for(Publication p: publicationList)
           {
               // this checks if the year entered matched the year of publication any of the publications
               if(year == p.getYear())
               {
                   // This prints the details of the publications that were published in that year 
                   System.out.println("Publication - Title: " + p.getTitle() + " Year: " + p.getYear()); 
               }
           }
    }
    
    public void deletePublicationsBefore(int year)
    {
        int index = 0;
        for(int p = publicationList.size()-1; p >= 0; p--)
           {
               if(publicationList.get(p).getYear()<year)
               {
                   publicationList.remove(p);
                   index++;
               }
           }
           System.out.println("number of Publications deleted: " + index);
    }
}
