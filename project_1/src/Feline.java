public abstract class Feline extends Animal {
    public Feline(String name, String animalName, boolean sleep_status){
        super(name, animalName, sleep_status);
    }

    public void roam(){
        System.out.println(getName() + " the " + getAnimalName() + " runs around quietly");
    }


}
