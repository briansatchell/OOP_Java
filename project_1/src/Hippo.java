public class Hippo extends Pachyderm {
    public Hippo(String name, String animalName, boolean sleepStatus){
        super(name, animalName, sleepStatus);
    }

    public void makeNoise(){
        System.out.println(getName() + " the " + getAnimalName() + " grunts");
    }
}
