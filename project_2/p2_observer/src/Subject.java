// interface for our subject which is the zoo keeper, he/she
// will have to implement the construct, deconstruct, and notifyObserver

public interface Subject {
    public void construct(Observer o);
    public void deconstruct(Observer o);
    public void notifyObserver();
}
