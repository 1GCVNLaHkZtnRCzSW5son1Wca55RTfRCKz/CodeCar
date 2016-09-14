import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Paul on 9/14/2016.
 */
public class Qualify {
    public void setField(List<Car> entryList) {
        Collections.sort(entryList);
        for (Car car : entryList) {
            int position = entryList.indexOf(car) + 1;
            System.out.println(position + " " + car);
        }
    }
}
