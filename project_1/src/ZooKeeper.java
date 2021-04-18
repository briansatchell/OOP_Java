public class ZooKeeper {

    /**
     * wake the animals,
     * roll call the animals,
     * feed the animals,
     * exercise the animals,
     * shut down the zoo
     * */

    public Display display = (Animal[] animals, String action_) ->{
        for(Animal animal: animals){
            animal.action(action_);
        }
    };
    // pass an array of animals to the function
    // zookeeper goes through every animal in the array and wakes them up
    public void wakeUpAnimal(Animal[] animals){
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("It's time to wake up the animals! Zoo-kepper is gonna try to wake up the animals");
        System.out.println("--------------------------------------------------------------------------------");
//        for(Animal animal : animals){
//            animal.action("Wake up");
//        }
        display.display(animals, "Wake up");


    }

    // pass an array of animals to the function
    // zookeeper goes through every animal and does a roll call
    // every animal "should" make a noise
    public void rollCall(Animal[] animals){
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("It's time for roll call!");
        System.out.println("--------------------------------------------------------------------------------");
//        for(Animal animal : animals){
//            animal.action("Make Noise");
//        }
        display.display(animals, "Make Noise");
    }

    // pass an array of animals to the function
    // zookeeper goes through every animal and trains them
    public void exerciseAnimal(Animal[] animals){
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("It's time to exercise the animals! Zoo-kepper is gonna try to train the animals");
        System.out.println("--------------------------------------------------------------------------------");

//        for(Animal animal : animals){
//            animal.action("Exercise");
//        }
        display.display(animals, "Exercise");

    }

    // pass an array of animals to the function
    // zookeeper goes through every animal and feeds them
    public void feedAnimal(Animal[] animals){
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("It's time to feed the animals! Zoo-kepper is gonna try to feed the animals");
        System.out.println("--------------------------------------------------------------------------------");

//        for(Animal animal : animals){
//            animal.action("Feed");
//        }
        display.display(animals, "Feed");

    }

    // pass an array of animals to the function
    // zookeeper goes through every animal and make them go to sleep
    public void shut_down(Animal[] animals){
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Closing time! The Zoo-keeper is gonna try to put the animals to sleep!");
        System.out.println("--------------------------------------------------------------------------------");

//        for(Animal animal : animals){
//            animal.action("Sleep");
//        }
        display.display(animals, "Sleep");
    }

}
