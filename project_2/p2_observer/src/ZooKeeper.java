import java.util.ArrayList;
public class ZooKeeper implements  Subject{

    /**
     * wake the animals,
     * roll call the animals,
     * feed the animals,
     * exercise the animals,
     * shut down the zoo
     * */

    // going to our variable that'll keep track of our observer
    private ArrayList<Observer> observers;
    String state_;
    String action_;

    // constructor, sets an empty list where the zookeeper store  the observer and the
    // has an empty state
    public ZooKeeper(){
        observers = new ArrayList<Observer>();
        state_ = "";
    }

    // loops through every animal and display its action
    public Display display = (Animal[] animals, String action_) -> {
        for(Animal animal: animals){
            animal.action(action_);
        }
    };

    // zookeeper gets a state from the zoo and will state and set its state to that specific state
    // will set an action that he/she will give to the animal
    // and then notify the observer/zoo announcer that the state of the zoo keeper has changed
    public void setState(String state){
        state_ = state;

        if(state_ == "waking up"){
            action_  = "Wake up";
        } else if(state_ == "roll calling"){
            action_ =  "Make Noise";
        } else if(state_ == "exercising"){
            action_ = "Exercise";
        } else if(state_ == "feeding"){
            action_ = "Feed";
        } else if (state_ == "putting to sleep") {
            action_ = "Sleep";
        } else{
            state_ = "Unknown";
            action_ = "Unknown";
        }
        this.notifyObserver();
    }

    public void executeState(Animal[] animals){
        switch(state_){
            case "waking up":
                wakeUpAnimal(animals);
                break;
            case "roll calling":
                rollCall(animals);
                break;
            case "exercising":
                exerciseAnimal(animals);
                break;
            case "feeding":
                feedAnimal(animals);
                break;
            case "putting to sleep":
                shut_down(animals);
                break;
            default:
                System.out.println("Zoo keeper is confused with his task");
        }
    }
    // pass an array of animals to the function
    // zookeeper goes through every animal in the array and wakes them up
    public void wakeUpAnimal(Animal[] animals){
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("It's time to wake up the animals! Zoo-keeper is gonna try to wake up the animals");
        System.out.println("--------------------------------------------------------------------------------");
        display.display(animals, action_);
    }

    // pass an array of animals to the function
    // zookeeper goes through every animal and does a roll call
    // every animal "should" make a noise
    public void rollCall(Animal[] animals){
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("It's time for roll call!");
        System.out.println("--------------------------------------------------------------------------------");
        display.display(animals, action_);
    }

    // pass an array of animals to the function
    // zookeeper goes through every animal and trains them
    public void exerciseAnimal(Animal[] animals){
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("It's time to exercise the animals! Zoo-keeper is gonna try to train the animals");
        System.out.println("--------------------------------------------------------------------------------");
        display.display(animals, action_);

    }

    // pass an array of animals to the function
    // zookeeper goes through every animal and feeds them
    public void feedAnimal(Animal[] animals){
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("It's time to feed the animals! Zoo-keeper is gonna try to feed the animals");
        System.out.println("--------------------------------------------------------------------------------");
        display.display(animals, action_);

    }

    // pass an array of animals to the function
    // zookeeper goes through every animal and make them go to sleep
    public void shut_down(Animal[] animals){
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Closing time! The Zoo-keeper is gonna try to put the animals to sleep!");
        System.out.println("--------------------------------------------------------------------------------");
        display.display(animals, action_);
    }

    // construct -> will add the observer to subject list
    public void construct(Observer o) {
        observers.add(o);
    }

    // deconstruct -> will remove an observer from the list of observer the zookeeper
    public void deconstruct(Observer o) {
        int observerI = observers.indexOf(o);
        System.out.println(
                "**************************************************************************************************" +
                        "**************"
        );
        System.out.println("Our zoo announcer shift is over and now he is going home!");
        System.out.println(
                "**************************************************************************************************" +
                        "**************"
        );
        observers.remove(observerI);
    }

    // notifyObserver -> will notify the observer that something has changed
    public void notifyObserver() {
        for(Observer observer : observers){
            observer.update(state_);
        }
    }
}
