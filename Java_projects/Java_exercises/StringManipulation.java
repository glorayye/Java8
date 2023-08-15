package Java_exercises;

public class StringManipulation {
   public static void main(String[] args){
    String custName = "Roman";
    String itemDesc = "socks";
    String[] items = {"shirt", "pants", "tie", "socks"};
    String message = custName + " would like to purchase " + items.length + ' ' + itemDesc + '.';
    String[] itemz = new String[4];
    for (String item: items){    //loops 
      System.out.println("item: " + item );
    } 
      message = custName + " wants to purchase " + items.length + " items consisting of " + itemz;

      System.out.println(message);
      
   } 
}
