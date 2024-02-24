import java.util.Scanner;
public class BankingApplication{
    public static void main(String[] args) {
        Bankaccount object1 = new Bankaccount("Ikhlas Ahmad", "2007");
        object1.showMenu();
    }
}

class Bankaccount
{
    int balance;
    int previousTransiction;
    String customerName;
    String customerId;
    
    Bankaccount(String cname, String cid){
        customerName = cname;
        customerId = cid;
    }
    void deposit(int amount)
    {
        if(amount !=0)
        {
            balance = balance + amount;
            previousTransiction = amount;
        }
    }
    void withdraw(int amount)
    {
        if (amount !=0)
        {
            balance = balance - amount;
            previousTransiction = - amount;
        }
    }
    void getPrevioustransaction()
    {
        if(previousTransiction >0)
        {
            System.out.println("Deposited: " +previousTransiction);            
        }
        else if(previousTransiction <0)
        {
            System.out.println("Withdraw: "+Math.abs(previousTransiction));
        }
        else
        {
            System.out.println("No transaction occured");
        }
    }
        void showMenu(){
            char option = '\0';
            Scanner scanner = new Scanner (System.in);

            System.out.println("Welcome " + customerName);
            System.out.println("Your Id is " + customerId);
            System.out.println("\n");
            System.out.println("A. Check Balance");
            System.out.println("B. Deposit");
            System.out.println("C. Withdrawl");
            System.out.println("D. Previous Transaction");
            System.out.println("E. Exit");
            do{
                System.out.println("============================================================");
                System.out.println("Enter an option");
                System.out.println("============================================================");
                option = scanner.next().charAt(0);
                System.out.println("\n");
                
                switch (option) {
                    case 'A':
                    System.out.println("------------------------------------------");
                    System.out.println("Balance = " + balance);
                    System.out.println("------------------------------------------");
                    System.out.println("\n");
                    break;
                    
                    case 'B':
                    System.out.println("------------------------------------------");
                    System.out.println("Enter an amount to deposit ");
                    System.out.println("------------------------------------------");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;
                    
                    case 'C':
                    System.out.println("------------------------------------------");
                    System.out.println("Enter an amount to withdrawl: ");
                    System.out.println("------------------------------------------");
                    int amount2 = scanner.nextInt();
                    withdraw(amount2);
                    System.out.println("\n");  
                    break;
                    
                    case 'D':
                    System.out.println("------------------------------------------");
                    getPrevioustransaction();
                    System.out.println("------------------------------------------");
                    System.out.println("\n");
                    break;
                    
                    case 'E':
                    System.out.println("******************************************");
                    break;
                    
                    default:
                    System.out.println("Invalid option!! Please enter again..");
                    break;
                }
            }
            while(option != 'E');
            System.out.println("Thank you for using our services!");   
        }
}  
