    import java.util.Scanner;
    public class CashRegister1 {
    public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Event Ticket Reservation (Cash Only)");
    System.out.print("\nName of Customer:");
    String customerName = input.nextLine();
    System.out.print("Date of Reservation:");
    String date = input.next();
    System.out.print("Number of Ticket(s):");
    int numberOfTicket = input.nextInt();
    double costOfTicket = 25.50;
    double totalCost =  costOfTicket * numberOfTicket;
    double tax = 0.07;
    double saleTax = totalCost * tax;
    double balanceDue = totalCost + saleTax;
    System.out.println("Reservation Details");
    System.out.println("Name of Customer: " + customerName);
    System.out.println("Date of Reservation: " + date);
    System.out.println("Number of Ticket(s): " + numberOfTicket);
    System.out.printf("Cost of Ticket(s) (%.2f x %d): $%.2f", costOfTicket, numberOfTicket, totalCost) ; 
    System.out.printf("\nSales Tax: $%.2f", saleTax);
    System.out.printf("\nBalance Due: $%.2f", balanceDue);
    System.out.print("\nCash Received: $");
    double cash = input.nextDouble();
    double change = cash - balanceDue;
    System.out.printf("Change Due: $%.2f\n", change);
    System.out.println("Thank you for your reservation.") ;
 
  
  
  
  }
}