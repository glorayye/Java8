package Java_exercises;

public class ShoppingCart {
    public static void main(String[] args){
        System.out.println("This is a test of the shopping cart class");

        Item item1 = new Item();
        item1.setColor('d');
        item1.setItemFields("socks",56, 2.3, ' ');
        item1.displayItem();
        // System.out.println(item1.color);
        // System.out.println(item1.setColor(' '));

        Book book1 = new Book("yellow", "jammy", 1624, true );
        book1.returnBook(true);



    }
}
