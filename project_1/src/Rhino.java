public class Rhino extends Pachyderm {
    public Rhino(String name, String animalName, boolean sleepStatus){
        super(name, animalName, sleepStatus);
    }

    public void makeNoise(){
        System.out.println(getName() + " the " + getAnimalName() + " is grunting");
    }
}
