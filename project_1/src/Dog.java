public class Dog extends Canine {
    public Dog(String name, String animalName, boolean sleepStatus){
        super(name, animalName, sleepStatus);
    }

    public void makeNoise(){
        System.out.println(getName() + " the " + getAnimalName() + " is barking");
    }

}
