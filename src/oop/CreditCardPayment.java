package oop;

public class CreditCardPayment extends Payment {
    private String cardNumber;
    private String securityNumber;


    public CreditCardPayment(double amount, String currency, String cardNumber, String securityNumber) {
        super(amount, currency);
        this.cardNumber = cardNumber;
        this.securityNumber = securityNumber;
    }

    @Override
    double calcTransactionCosts() {
        double hilf = 0.0;
        if (getCurrency().equals("EUR")) {
            hilf = 0.5 + getAmount() * 0.011;
        } else hilf = 1.5 + exchangeToEUR() * 0.0275;
        return hilf;


    }


    @Override
    public String toString() {
        return "CreditCardPayment{" +
                "cardNumber='" + cardNumber + '\'' +
                ", securityNumber='" + securityNumber + '\'' +
                ", Amount='" + getAmount() + '\'' +
                ", Currency='" + getCurrency() + '\'' +
                ", TransactionCosts='" + calcTransactionCosts() + '\'' +
                '}';
    }



}
