public class RegularCustomer extends Customer{

    public RegularCustomer(String name){
        super(name);
        rentalType = new FiveDays();
        amountType = new UpToThree();
        customerType = "Regular";
    }
}
