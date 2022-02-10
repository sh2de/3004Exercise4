import java.util.ArrayList;

public class CBS extends Channel{
    public CBS(ArrayList a) {
        super(a);
    }

    @Override
    public void update(NewsItem n) {
        if (n.country == "US") {System.out.println("CBS	reports	"	+	n);}
    }
}
