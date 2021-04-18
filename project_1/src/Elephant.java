public class Elephant extends Pachyderm {
    public Elephant(String name, String animalName, boolean sleepStatus){
        super(name, animalName, sleepStatus);
    }

    public void makeNoise(){
        System.out.println(getName() + " the " + getAnimalName() + " Trumpet");
    }
}
