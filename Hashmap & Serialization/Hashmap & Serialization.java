import java.util.*;
import java.io.*;

class Book implements Serializable{
    protected int bookID;
    protected String title;
    protected String author;
    protected boolean isAvailable;

    public Book(int bookID, String title, String author){
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String toString(){
        return "Book ID: " + bookID + "\nTitle: " + title + "\nAuthor: " + author + "\nAvailable: " + isAvailable + "\n";
    }
}

class LibraryManager{
    private HashMap<Integer, Book> books = new HashMap<>();

    public void addBook(int bookID, String title, String author){
        if (books.containsKey(bookID)){
            System.out.println("Book with same ID already exist!");
        } else {
            books.put(bookID, new Book(bookID, title, author));
        }
    }

    public void borrowBook(int bookID){
        if (books.containsKey(bookID)){
            if (books.get(bookID).isAvailable){
                books.get(bookID).isAvailable = false;
                System.out.println("Book Borrowed: " + books.get(bookID).title);
            } else {
                System.out.println("Book Borrowed: Book is already borrowed :(");
            }
        } else {
            System.out.println("Book Borrowed: Book not Found :(");
        }
    }

    public void returnBook(int bookID){
        if (books.containsKey(bookID)){
            if (!books.get(bookID).isAvailable){
                books.get(bookID).isAvailable = true;
                System.out.println("Book returned: " + books.get(bookID).title);
            } else {
                System.out.println("Book Returned: Book is not borrowed yet :(");
            }
        } else {
            System.out.println("Book Returned: Book not found :(");
        }
    }

    public void displayBooks(){
        System.out.println("Books Details:\n----------------------");
        for (Book book : books.values()){
            System.out.println(book.toString());
        }
    }


    public void saveToFile(){
        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("books.txt"));
            out.writeObject(books);
            System.out.println("Books data saved successfully in file:)");
            out.close();
        } catch (IOException e){
            System.out.println("Exception Occurred in saving data to file: " + e.getMessage());
        } 
    }

    public void loadFromFile(){
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("books.txt"));
            books = (HashMap<Integer, Book>) in.readObject();
            System.out.println("Data loaded Successfully form file :)");
            in.close();
        } catch (IOException | ClassNotFoundException e){
            System.out.println("Error Occurred in loading the data: " + e.getMessage());
        }
    }
}

public class BSDSF22M021_WEB_LAB06 {

    public static void main (String[] args){

        LibraryManager library;
        library = new LibraryManager();

        library.addBook(1, "Java Book", "Hassan Khan");
        library.addBook(2, "IS Book", "Arif Butt");
        library.addBook(3, "CN Book", "Nadeem Majeed");

        library.displayBooks();
        System.out.println("====================================");

        library.borrowBook(1);
        System.out.println("Status After Borrow book with BookID 1");
        library.displayBooks();
        System.out.println("====================================");

        library.borrowBook(5);
        library.borrowBook(1);

        System.out.println("===================================="); 
        library.returnBook(1);
        System.out.println("Status After Return book with BookID 1");
        library.displayBooks();
        System.out.println("====================================");

        library.returnBook(6);
        library.returnBook(2);

        System.out.println("====================================");        
        library.saveToFile();
        library.loadFromFile();
        System.out.println("====================================");

        System.out.println("Books after loading from file:\n\n");
        library.displayBooks();
        System.out.println("====================================");

        
    }
}