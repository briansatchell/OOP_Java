import java.util.Random;

public class Cat extends Feline {
    public Cat(String name, String animalName, boolean sleep_status) {
        super(name, animalName, sleep_status);
    }


    public void makeNoise() {
        System.out.println(getName() + " the " + getAnimalName() + " MEOWS!");
    }

    public void action(String action_){
        Random rand = new Random();
        int choice = rand.nextInt(7);

        switch(choice){
            case 1:
                if(getSleepStatus()){
                    wakingUp();
                } else{
                    sleeping();
                }
                break;
            case 2:
                roam();
                break;
            case 3:
                makeNoise();
                break;
            case 4:
                exercise();
                break;
            case 5:
                System.out.println(getName() + " the " + getAnimalName() + " HISSES!");
                break;
            case 6:
                System.out.println(getName() + " the " + getAnimalName() + " runs around");
                break;
            default:
                System.out.println(getName() + " the " + getAnimalName() + " is confuse");
        }
    }
}

