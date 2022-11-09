import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double amountOfDebtTaken = scanner.nextDouble();
        double monthlyPayment = scanner.nextDouble();
        double interestRate = scanner.nextDouble();
        CustomerType customerType = CustomerType.valueOf(scanner.next().toUpperCase());
        ClientData data = new ClientData(amountOfDebtTaken, monthlyPayment, interestRate, customerType);
        CreditCalculation.calculate(data);
    }
}