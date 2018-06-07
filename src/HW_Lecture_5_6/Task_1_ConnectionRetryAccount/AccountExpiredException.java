package HW_Lecture_5_6.Task_1_ConnectionRetryAccount;

public class AccountExpiredException extends AccountException{
    public AccountExpiredException(String message) {
        super(message);
    }

    public AccountExpiredException(String message, Throwable cause) {
        super(message, cause);
    }
}
