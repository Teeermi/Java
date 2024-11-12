public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.setAccountNumber(100);
        bankAccount.setBalance(500);
        bankAccount.deposit(100);
        bankAccount.withdraw(1000);

    }
}
