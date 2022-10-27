package Assignment05;

import java.text.DecimalFormat;

public class BankAccount {
  
  DecimalFormat df = new DecimalFormat("#.00");
  private String owner;
  private double balance;

  public BankAccount(String owner, double balance) {
    this.owner = owner;
    this.balance = balance;
  }

  void deposit(double amount) {
    this.balance += amount;
    System.out.println("--------------------------------");
    System.out.println("Owner: " + owner);
    System.out.println("Balance: " + df.format(balance));
  }

  void withdraw(double amount) {
    this.balance -= amount;
    System.out.println("--------------------------------");
    System.out.println("Owner: " + owner);
    System.out.println("Balance: " + df.format(balance));
  }

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }


  public void depositMonthlyInterest() {
  }

  public void processCheck(double checkAmount){
    System.out.println(owner);
  }
  // public void depositMonthlyInterest() {
  //   this.balance = (this.balance + 50);

  // }

    public void transfer(){
      System.out.println("--------------------------------");
      System.out.println("Owner: " + getOwner());
    }
  // public void depositMonthlyInterest(){
  //   //balance = balance + 2;
  // }
}
