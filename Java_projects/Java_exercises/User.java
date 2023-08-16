package Java_exercises;

public class User {
    
    public User(){
        String name;
        int userId;
        boolean checkedOutBooks;
    }

    public void borrowBook(){

    }

    public boolean returnBook(boolean isbookReturned){
        return isbookReturned;
    }

    public static void main(String[] args){
        User user1 = new User();
        Book book1 = new Book();

        
        book1.setBook("Yellow", "Henrietta", 12454, true);
        System.out.println(book1);
        book1.returnBook();
    
    }
}
