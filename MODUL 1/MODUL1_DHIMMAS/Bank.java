import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accountList = new ArrayList<>();

    public void addAccount(Account account) {
        accountList.add(account);
    }

    public void removeAccount(String accountNumber) {
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getAccountNumber().equals(accountNumber)) {
                accountList.remove(i);
                System.out.println("Akun dengan nomor akun " + accountNumber + " sudah dihapus.");
                return;
            }
        }
        System.out.println("Akun dengan nomor akun " + accountNumber + " tidak ditemukan.");
    }

    public void removeAccountByName(String accountName) {
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getName().equals(accountName)) {
                accountList.remove(i);
                System.out.println("Akun dengan nama " + accountName + " sudah dihapus.");
                return;
            }
        }
        System.out.println("Akun dengan nama " + accountName + " tidak ditemukan.");
    }

    public Account getAccount(String accountNumber) {
        for (Account account : accountList) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public void getAllAccounts() {
        System.out.println("Daftar Semua Akun dalam Bank:");
        for (Account account : accountList) {
            System.out.println(account.getAccountInfo());
        }
    }
}
