

public class Data {
    private final int amountOfDebtTaken;
    private final int monthlyPayment;
    private final int interestRate;
    private final String customerType;

    public Data(int amountOfDebtTaken, int monthlyPayment, int interestRate, String customerType) {
        this.amountOfDebtTaken = amountOfDebtTaken;
        this.monthlyPayment = monthlyPayment;
        this.interestRate = interestRate;
        this.customerType = customerType;
    }

    public void displayInfo() {
        System.out.printf("amountOfDebtTaken: %d \tmonthlyPayment: %d \t interestRate: %d \t customerType: %s\n", amountOfDebtTaken, monthlyPayment, interestRate, customerType);
    }

    public void calculationHuman() throws Exception {
        int result = amountOfDebtTaken;
        int sum = amountOfDebtTaken; // долгу присваивается значение взятой суммы
        if (amountOfDebtTaken <= 0) throw new Exception("throws Exception"); // проверяю, что сумма не отрицательная
        int interest; // вводим переменную отвечающию за сумму процентов
        int duty = 0;
        while (true) {
            interest = sum * interestRate / 100;  // считаем % от суммы
            duty += interest; // считаем увеличение долга
            sum += interest;  // сумма + процент
            sum -= monthlyPayment * 12; // после ежемесячных выплат
            if (sum <= 0)
                break;
            if (sum >= amountOfDebtTaken) throw new Exception("throws Exception");
        }
        result += duty;
        System.out.println(duty);
        System.out.printf("// общая сумма к выплате: %d", result);
    }

    public void calculationBusiness() throws Exception {
        int result = amountOfDebtTaken;
        int sum = amountOfDebtTaken; // долгу присваивается значение взятой суммы
        if (amountOfDebtTaken <= 0) throw new Exception("throws Exception");
        int interest; // вводим переменную отвечающию за сумму процентов
        int duty = 0;
        while (sum > 0) {
            sum -= monthlyPayment * 12;// сделать прекращение, когда будет 0;
            if (sum <= 0)
                break;
            if (sum >= amountOfDebtTaken) throw new Exception("throws Exception");
            interest = sum * interestRate / 100;  // считаем % от суммы
            duty += interest; // считаем увеличение долга
            sum += interest;  // сумма + процент
        }
        result += duty;
        System.out.println(duty);
        System.out.printf("// общая сумма к выплате: %d", result);
    }
}
