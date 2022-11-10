

public class DataValidation {

    public static void validateEnum(String clientType) throws Exception {
        try {
            ClientType.valueOf(clientType);
        } catch (IllegalArgumentException e) {
            throw new Exception("throws Exception");
        }
    }

    public static void checkAmountOfDebtTaken(double amountOfDebtTaken, double monthlyPayment, double interestRate) throws Exception {
        if (amountOfDebtTaken <= 0 || monthlyPayment <= 0 || interestRate <= 0) {
            throw new Exception("throws Exception");
        }
    }
}