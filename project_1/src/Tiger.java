public class Tiger extends Feline {
    public Tiger(String name, String animalName, boolean sleepStatus){
        super(name, animalName, sleepStatus);
    }

    public void makeNoise(){
        System.out.println(getName() + " the " + getAnimalName() + " ROARS!");
    }
}
