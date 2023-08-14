package Java_exercises;

public class NumericManipulation {
    public static void main(String args[]){
        double price = 3.50;
        double tax = .65;
        int quantity = 5;
        double total = price * quantity * (1 + tax); 
        String custName = "Roman Reigns";
        String itemDesc = "socks";
        String message = custName + " wants to purchase " + quantity + " pairs of " + itemDesc + ". His total cost including tax will be " + '$' + total; 
        System.out.println(message);
    }
}
