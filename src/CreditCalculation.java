
public class CreditCalculation {

    public static void calculate(ClientData data) throws Exception {
        switch (data.getCustomerType()) {
            case HUMAN:
                calculateOverpaymentTypeHuman(data);
                break;
            case BUSINESS:
                calculateOverpaymentTypeBusiness(data);
                break;
        }
    }

    private static void calculateOverpaymentTypeHuman(ClientData data) throws Exception {
        checkAmountOfDebtTaken(data.getAmountOfDebtTaken());
        double sum = data.getAmountOfDebtTaken(); // долгу присваивается значение взятой суммы
        double interest; // вводим переменную отвечающию за сумму процентов
        double overpayment = 0;
        while (true) {
            interest = sum * data.getInterestRate() / 100;  // считаем % от суммы
            overpayment += interest; // считаем увеличение долга
            sum += interest;  // сумма + процент
            sum -= data.getMonthlyPayment() * 12; // после ежемесячных выплат
            if (sum <= 0)
                break;
            if (sum >= data.getAmountOfDebtTaken()) {
                throw new Exception("throws Exception"); // проверяем, что кредит можно выполнить
            }
        }
        System.out.println(overpayment);
    }

    private static void calculateOverpaymentTypeBusiness(ClientData data) throws Exception {
        checkAmountOfDebtTaken(data.getAmountOfDebtTaken());
        double sum = data.getAmountOfDebtTaken(); // долгу присваивается значение взятой суммы
        double interest; // вводим переменную отвечающию за сумму процентов
        double overpayment = 0;
        while (sum > 0) {
            sum -= data.getMonthlyPayment() * 12;// сделать прекращение, когда будет 0;
            if (sum <= 0)
                break;
            if (sum >= data.getAmountOfDebtTaken()) {
                throw new Exception("throws Exception");
            }
            interest = sum * data.getInterestRate() / 100;  // считаем % от суммы
            overpayment += interest; // считаем увеличение долга
            sum += interest;  // сумма + процент
        }
        System.out.println(overpayment);
    }

    private static void checkAmountOfDebtTaken(double amountOfDebtTaken) throws Exception {
        if (amountOfDebtTaken <= 0) {
            throw new Exception("throws Exception"); // проверяю, что сумма не отрицательная
        }
    }
}
