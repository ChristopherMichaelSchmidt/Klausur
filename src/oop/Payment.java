package oop;

public abstract class Payment {
    private double amount;
    private String currency;

    public double getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public Payment(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    abstract double calcTransactionCosts();

    public double exchangeToEUR(){
        double hilf=0.0;
        switch(currency){
            case "USD": hilf = amount * (1.0/1.1);
            break;

            case "GBP": hilf = amount * (1.0/0.85);
break;
            case "SEK": hilf = amount * (1.0/9.5);
break;
            case "HUF": hilf= amount *(1.0/310.0);
  break;
            default: hilf= amount *(1.0/2134);


        }
    return hilf;
    }



}
