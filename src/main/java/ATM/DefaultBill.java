package ATM;

public class DefaultBill implements Bill{
    private Bill nextBill;
    private final int billValue;

    public DefaultBill(int billValue) {
        this.billValue = billValue;
    }

    @Override
    public void setNext(Bill bill) {
        this.nextBill = bill;
    }

    public void process(int amount){
        System.out.println("Number of " + billValue + " UAH bills: " + amount/billValue);
        if (!(nextBill == null)){
            nextBill.process(amount%billValue);
        }else if(amount%billValue != 0){
            throw new IllegalArgumentException();
        }
    }
}
