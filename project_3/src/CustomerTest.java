public class CustomerTest {
    public static void main(String[] args){
        Customer jan = new CasualCustomer("Jan");
        Customer pat = new BusinessCustomer("Patrick");
        Customer den = new RegularCustomer("Dennis");


        System.out.println("Jan days:" + jan.getDays());
        System.out.println("Jan days:" + jan.getDays());
        System.out.println("Pat days:" + pat.getDays());
        System.out.println("Den days:" + den.getDays());
        System.out.println("Dennis Accessories: " + den.addAccesories());

//        Store store = new Store();

//        store.rentCars(jan);
//        store.rentCars(pat);
    }
}
