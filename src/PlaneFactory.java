class PlaneFactory extends VehicleFactory {

    @Override
    Vehicle getVehicle() {
        Plane plane = new Plane();
        plane.set_num_of_passengers();
        plane.set_num_of_wheels();
        plane.has_gas();
        return plane;
    }
}
