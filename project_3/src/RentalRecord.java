import java.util.LinkedList;



public class RentalRecord {
    public int days;
    public String name;
    public LinkedList<Car> cars;
    public LinkedList<CarDecorator> deckedCars;
    public LinkedList<Integer> carDays;
    public LinkedList<Double> carCosts;

    public RentalRecord(int days, String name, LinkedList<Car> cars, LinkedList<CarDecorator> deckedCars,
                        LinkedList<Integer> carDays, LinkedList<Double> carCosts){

        this.days = days;
        this.name = name;
        this.cars = cars;
        this.deckedCars = deckedCars;
        this.carDays = carDays;
        this.carCosts = carCosts;
    }

    public int getDays(){
        return days;
    }

    public String getName(){
        return name;
    }

    public LinkedList<Car> getCars(){
        return cars;
    }

    public LinkedList<CarDecorator> getDeckedCars(){
        return deckedCars;
    }

    public void addCar(Car car, CarDecorator deckedCar, int carDay, double carCost){
        cars.add(car);
        deckedCars.add(deckedCar);
        carDays.add(carDay);
        carCosts.add(carCost);
    }
    public void printRecord(){
        System.out.println("Customer "+ name+ ":");
        for(int i =0; i < cars.size(); i++){
            System.out.println("\tCar: " + deckedCars.get(i).assemble());
            System.out.println("\t\tDays rented: "+ carDays.get(i));
            System.out.println(("\t\tTotal cost: "+ carCosts.get(i)));
        }
    }
}
