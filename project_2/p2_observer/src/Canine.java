public abstract class Canine extends Animal {
    public Canine(String name, String animalName, boolean sleepStatus){
        super(name, animalName, sleepStatus);
    }

    public void roam(){
        System.out.println(getName() + " the " + getAnimalName() + " is roaming like Canine");
    }
}
