package Assignment05;

import java.text.DecimalFormat;

public class SavingsAccount extends BankAccount{

  DecimalFormat df = new DecimalFormat("#.00");
  private double annualInterestRate;
  private double balance;


  public SavingsAccount(String owner, double balance, double annualInterestRate) {
    super(owner, balance);
    this.annualInterestRate = annualInterestRate;
    this.balance = balance;
  } 

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void withdraw(double amount){
    this.balance = super.getBalance() - amount;

    if(this.balance < 0){
      System.out.println("--------------------------------");
      System.out.println(getOwner() + ", you don't have enough money to withdraw!");
      System.out.println("Balance: " + df.format(super.getBalance()));
    }else {
      System.out.println("Balance: " + df.format(balance));
    }
  }

  public double getAnnualInterestRate() {
    return annualInterestRate;
  }

  


  public void depositMonthlyInterest() {
    this.balance = ((super.getBalance()* (annualInterestRate /12)) + super.getBalance());
    
    System.out.println("--------------------------------");
    System.out.println(getOwner() + " account balance with monthly interest applied: " + df.format(balance));
  }

  


 
 
  
}
