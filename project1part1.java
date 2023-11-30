import java.util.Scanner;
public class project1part1 {
public static void main(String[] args){
      int Quarter, Dime, Nickel, Penny, amount2, amount;
      System.out.print("Enter price of an item that you wish to purchase ");
      System.out.println("(from 25 cents to a dollar, in 5-cent increments:).");
      Scanner keyboard = new Scanner (System.in);
      amount = keyboard.nextInt();
      System.out.println("You bought an item for " + amount + " cents and gave me a dollar,");
      System.out.println("Wow thats cheap!");
      int amount3 = 100;
      amount2 = amount3 - amount;
      Quarter = amount2 / 25;
      amount2 = amount2 % 25;
      Dime = amount2 / 10;
      amount2 = amount2 % 10;
      Nickel = amount2 / 5;
      amount2 = amount2 % 5;
      Penny = amount2;
      System.out.println("So your change is");
      System.out.println(Quarter + " Quaters");
      System.out.println(Dime + " Dimes");
      System.out.print(Nickel + " Nickel and ");
      System.out.println(Penny + " Pennies" );
    }    
}
