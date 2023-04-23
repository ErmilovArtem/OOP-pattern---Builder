package BuilderElements;

import Bus.BusDriver;
import Bus.BusPassanger;
import Bus.RouteBus;
import _Global.IBuilder;
import _Global.RouteCar;

public class BusBuilder implements IBuilder {
    RouteCar car = null;
    @Override
    public void BuildRouteCarObj() { car = new RouteBus(); }
    @Override
    public void buildDriver() { car.setDriver(BusDriver.getInstance()); }
    @Override
    public void buildPassenger() { car.setPassengers(new BusPassanger[30]); }
    @Override
    public RouteCar getRouteCarObj() { return car; }
}
