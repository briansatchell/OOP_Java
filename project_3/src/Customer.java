import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public abstract class Customer {
    private String name;
    protected String customerType;


//    behavior that varies
    public RentalDays rentalType;
    public CarAmount amountType;


    public Customer(String name){
        this.name = name;
    }


    public String getName(){
        return name;
    }

    public String getCustomerType(){
        return this.customerType;
    }


    public List<String> addAccesories(){
        List<String> acces = new LinkedList<>();

        //add child car seats 0-4
        int carSeat = ThreadLocalRandom.current().nextInt(0,5);
        for(int i = 0; i < carSeat; i++){
            acces.add("carSeat");
        }

        //add GPS module 0-1
        int gps = ThreadLocalRandom.current().nextInt(0, 2);
        for(int i = 0; i < gps; i++){
            acces.add("GPS");
        }

        //ad satellite radio 0-1
        int sat = ThreadLocalRandom.current().nextInt(0, 2);
        for(int i = 0; i < sat; i++){
            acces.add("sat");
        }

        return acces;
    }






    //get amount of days wanting to rent
    public int getDays(){
        return rentalType.rentalDays();
    }

//    public void setRentalType(RentalDays newRentalType){
//        rentalType = newRentalType;
//    }


    //amount of cars wanted to rent
    public int getAmount(){
        return amountType.carAmount();
    }


}
