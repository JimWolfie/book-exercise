/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */

class Book
{
     // The fields.
    private String author;
    private String title;
    private String refNumber;
    private int pages;
    private int borrowed;
    

    /**
     * public Constructor 
     * Author, title, and pages fields are arguments on construction
     * refNumber and borrowed counts are defaulted to "" and 0
     */
    public Book(String author, String title, int pages)
    {
        this.author = author;
        this.title = title;
        this.pages = pages;
        refNumber = ("");
        borrowed = 0;
        
    }
    /**
     *  Accessor for author 
     */

    public String getAuthor()
    {
        return author;
    }
    /**
     *  accessor for title 
     */
    public String getTitle()
    {
        return title;
    }
    /**
     * public String
     * accessor for reference number
     * returns ZZZ if legth = 0
     * else returns reference 
     * zzz means no reference set. Reference setting has check 
     * for correct length built in
     */
    public String getRefNumber()
    {
        String ref;
        
        if(this.refNumber.length() == 0)
        {
            return ref =( "ZZZ");
        }else{
            return this.refNumber;
        
        }
    }
    /**
     * public void
     * sets reference number for book
     */
    public void setRefNumber(String refNumber)
    {
       if(refNumber.length() < 3)
       {
            System.out.println("Error, refNumber must be at least 3 characters");
       }else{
            this.refNumber = refNumber.toString();
       }
       
    }
     /**
      * public int
     *  accessor for title 
     */
    public int getPages()
    {
        return this.pages;
    }
    /**
     * public int
     * accessor for borrowed.
     * returns a tally that show how many times book was borrowed
     * 
     */
    public int getBorrowed()
    {
        return this.borrowed;
    
    }
    /**
     * public void
     * mutator method to increment borrowed count
     * borrowed = borrowed +1; 
     * 
     */
    public void borrow()
    {
        borrowed += 1;
        return; 
    }
    /**
     * public void 
     * prints author 
     */
    public void printAuthor()
    {
        String a = getAuthor();
        System.out.println(a);
    }
    /**
     * public void 
     * prints title
     */
    public void printTitle()
    {
        String a = getTitle();
        System.out.println(a);
    }
    /**
     * public void 
     * prints pages as string
     */
    public void printPages()
    {
        int a = getPages();
        System.out.println(Integer.toString(a));
    } 
    /**
     * public void
     * prints borrowed as strong 
     */
    public void printBorrowed()
    {
        int a = getBorrowed();
        System.out.println(Integer.toString(a));
    }
    /**
     * public void 
     * calls each print function 
     */
    public void printDetails()
    {
        System.out.println("\n title");
        printTitle();
        System.out.println("\n author");
        printAuthor();
        System.out.println("\n # of pages");
        printPages();
        System.out.println("\n # of times borrowed");
        printBorrowed();
        
    } // Add the methods here ...
}
