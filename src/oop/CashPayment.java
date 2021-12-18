package oop;

public class CashPayment extends Payment{

    private String name;
    public CashPayment(double amount, String currency) {
        super(amount, currency);
    }

    public CashPayment(double amount, String currency, String name) {
        super(amount, currency);
        this.name = name;
    }

    @Override
    double calcTransactionCosts() {
    double hilf= 0.0;

    if (name.equals(null)){
        hilf = 2.0;
    }
        return hilf;


    }

    @Override
    public String toString() {
        return "CashPayment{" +
                "name='" + name + '\'' +
                "Amount='" + getAmount() + '\'' +
                "Currency='" + getCurrency() + '\'' +
                "TransactionCosts='" + calcTransactionCosts() + '\'' +
                '}';
    }
}
