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
    // Add the methods here ...
}
