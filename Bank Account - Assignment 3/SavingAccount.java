import java.util.Scanner;

public class SavingAccount extends Account {
    
    private static double annualInterest = 0.0025;
    

    public SavingAccount(double init_balance, double annualInterest){
        super(init_balance);
        this.annualInterest = annualInterest;
    }

    public boolean monthlyInterestDeposit(){
        double monthlyprofit = getBalance() * (annualInterest/12/100);
        return true;
    }

    public boolean withdraw(double amount){

       if(amount > 0 && amount <= getBalance()){
        return super.withdraw(amount);
       }
       return false;
    }

    @Override
   public double getBalance(){
        return super.getBalance() * (1 + annualInterest/12/100);
   }


    /*public static void DepoMethod(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount you want to deposit: ");
        double amount = sc.nextDouble();
        deposit(amount);
        
    }

    public static void WithdrawMethod(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount you want to withdraw: ");
        double amount = sc.nextDouble();

        if(withdraw(amount) == false){
            
            System.out.println("Insufficient balance.");
        }
        else{
            System.out.println("Withdraw successful.");
        }

    }

    public static double getBalance(){

        return balance;
    }

    public static double monthlyInterest(){
        return balance * Math.pow(1 + annualInterest/12,12) - balance;
    }*/
}
