public class ClientData {
    private final double amountOfDebtTaken;
    private final double monthlyPayment;
    private final double interestRate;
    private final ClientType clientType;

    public ClientData(double amountOfDebtTaken, double monthlyPayment, double interestRate, ClientType clientType) {
        this.amountOfDebtTaken = amountOfDebtTaken;
        this.monthlyPayment = monthlyPayment;
        this.interestRate = interestRate;
        this.clientType = clientType;
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

    public ClientType getClientType() {
        return clientType;
    }
}
