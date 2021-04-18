public class BusinessCustomer extends Customer{

    public BusinessCustomer(String name){
        super(name);
        rentalType = new SevenDays();
        amountType = new ThreeCars();
        customerType = "Business";
    }
}
