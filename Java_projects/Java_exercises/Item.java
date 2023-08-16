package Java_exercises;

public class Item {
 char color;

    public int ID;
    public String descr;
    public int quantity;
    public double price;
    public char colorCode = 'U';

    public void totalPrice(){
        System.out.println("Total price is " + quantity*price);
    }

    public static void main(String[] args){
        Item obj1 = new Item();
        obj1.ID = 1;
        obj1.descr = "";
        obj1.quantity = 5;
        obj1.price = 100.00;

        obj1.totalPrice(); 
    }

    public boolean setColor(char x) {
        if (x != ' '){
         color = x;
         System.out.println(color);
         return true;
    }
    System.out.println("invalid color entered");
    return false;
    }

    public void setItemFields(String words, int num, double dubs){
        descr = words;
        quantity = num;
        price = dubs;
    }

    public void displayItem() {
        System.out.println("Item: " + descr + ", " + quantity + ", $" + price + ", " + colorCode);
    }


    public int setItemFields(String words, int num, double dubs, char cha){
        descr = words;
        quantity = num;
        price = dubs;
        colorCode = cha;
        if(cha == ' ')
        return -1;
        else 
        cha = colorCode;
        return 0;
    }

}
