import java.awt.*;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.io.*;


public class Simulation {
    public static void main(String[] args) throws FileNotFoundException {

        PrintStream o = new PrintStream(new File("sim.out"));
        System.setOut(o);
        //create 12 customers
        LinkedList<Customer> customers = new LinkedList<>();

        customers.add(new CasualCustomer("1"));
        customers.add(new BusinessCustomer("2"));
        customers.add(new RegularCustomer("3"));
        LinkedList<String> customerTypes = new LinkedList<>();

        for(int i = 4; i < 13; i++){
            int range = ThreadLocalRandom.current().nextInt(0, 3);
            if(range == 0){
                customers.add(new CasualCustomer(Integer.toString(i)));
            }
            if(range == 1){
                customers.add(new RegularCustomer(Integer.toString(i)));
            }
            if(range == 2){
                customers.add(new BusinessCustomer(Integer.toString(i)));
            }
        }


        //create 20 cars
        LinkedList<Car> carList = new LinkedList<>();
        carList.add (CarFactory.getCar("Economy"));
        carList.add (CarFactory.getCar("Economy"));
        carList.add (CarFactory.getCar("Standard"));
        carList.add (CarFactory.getCar("Standard"));
        carList.add (CarFactory.getCar("Luxury"));
        carList.add (CarFactory.getCar("Luxury"));
        carList.add (CarFactory.getCar("SUV"));
        carList.add (CarFactory.getCar("SUV"));
        carList.add (CarFactory.getCar("Minivan"));
        carList.add (CarFactory.getCar("Minivan"));

        for(int i = 0; i < 14; i++){
            int range = ThreadLocalRandom.current().nextInt(0, 5);

            if(range == 0){
                carList.add(CarFactory.getCar("Economy"));
            }
            if(range == 1){
                carList.add(CarFactory.getCar("Standard"));
            }
            if (range == 2){
                carList.add(CarFactory.getCar("Luxury"));
            }
            if (range == 3){
                carList.add(CarFactory.getCar("SUV"));
            }
            if (range == 4){
                carList.add(CarFactory.getCar("Minivan"));
            }
        }


        //create store
        Store store = new Store(carList);
        double totalrev= 0;


        // for loop 35 days
        for( int day = 1; day < 36; day++){
            System.out.println("--------------------------------------------------- DAY: " + day);
            double todaysRev = 0;
            //print active rentals
            store.activeRentals();

            //return cars that are due today
            store.returnCars(day);

            if(store.hasCars()){

                // Generate random customers coming into store
                LinkedList<Customer> todaysCustomers = (LinkedList<Customer>) customers.clone();
                int randomCus = ThreadLocalRandom.current().nextInt(0, 13);
                for(int j = 0; j < randomCus ; j ++){
                    todaysCustomers.remove(ThreadLocalRandom.current().nextInt(0, todaysCustomers.size()));
                }

                // rent to customer if not a business class and inventory is less than 3
                for (Customer todaysCustomer : todaysCustomers) {
                    if(!(todaysCustomer.getCustomerType().equals("Business") && store.getInvenSize() < 3)){
                        todaysRev += store.rentCars(todaysCustomer, day);
                    }

                }
            }

//            print inventory of cars in store
            System.out.println("Money made today: $"+ todaysRev);
            store.leftOverCars();
            totalrev += todaysRev;


        }
        System.out.println("Total money earned: $" + totalrev);
    }
}
