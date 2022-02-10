import java.util.ArrayList;

public class CBC extends Channel{
    public CBC(ArrayList a) {

        super(a);
    }

    @Override
    public void update(NewsItem n) {
        System.out.println("CBC	reports	"	+	n);
    }
}
