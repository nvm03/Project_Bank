public class Account {
    Exception NotEnoughMoneyException = new Exception();
    String owner;
    int balance;
    String accountNumber;
    public Account(String owner, int balance, String accountNumber){
        this.owner = owner;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void Przelew(int amount) throws NotEnoughMoneyException {
        if (balance >= amount){
            balance = balance - amount;
        }
        else{
            System.out.println("Za malo srodkow na koncie");
            throw new NotEnoughMoneyException("Za malo srodkow na koncie");
        }
    }

}
