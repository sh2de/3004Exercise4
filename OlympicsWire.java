import java.util.ArrayList;

public class OlympicsWire implements Subject{

    ArrayList<Observer> subscribers = new ArrayList<>();

    public void broadcast(NewsItem n){
        System.out.println("New	Olympic	News Item!!");
        //System.out.println(n);
        notifyObservers(n);
        return;
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
        for (Observer o:subscribers)
        {
            o.update(n);
        }
    }
}
