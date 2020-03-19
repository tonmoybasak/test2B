public class FactoryProducer {
    public static VehicleFactory getFactory(String type){
        if(type.equalsIgnoreCase("car")){
            return new CarFactory();
        }else if (type.equalsIgnoreCase("plane")){
            return new PlaneFactory();
        }
        return null;
    }
}
