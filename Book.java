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
    

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = ("");
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
     * accessor for reference number
     * returns ZZZ if legth = 0
     * else returns reference 
     */
    public String getRefNumber()
    {
        String ref;
        String refVal= refNumber;
        
        if(refVal.length() == 0)
        {
            ref =( "ZZZ");
        }else{
            ref = refVal;
        
        }
        return ref;
    }
    public void setRefNumber(String ref)
    {
       ref = ref.toString();
       refNumber= ref;
    }
     /**
     *  accessor for title 
     */
    public int getPages()
    {
        return pages;
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
     * calls each function to print formating of book
     */
    public void printDetails()
    {
        System.out.println("\n title");
        printTitle();
        System.out.println("\n author");
        printAuthor();
        System.out.println("\n # of pages");
        printPages();
        
    }// Add the methods here ...
}
