import java.util.ArrayList;

public class TF1 extends Channel{

    public TF1(ArrayList a) {
        super(a);
    }

    @Override
    public void update(NewsItem n) {
        if (n.country == "France") {System.out.println("TF1	reports	"	+	n);}
    }
}
