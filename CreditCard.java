public class CreditCard {
    private String _customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;


    public String getCustomer() {
        return _customer;
    }
    public String getBank(){
        return bank;
    }
    public String getAccount(){
        return account;
    }
    public void makePayment(double amount){
        balance = balance - amount;
    }
    public boolean charge(double price) {
        if (price > limit) {
            return false;
        }
        else{
            return true;
        }
    }
    public double getBalance(){
        return balance;
    }
    public int getLimit(){
        return limit;
    }
}
