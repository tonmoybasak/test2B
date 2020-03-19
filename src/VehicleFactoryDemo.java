import java.util.Objects;

public class VehicleFactoryDemo {

    public static void main(String args[]) {
        VehicleFactory carFactory = FactoryProducer.getFactory("car");
        VehicleFactory planeFactory = FactoryProducer.getFactory("plane");
        Vehicle car = Objects.requireNonNull(carFactory).getVehicle();
        Vehicle plane = Objects.requireNonNull(planeFactory).getVehicle();

        System.out.println(car.toString());
        System.out.println(plane.toString());

    }
}
