import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double amountOfDebtTaken = scanner.nextDouble();
        double monthlyPayment = scanner.nextDouble();
        double interestRate = scanner.nextDouble();
        String clientType = scanner.next().toUpperCase();
        DataValidation.validateEnum(clientType);
        DataValidation.checkAmountOfDebtTaken(amountOfDebtTaken, monthlyPayment, interestRate);
        ClientData data = new ClientData(amountOfDebtTaken, monthlyPayment, interestRate, ClientType.valueOf(clientType));
        CreditCalculation.calculate(data);
    }
}