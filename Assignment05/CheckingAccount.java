package Assignment05;

import java.text.DecimalFormat;

public class CheckingAccount extends BankAccount{

  private double insufficientFundsFee;
  private double balance;
  DecimalFormat df = new DecimalFormat("#.00");
  
  public CheckingAccount(String owner, double balance, double insufficientFundsFee) {
    super(owner, balance);
    this.insufficientFundsFee = insufficientFundsFee;
    this.balance = balance;
  }


  public double getInsufficientFundsFee() {
    return insufficientFundsFee;
  }


  public void setInsufficientFundsFee(double insufficientFundsFee) {
    this.insufficientFundsFee = insufficientFundsFee;
  }
  
  public void processCheck(double checkAmount){
   this.balance = super.getBalance() - checkAmount;
    if(this.balance < checkAmount){
      System.out.println("Insufficient funds");
    } else{
      System.out.println("--------------------------------");
      System.out.println(getOwner() + " account balance after check: " + df.format(this.balance));
    }
  }

  public void withdraw(double amount){
    this.balance = super.getBalance() - amount;
    if(this.balance < 0){
      this.balance -= insufficientFundsFee;
      System.out.println("--------------------------------");
      System.out.println("Owner: " + getOwner());
      System.out.println("Balance including fee: " + df.format(this.balance));
    } else {
      System.out.println("--------------------------------");
      System.out.println("Owner: " + getOwner());
      System.out.println("Balance: " + df.format(this.balance));
    }
  }

  public double getBalance() {
    return balance;
  }


  public void setBalance(double balance) {
    this.balance = balance;
  }

}
