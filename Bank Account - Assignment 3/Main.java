import java.util.Scanner;

public class Main {
    
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Bank Account");
            System.out.println("1. Saving Account");
            System.out.println("2. Checking Account");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                     Savingoption();
                     break;
                case 2: 
                    Checkingoption();
                    break;
                case 3: 
                        System.out.println("Bye Bye");
                        System.exit(0);
                default: System.out.println("Invalid choice. PLease try again.");
            }
        }while(true);
    }

    public static void Savingoption(){

        Scanner sc = new Scanner(System.in);
        int choice;
        
            System.out.println("\nSaving Account");
            System.out.println("1. Deposit");
            System.out.println("2. Balance");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
        do{    
            System.out.print("\nChoose your option: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1: 
                    System.out.println("Amount to deposit: ");
                    double depoamt = sc.nextDouble();
                    Account.deposit(depoamt);
                    break;
                case 2: 
                    System.out.println("Balance: RM" + Account.getBalance() );
                    break;
                case 3: 
                    System.out.println("Amount to withdraw: ");
                    double withdrawamt = sc.nextDouble();
                    Account.withdraw(withdrawamt);
                    break;
                case 4: System.out.println("Returning to main menu.");
                        return;
                default: System.out.println("Invalid choice. PLease try again.");
            }
        }while(true);
    }

    public static void Checkingoption(){

        Scanner sc = new Scanner(System.in);

        int choice;
        System.out.println("\nChecking Account");
        System.out.println("1. Deposit");
        System.out.println("2. Balance");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");

        do{  
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch(choice)
            {
                case 1: 
                    System.out.println("Amount to deposit: ");
                    double depoamt = sc.nextDouble();
                    Account.deposit(depoamt);
                    break;
                case 2: 
                    System.out.println("Balance: RM" + Account.getBalance() );
                    break;
                case 3: 
                    System.out.println("Amount to withdraw: ");
                    double withdrawamt = sc.nextDouble();
                    Account.withdraw(withdrawamt);
                    break;
                case 4:
                    System.out.println("Returning to main menu.");
                    return;
                default: System.out.println("Invalid choice. PLease try again.");
            }
        }while(choice != 4);
    }
}


