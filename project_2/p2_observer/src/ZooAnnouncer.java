public class ZooAnnouncer implements  Observer{

    private Subject zooKeeper;
    String action;

    // Constructor for ZooAnnouncer
    // zookeeper is past to the constructor and then the zooKeeper will have an instance of the zooKeeper and
    // use it to add itself to the list of observers,
    // this works dynamically so if we add multiple zoo announcers it will automatically add itself to the zooKeeper
    // list
    public ZooAnnouncer(Subject zooKeeper){
        this.zooKeeper = zooKeeper;
        this.zooKeeper.construct(this);
    }


    // update => updates the action that is passed from the zooKeeper
    // then calls printAction to print the announcement message
    public void update(String action)  {
        this.action = action;
        printAction();
    }

    // prints the zooKeeper action
    public void printAction(){
        System.out.println(
                "**************************************************************************************************" +
                        "**************"
        );
        System.out.println(
                "Hi I'm your friendly zoo announcer, just want you all to know that the zoo-keeper " +
                        this.action + " the animals!"
        );
        System.out.println(
                "**************************************************************************************************" +
                        "**************"
        );
    }
}
