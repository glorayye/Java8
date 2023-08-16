package Java_exercises;

public class Book {

    String title;
    String author;
    int ISBN;
    boolean checkedOut;

    public void setBook(String bookName, String authorName, int ISBNum, boolean isCheckedOut) {
        title = bookName;
        author = authorName;
        ISBN = ISBNum;
        checkedOut = isCheckedOut;
        System.out.println();
    }

    public void checkout() {

    }

    public boolean returnBook() {
        if (!checkedOut)
            System.out.print("This book is available to rent");
        else
            System.out.print("This book is currently unavailable rent, try back later");
        return checkedOut;
    }

}