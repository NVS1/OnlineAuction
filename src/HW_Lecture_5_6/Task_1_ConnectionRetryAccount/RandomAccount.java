package HW_Lecture_5_6.Task_1_ConnectionRetryAccount;

public class RandomAccount implements Account{
    private final double notEnoughFundsProbability;
    private final double accountExpiredProbability;
    private final double lostConnectionProbability;

    public RandomAccount(double notEnoughFundsProbability, double accountExpiredProbability, double lostConnectionProbability) {
        this.notEnoughFundsProbability = notEnoughFundsProbability;
        this.accountExpiredProbability = accountExpiredProbability;
        this.lostConnectionProbability = lostConnectionProbability;
    }

    @Override
    public void withdraw(long money) throws AccountException {
        double n = Math.random();
        if (n>0 && n<notEnoughFundsProbability){
            throw new NotEnoughFundsException("Недостаточно денег на счету");
        }else if (n>notEnoughFundsProbability && n< notEnoughFundsProbability+accountExpiredProbability){
            throw new AccountExpiredException("Срок действия счета истек");
        } else if (n>notEnoughFundsProbability+accountExpiredProbability && n<notEnoughFundsProbability+accountExpiredProbability+lostConnectionProbability){
            throw new AccountConnectionException("Ошибка соединения");
        } else {
            System.out.println("Success withdraw");
        }
    }
}
