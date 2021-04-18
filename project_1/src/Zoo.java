import java.io.*;


public class Zoo {
    public static void main(String args[]) throws FileNotFoundException {
        // you to output to the .out
        // used .out to direct it to a .out file instead to the console
        PrintStream o = new PrintStream(new File("dayatthezoo.out"));
        System.setOut(o);

        //cats
        Animal cliffard = new Cat("Clifford", "cat", false);
        Animal casey = new Cat("Casey", "cat", false);

        //dogs
        Animal dan = new Dog("Dan", "dog", true);
        Animal dough = new Dog("Doug", "dog", true);

        //elephant
        Animal ellie = new Elephant("Ellie", "elephant", true);
        Animal elizabeth = new Elephant("Elizabeth", "elephant", true);

        //hippo
        Animal harry = new Hippo("Harry", "hippo", true);
        Animal hermione = new Hippo("Hermione", "hippo", true);

        //lion
        Animal leo = new Lion("Leo", "lion", true);
        Animal leonard = new Lion("Leonard", "lion", true);

        //rhino
        Animal ramey = new Rhino("Ramey", "rhino", true);
        Animal rock = new Rhino("Rock", "rhino", true);

        //Tiger
        Animal tigger = new Tiger("Tigger", "tiger", true);
        Animal tyrone = new Tiger("Tyrone", "tiger", true);

        //Wolf
        Animal waka = new Wolf("Waka", "wolf", true);
        Animal wiz = new Wolf("Wiz", "wolf", true);

        ZooKeeper steveIrwin = new ZooKeeper();

        // array of animals
        Animal[] animals = new Animal[16];


        // instance of each animal, 2 of eah type of animal
        // cat
        animals[0] = cliffard;
        animals[1] = casey;
        // dog
        animals[2] = dan;
        animals[3] = dough;
        // elephant
        animals[4] = ellie;
        animals[5] = elizabeth;
        // hippo
        animals[6] = harry;
        animals[7] = hermione;
        // lion
        animals[8] = leo;
        animals[9] = leonard;
        // Rhino
        animals[10] = ramey;
        animals[11] = rock;
        // tiger
        animals[12] = tigger;
        animals[13] = tyrone;
        // wolf
        animals[14] = waka;
        animals[15] = wiz;

        // zoo keeper duties
        steveIrwin.wakeUpAnimal(animals);
        steveIrwin.rollCall(animals);
        steveIrwin.exerciseAnimal(animals);
        steveIrwin.feedAnimal(animals);
        steveIrwin.shut_down(animals);

        wiz.What_zoo();
        wiz.get_zip();

    }
}
