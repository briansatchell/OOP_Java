public abstract class Animal {
    private String name;
    private String animalName;
    private boolean sleepStatus;
    final String zooTag = "Denver Zoo";
    static int zooZip = 80013;


    public Animal(String name, String animalName, boolean sleepStatus){
        this.name = name;
        this.animalName = animalName;
        this.sleepStatus = sleepStatus;
    }

    // abstract animal actions

    // every type of animal has a specific way of roaming that is influenced whether they are a
    // feline, canine, or pachyderm
    public abstract void roam();
    // every animal has a unique way of making a noise
    public abstract void makeNoise();


    // getters and setters
    public void setName(String name){
        this.name = name;
    }

    public void setAnimalName(String animalName){
        this.animalName = animalName;
    }

    public void setSleeping(boolean sleepStatus){
        this.sleepStatus = sleepStatus;
    }

    public String getName(){
        return name;
    }

    public String getAnimalName(){
        return animalName;
    }

    public boolean getSleepStatus(){
        return sleepStatus;
    }


    // animal actions
    public void sleeping(){
        System.out.println(name + " the " + animalName + " is now sleeping");
        this.sleepStatus = true;
    }

    public void wakingUp(){
        System.out.println(name + " the " + animalName + " is waking up");
        this.sleepStatus = false;
    }

    public void eating(){
        System.out.println(name + " the " + animalName + " is eating");
    }

    public void exercise(){
        System.out.println(name + " the " + animalName + " is pumping the iron (exercising)");
    }

    // is the method to provoke what the animal is going to be doing
    public void action(String action_){
        switch(action_){
            case "Wake up":
                if(this.sleepStatus) {
                    wakingUp();
                } else{
                    System.out.println(this.name + " the " + animalName +  " is already awake");
                }
                break;
            case "Sleep":
                if(this.sleepStatus) {
                    System.out.println(this.name + " the " + animalName +  " is already sleeping");
                } else{
                    sleeping();
                }
                break;
            case "Make Noise":
                makeNoise();
                break;
            case "Roam":
                roam();
                break;
            case "Exercise":
                exercise();
                break;
            case "Feed":
                eating();
                break;
            default:
                System.out.println(this.name + " the " + animalName + " is confuse");

        }
    }

    public void What_zoo(){
        System.out.println(zooTag);
    }

    public void get_zip(){
        System.out.println(zooZip);
    }


}
