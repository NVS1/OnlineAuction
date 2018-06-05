package Task_1_ConnectionRetryAccount;

public class AccountRunner {
    public static void main(String[] args) {
        Account account = new RandomAccount(0.2,0.2,0.5);
        Account connectionRetryAccount = new ConnectionRetryAccount(account,5);

        try {
            connectionRetryAccount.withdraw(1000);
        } catch (AccountException e) {
            e.printStackTrace();
        }
    }
}
