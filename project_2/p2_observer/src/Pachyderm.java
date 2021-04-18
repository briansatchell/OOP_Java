public abstract class Pachyderm extends Animal {
    public Pachyderm(String name, String animalName, boolean sleepStatus){
        super(name, animalName, sleepStatus);
    }

    public void roam(){
        System.out.println(getName() + " the " + getAnimalName() + " is roaming like Pachyderm");
    }
}

