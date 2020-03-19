class CarFactory extends VehicleFactory {

    @Override
    Vehicle getVehicle() {
        Car car = new Car();
        car.set_num_of_passengers();
        car.set_num_of_wheels();
        car.has_gas();
        return car;
    }
}
