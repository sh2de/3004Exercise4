import java.util.ArrayList;

public class PBS extends Channel{
    public PBS(ArrayList<Subject> a) {
        super(a);
    }

    public void update(NewsItem n) {
        if (n.time == "AM") {
            System.out.println("PBS	reports	"	+	n);
        } else {
            for(Subject s:subbed){

                s.removeObserver(this);
            }
        }
    }
}
