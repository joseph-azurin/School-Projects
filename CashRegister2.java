import java.util.Scanner;
public class CashRegister2 {
  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Event Ticket Reservation (Cash Only)");
    System.out.print("\nName of Customer:");
    String customerName = input.nextLine();
    System.out.print("Date of Reservation:");
    String date = input.next();
    System.out.print("Number of Ticket(s):");
    int numberOfTicket = input.nextInt();
    double rate = 0;
    if(numberOfTicket > 10) {
      rate = 0.10;
    }
    else if(numberOfTicket > 5) {
      rate = 0.05; 
    }
    double costOfTicket = 25.50;
    double subTotal =  costOfTicket * numberOfTicket;
    double discount = subTotal * rate;
    double totalCost = subTotal - discount;
    double tax = 0.07;
    double saleTax = totalCost * tax;
    double balanceDue = totalCost + saleTax;
    System.out.println("Reservation Details");
    System.out.println("Name of Customer: " + customerName);
    System.out.println("Date of Reservation: " + date);
    System.out.println("Number of Ticket(s): " + numberOfTicket);
    System.out.printf("Cost of Ticket(s) (%.2f x %d): $%.2f", costOfTicket, numberOfTicket, subTotal); 
    System.out.printf("\nDiscount: ($%.2f)", discount);
    System.out.printf("\nTotal Cost: $%.2f", totalCost);
    System.out.printf("\nSales Tax: $%.2f", saleTax);
    System.out.printf("\nBalance Due: $%.2f", balanceDue);
    System.out.print("\nCash Received: $");
    double cash = input.nextDouble();
    double change = cash - balanceDue;
    System.out.printf("Change Due: $%.2f\n", change);
    System.out.println("Thank you for your reservation.");
  }
}