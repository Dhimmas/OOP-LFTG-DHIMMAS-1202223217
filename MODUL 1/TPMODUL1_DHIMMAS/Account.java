public class Account {
    private String Name;
    private String AccountNumber;
    private double Balance;

    public Account(String Name, String AccountNumber) {
        this.Name = Name;
        this.AccountNumber = AccountNumber;
        this.Balance = 0.0;
    }

    public String getName() {
        return Name;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            Balance += amount;
        } else {
            System.out.println("Jumlah deposit tidak valid");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= Balance) {
            Balance -= amount;
            return true;
        } else {
            System.out.println("Saldo tidak mencukupi atau jumlah penarikan tidak valid");
            return false;
        }
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public double getBalance() {
        return Balance;
    }

    public String getAccountInfo() {
        return "Nama: " + Name + ", Nomor Akun: " + AccountNumber + ", Saldo: " + Balance;
    }
}