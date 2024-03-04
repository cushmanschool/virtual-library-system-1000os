import java.util.ArrayList;

public class Library{

    private ArrayList<Book> books;
    //Constructor
    public Library()
    {
        books = new ArrayList<Book>();
    }

    public void addBook( Book x){
        books.add(x);
    }

    public void lendBook(String isbn){
        for (int i = 0; i < books.size(); i++){
            if (books.get(i).getISBN() == isbn){
                books.get(i).setAvailability(false);
            }
        }
    }

    public ArrayList<Book> displayAvailableBooks(){
        ArrayList<Book> FreeBooks = new ArrayList<Book>();
        for (int i = 0; i < books.size(); i++){
            if (books.get(i).isAvailable()){
                FreeBooks.add(books.get(i));
            }
        }
        return FreeBooks;
        
    }
    
}