public class CasualCustomer extends Customer{

    public CasualCustomer(String name){
        super(name);
        rentalType = new ThreeDays();
        amountType = new OneCar();
        customerType = "Casual";
    }



}
