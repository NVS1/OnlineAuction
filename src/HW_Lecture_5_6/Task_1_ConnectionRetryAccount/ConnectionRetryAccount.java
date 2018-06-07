package HW_Lecture_5_6.Task_1_ConnectionRetryAccount;

public class ConnectionRetryAccount implements Account {
    private final Account account;
    private final int retries;

    public ConnectionRetryAccount(Account account, int retries) {
        this.account = account;
        this.retries = retries;
    }

    @Override
    public void withdraw(long money) throws AccountException {
        for (int i = 1; i <= retries; i++) {
            try {
                account.withdraw(money);
                break;
            } catch (AccountConnectionException e) {
                System.out.println(e.getMessage());
            } catch (AccountException e) {
                System.out.println(e.getMessage());
                break;
            }
        }
    }
}
