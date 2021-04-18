import javax.swing.*;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Store {
    private LinkedList<RentalRecord> record = new LinkedList<>();
    private LinkedList<Car> inventory;
    private int revenue = 0;

    public Store(LinkedList<Car> inventory){
        this.inventory = inventory;
    }


    // print out person name
    // list of cars and decorated cars + deocrated
    public void returnCars(int day){
        if(record != null) {
            System.out.println("Completed Rentals");
            for (int i = 0; i < record.size(); i++) {
                if(day == record.get(i).getDays()){
                    //add cars from list back into our inventory and remove customer from record
                    inventory.addAll(record.get(i).getCars());
//                    System.out.println("\tCustomer" + record.get(i).getName() + ":");
                    for (RentalRecord rentalRecord : record) {
                        rentalRecord.printRecord();
                    }
//                    for(CarDecorator d : record.get(i).getDeckedCars()){ // prints the car, add-ons, price
//                        System.out.println(d.assemble() + " " + d.price());
//                    }
//                    add decorated information and cost of cars
                    record.remove(i);
                    i--;
                }

            }
        }
    }

    // get total sum of the day
    public double rentCars(Customer customer, int day){
        double rev = 0;
        int numCars = customer.getAmount();
        int numDays = customer.getDays();
        double carCost;
        String name = customer.getName();


        for(int i = 0; i < numCars; i++){
            if(hasCars()){
                if(!customerFull(customer)){


                    Car car = inventory.pop();
                    CarDecorator deckedCar = decorateCar(customer,car);

                    carCost = deckedCar.price();
                    //rev += deckedCar.price(); // gets the price of each car and will add it the rev
                    if(hasCustomer(customer)){



                        //customer is already in system
                        carCost = addCar(customer, car, deckedCar, day, carCost);
                        //maybe add description of purchase to node
                    }
                    else {


                        carCost = deckedCar.price() + (car.price() * (numDays-1));
                        //linked lists for record
                        LinkedList<Car> newCar = new LinkedList<>();
                        newCar.add(car);

                        LinkedList<CarDecorator> newDeckedCar = new LinkedList<>();
                        newDeckedCar.add(deckedCar);

                        LinkedList<Integer> newCarDay = new LinkedList<>();
                        newCarDay.add(numDays);

                        LinkedList<Double> newCarCost = new LinkedList<>();
                        newCarCost.add(carCost);

                        record.add(new RentalRecord((numDays + day), name, newCar, newDeckedCar, newCarDay, newCarCost));
                        //maybe add description to node
                    }
                    rev = carCost;
                }
            }
        }
        return rev;

    }


    public int getInvenSize(){
        return inventory.size();
    }

    public Boolean hasCars(){
        if(inventory.size() > 0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean hasCustomer(Customer customer){
        if(record != null) {
            for (RentalRecord rentalRecord : record) {
//                System.out.println(customer.getName() + record.get(i).getName());
                if (customer.getName().equals(rentalRecord.getName())) {
                    return true;
                }
            }
        }
        return false;

    }

    public double addCar(Customer cus, Car car, CarDecorator deckedCar, int curDay, double carCost){
        double cost = 0;
        for (RentalRecord rentalRecord : record) {
            if (cus.getName().equals(rentalRecord.getName())) {
                cost = deckedCar.price() + (car.price() * (rentalRecord.getDays() - curDay - 1));
                rentalRecord.addCar(car, deckedCar, (rentalRecord.getDays() - curDay), cost);

            }
        }
        return cost;
    }
    public void activeRentals(){
        int cars = 0;
        System.out.println("Current Rentals:");
        for (RentalRecord rentalRecord : record) {
            System.out.print("\tCustomer: " + rentalRecord.getName() + "\n\t\t");
            for (int j = 0; j < rentalRecord.cars.size(); j++) {
                System.out.print(rentalRecord.cars.get(j).getLicensePlate() + "  ");
                cars++;
            }
            System.out.println("");
        }
        System.out.println("Number of cars currently rented: " + cars);
    }

    public void leftOverCars(){
        System.out.println(inventory.size() + " cars in shop");
        System.out.print("\t");
        for (Car car : inventory) {
            System.out.print(car.getLicensePlate() + "  ");
        }
        System.out.println("\n");
    }

    public boolean customerFull(Customer cus){
        if(hasCustomer(cus)){
            if(record != null) {
                for (RentalRecord rentalRecord : record) {
                    if (cus.getName().equals(rentalRecord.getName())) {
                        if (rentalRecord.getCars().size() > 2) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    // takes in customer and car
    // customer will give what he/she wants on the car
    // the car will be decorated with add ons
    public CarDecorator decorateCar(Customer customer, Car car){
        List<String> addOns = customer.addAccesories();

        CarDecorator carWithAddOns = new CarDecorator(car);

        for (String a : addOns) {
            switch (a) {
                case "carSeat":
                    carWithAddOns = new CarSeat(carWithAddOns);
                    break;
                case "GPS":
                    carWithAddOns = new GPS(carWithAddOns);
                    break;
                case "sat":
                    carWithAddOns = new SatelliteRadio(carWithAddOns);
                    break;
                default:
                    System.out.println("ERROR"); // sanity check should never happen

                    break;
            }
        }

        return carWithAddOns;
    }

}




