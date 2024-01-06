public class Account{
    protected  double balance = 0;

    public Account(double init_balance){
        this.balance = init_balance;
    }

    public double getBalance(){
        return balance;
    }

    public boolean deposit(double amt){
        
        if(amt > 0){
            balance += amt;
            return true;
        }
        else{
            return false;
        }
    }

    public  boolean withdraw(double amt){
        
        if(amt > 0 && amt <= balance){
            balance -= amt;
            return true;
        }
        else{
            return false;
        }
    }
}

