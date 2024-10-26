package Exceptions;

public class Bank {

    private int amount;
    private String currency;


    public Bank(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }


public Integer add(Bank bankname) throws Exception {


        if(!bankname.currency.equalsIgnoreCase("INR"))

        try{
            throw new Exception("Currency mismatch");
        }
    catch (Exception e)
    {
        System.out.println("currency mismatch !!");

    }

    return bankname.amount+this.amount;

}

}
