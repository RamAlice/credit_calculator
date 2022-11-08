
import java.util.Arrays;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int amountOfDebtTaken = scanner.nextInt();
        int monthlyPayment = scanner.nextInt();
        int interestRate = scanner.nextInt();
        Type type = Type.BUSINESS;
        Data data = new Data(amountOfDebtTaken, monthlyPayment, interestRate, type.getType());
        data.displayInfo();
        switch (type) {
            case HUMAN:
                data.calculationHuman();
                break;
            case BUSINESS:
                data.calculationBusiness();
                break;
        }
    }
}