package oop;

import java.util.ArrayList;
import java.util.HashMap;

public class PaymentJournal {

    private ArrayList<Payment> payments = new ArrayList<>();

    public void add(Payment p){
        payments.add(p);


    }

    public double totalTransactionCosts(){
        double hilf=0.0;
        for(Payment payment:payments){
            hilf = hilf + payment.getAmount();

        }

        return hilf;

    }
    public HashMap<String, Double> getPaymentsPerCurrency(){
        HashMap<String, Double> hilf = new HashMap<>();
        double usd =0.0;
        double gbp =0.0;
        double sek =0.0;
        double huf =0.0;
        double anders =0.0;
        for(Payment payment: payments){
            if(payment.getCurrency().equals("USD")){
             usd = usd+1.0;

            }
            else if(payment.getCurrency().equals("GBP")){
                gbp = gbp+1.0;
            }
            else if(payment.getCurrency().equals("SEK")){
                sek = sek+1.0;
            }
            else if(payment.getCurrency().equals("HUF")){
                huf = huf+1.0;
            }
            else anders = anders +1;


        }
        hilf.put("USD", usd);
        hilf.put("GBP", gbp);
        hilf.put("SEK", sek);
        hilf.put("HUF", huf);
        hilf.put("Andere Währung", anders);
        return hilf;



    }


}
