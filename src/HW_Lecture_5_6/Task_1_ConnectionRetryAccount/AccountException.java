package HW_Lecture_5_6.Task_1_ConnectionRetryAccount;

public class AccountException extends Exception {
    public AccountException(String message) {
        super(message);
    }

    public AccountException(String message, Throwable cause) {
        super(message, cause);
    }
}
