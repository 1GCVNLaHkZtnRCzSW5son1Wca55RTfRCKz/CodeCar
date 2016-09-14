import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paul on 9/14/2016.
 */
public class CarBuilder {
    public static List<Car> buildRaceCars(){
        List<Integer> allCarNumbers = Driver.ALL_CAR_NUMBERS;
        List<Car> cars = new ArrayList<>();
        for (Integer carNumber : allCarNumbers) {
            Car car = new Car(carNumber, Driver.getDriverForId(carNumber).name());
            car.setSpeed(Math.random() + 1);
            cars.add(car);
        }
        return cars;
    }
}
