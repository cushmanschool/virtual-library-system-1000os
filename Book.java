public class Book{
    private String title;
    private String author;
    private String ISBN;
    private boolean isAvailable = true;

    // Constructor
    public Book (String bookTitle, String Author, String isbn){
        title = bookTitle;
        author = Author;
        ISBN = isbn;
    }

    //Accesors
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }
    public String getISBN(){
        return ISBN;
    }
    public boolean isAvailable(){
        return isAvailable;
    }

    //Mutator
    public void setAvailability (boolean state){
        isAvailable = state;
    }
}