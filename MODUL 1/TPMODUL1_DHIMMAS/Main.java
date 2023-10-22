public class Main {
    public static void main(String[] args) {
        Bank eadBank = new Bank();

        Account account1 = new Account("Dhimmas_SI4605", "1202223217");
        Account account2 = new Account("Ilham_SI4605", "1202223017");
        Account account3 = new Account("Fasya_SI4605", "1202223417");

        eadBank.addAccount(account1);
        eadBank.addAccount(account2);
        eadBank.addAccount(account3);

        account1.deposit(100000.0);
        account2.deposit(200000.0);
        account3.deposit(300000.0);

        System.out.println("Saldo Akun Dhimmas : " + account1.getBalance());
        System.out.println("Saldo Akun Ilham : " + account2.getBalance());
        System.out.println("Saldo Akun Fasya : " + account3.getBalance());

        account1.deposit(50000.0);
        account2.withdraw(20000.0);

        System.out.println("Saldo Akun Dhimmas setelah menyetor : " + account1.getBalance());
        System.out.println("Saldo Akun Ilham setelah menarik : " + account2.getBalance());

        eadBank.removeAccountByName("Ilham_SI4605");
        eadBank.getAllAccounts();
    }
}
