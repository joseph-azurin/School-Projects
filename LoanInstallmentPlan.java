import java.util.Scanner;
    
public class LoanInstallmentPlan {
    public static void main (String [ ] args) {
      
     // aquire all input
    Scanner input = new Scanner(System.in) ;
    System.out.print("First Name:") ;
    String firstName = input.next ( ) ;
    System.out.print("Last Name:") ;
    String lastName = input.next ( ) ;
    input.nextLine() ; //clear buffer
    System.out.print("Billing Address") ;
    String address = input.next () ;
    System.out.print("Loan Amount ") ;
    double loan = input.nextDouble () ;
    System.out.print("Term of Loan") ;
    int months = input.nextInt() ;
    
    
    // display output
    System.out.println("Borrower: " + firstName + " " + lastName) ;
    System.out.println("Billing Address: " + address);
    System.out.printf("Loan Amount: $%.2f", loan) ;
    double interest = loan * 0.039;
    System.out.printf("/nInterest: $%.2f", interest);
    double totalLoan = loan + interest;
    System.out.printf("\nTotal Loan: $%.2f", totalLoan) ;
    double monthlyPayment = totalLoan / months; 
    System.out.printf("\nMonthly Payment: $%.2f", monthlyPayment) ;
                        

   
  
    
  }
      }
    
    