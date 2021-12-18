package oop;

public class MaestroPayment extends Payment{

    private String cardnumber;

    public MaestroPayment(double amount, String currency, String cardnumber) {
        super(amount, currency);
        this.cardnumber = cardnumber;
    }

    @Override
    double calcTransactionCosts() {
        double hilf = 0.0;

        hilf = getAmount()*0.0075;
        if(hilf<0.95){hilf= 0.95;}

        return hilf;
    }

    @Override
    public String toString() {
        return "MaestroPayment{" +
                "cardnumber='" + cardnumber + '\'' +
                "Amount='" + getAmount() + '\'' +
                "Currency='" + getCurrency() + '\'' +
                "TransactionCosts='" + calcTransactionCosts() + '\'' +
                '}';
    }
}
