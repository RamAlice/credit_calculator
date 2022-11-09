public class ClientData {
    private final double amountOfDebtTaken;
    private final double monthlyPayment;
    private final double interestRate;
    private final CustomerType customerType;

    public ClientData(double amountOfDebtTaken, double monthlyPayment, double interestRate, CustomerType customerType) {
        this.amountOfDebtTaken = amountOfDebtTaken;
        this.monthlyPayment = monthlyPayment;
        this.interestRate = interestRate;
        this.customerType = customerType;
    }
    public double getAmountOfDebtTaken() {
        return amountOfDebtTaken;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }
}
