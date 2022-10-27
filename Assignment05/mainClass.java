package Assignment05;

public class mainClass {
    
    
    public static void main(String[] args) {
        
    BankAccount account1 = new SavingsAccount("Emily", 200, 1);
    BankAccount account2 = new CheckingAccount("Joe", 200, 10);
    BankAccount account3 = new SavingsAccount ("Sam", 250, 0.5);

    account1.deposit(50);

    account2.withdraw(25);
    account2.processCheck(50);
    
    account1.depositMonthlyInterest();
    account3.depositMonthlyInterest();

    account1.withdraw(500);
    account2.withdraw(500);
    }
}
