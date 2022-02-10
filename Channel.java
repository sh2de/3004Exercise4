import java.util.ArrayList;

public class Channel implements Observer{
    public ArrayList<Subject> subbed = new ArrayList<>();
    public Channel(ArrayList<Subject> a){
        for (Subject s:a)
        {
            s.registerObserver(this);
            subbed.add(s);
        }
    }

    @Override
    public void update(NewsItem n) {

    }
}
