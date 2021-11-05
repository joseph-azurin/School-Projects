  import java.util.Scanner;

  public class NetPay { 
  public static void main(String [] agrs){

  Scanner input= new Scanner(System.in);
  System.out.print ("Enter employee's name:"); 
  String Name = input.nextLine(); 
  
  System.out.print("Enter number of hours worked in a week:");
  double hours = input.nextInt();
  System.out.println("Enter hourly pay rate:");
  double payRate = input.nextDouble();
  System.out.print("Enter fedral tax withholding rate:");
  int federalTax = input.nextInt();
  System.out.println("Enter state tax withholding rate:");
  int stateTax = input.nextInt();
  
 
  //display output
  System.out.println("Payroll Statement");
  System.out.println("Employee Name:");
  System.out.println("Hours worked:" + hours);
  System.out.println("Pay Rate:" + payRate);
  //calculations
  double grossPay = hours * payRate;
  System.out.printf("Gross Pay: $%.2f", grossPay);
  System.out.println("\nDeductions:");
  double federalWithholding = grossPay * federalTax;
  System.out.printf("Federal Withholding (20.0) percent: $%2f", federalWithholding/100);
  double stateWithholding = grossPay * stateTax;
  System.out.printf("\nState Withholding (9.0) percent: $%.2f", stateWithholding/100);
  double totalDeduction = (federalWithholding + stateWithholding);
  System.out.printf("\nTotal Deduction: $%.2f", totalDeduction/100);
  double netPay = grossPay - totalDeduction/100;
  System.out.printf("\nNet Pay: $%.2f", netPay);
  
  

    
    
    
  }
 
   
}