# test2B
In Abstract Factory pattern an interface is responsible for creating a factory of related objects without explicitly specifying their classes. Each generated factory can give the objects as per the Factory pattern.

We have created a Vehicle interface and class implementing it. We have created an abstract factory class VehicleFactory as next step. Factory class CarFactory is defined, which extends VehicleFactory. A factory creator/generator class FactoryProducer is created.

VehicleFactoryDemo, our demo class uses FactoryProducer to get a VehicleFactory object. It will pass information to VehicleFactory to get the type of object it needs.