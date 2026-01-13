package consolefactory;

import steps.RaceCar;
import steps.SUV;
import steps.TownCar;
import steps.Car;

public class CarFactory {

    public static Car buildCar(String type) {
        Car step=null;
        switch (type.toLowerCase()) {
            case "town car":
                step = new TownCar();
                break;
            case "race car":
                step = new RaceCar();
                break;
            case "suv":
                step = new SUV();
                break;
            default:
                break;
        }
        return step;

    }
}
