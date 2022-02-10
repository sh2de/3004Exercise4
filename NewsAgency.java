import java.util.ArrayList;

public class NewsAgency implements Observer, Subject{
    String name;
    ArrayList<Observer> subscribers = new ArrayList<>();
    public NewsAgency(String n, OlympicsWire o){
        o.registerObserver(this);
        name = n;
    }


    @Override
    public void update(NewsItem n) {
        notifyObservers(n);
    }

    @Override
    public void registerObserver(Observer o) {
        subscribers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {

        subscribers.remove(o);
    }

    @Override
    public void notifyObservers(NewsItem n) {
        ArrayList<Observer> subs = new ArrayList<>(subscribers); //making copy of list to avoid list modification errors
        for (Observer o:subs)
        {
            o.update(n);
        }
    }
}
