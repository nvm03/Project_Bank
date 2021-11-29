public class Main {
    public static void main(String[] args) throws NotEnoughMoneyException {
        Account acc = new Account("Stanislav Riznyk", 5000, "23453");
        System.out.println("Account owner: " + acc.owner);
        System.out.println("Account balance: " + acc.balance);
        System.out.println("Account number: " + acc.accountNumber);

        try{
            acc.Przelew(5000);
        }
        catch (NotEnoughMoneyException e){
            System.out.println(e);
            e.printStackTrace();
        }
        finally {
            System.out.println("Zostalo " + acc.balance + "zl na koncie");
        }


    }
}
