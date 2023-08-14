package Java_exercises;

public class NumericManipulation {
    public static void main(String args[]){
        double price = 3.50;
        double tax = .65;
        int quantity = 5;
        double total = price * quantity * (1 + tax); 
        boolean outOfStock = false;
        String custName = "Roman";
        String itemDesc = "sock";
        if( quantity > 1){
            itemDesc += 's';
        }
        String message = custName + " wants to purchase " + quantity + " pairs of " + itemDesc + ". His total cost including tax will be " + '$' + total; 
        if(outOfStock)
            System.out.println("this item is unavailble");
        else 
        System.out.println(message);

    }

    // public static void main(Array[] args){
    //     int[] ages = new int[3];
    //     ages[0] = 67;
    //     ages[1] = 54;
    //     ages[2] = 12;
    // }
}
