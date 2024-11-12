public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;


    public void setAccountNumber(int accountNumber) {
         this.accountNumber = accountNumber;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getEmail() {
        return email;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println(balance);
    }

    public void withdraw(double amount) {
        if(this.balance >= amount) {
            this.balance -= amount;
            System.out.println(this.balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }


}
