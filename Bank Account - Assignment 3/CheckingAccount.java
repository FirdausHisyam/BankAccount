import java.util.Scanner;

public class CheckingAccount extends Account{
    private double insufficientFee;

    public CheckingAccount(double init_balance,double insufficientFee){
        super(init_balance);
        this.insufficientFee = insufficientFee;
    }

    @Override
    public  boolean withdraw(double amt){
        if (amt > 0 && amt <= getBalance() ){
            double totalWithdraw = amt ;
            balance -= totalWithdraw;
            return super.withdraw(totalWithdraw);
        }
        else if (amt > getBalance()){
            double totalWithdraw = amt + insufficientFee;
            balance -= totalWithdraw;
            return super.withdraw(totalWithdraw);
        }
        else{
            return false;
        }
        
            
    }
    

    
}
