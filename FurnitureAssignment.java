import java.util.Scanner;
public class FurnitureAssignment {
  public static void main (String [] args) {
    Scanner input = new Scanner (System.in); 
    while(true) {
    System.out.println("Table Prices");
    System.out.println("\nChoose 1 for pine");
    System.out.println("\nChoose 2 for oak");
    System.out.println("\nChoose 3 for mahogany");
    System.out.println("\nChoose 4 for Exit");
    int wood = input.nextInt();
     if(wood == 4) {
      System.out.println("Thank you have a nice day!!!");
      break;
    }
    System.out.println("Size: (1) large or (2) small");
    int size = input.nextInt();

    double cost = 0.00;
    if (wood == 1) {
       cost = 100.00;
       System.out.println("Wood: Pine");
    }
    else if (wood == 2) {
       cost = 225.00;
       System.out.println("Wood: Oak");
    }
    else if (wood == 3) {
       cost = 310.00;
       System.out.println("Wood: Mahogany");
    }
    double total = 0.00;
    if (size == 1) {
    total = cost + 35;
    System.out.println("Size; large");
    }
    else if (size == 2) {
      total = cost;
    System.out.println("Size; small");
    }
    System.out.printf("Price: $%.2f\n", total);
    
  }
  }
}
