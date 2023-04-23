package BuilderElements;

import Bus.BusDriver;
import Taxi.RouteTaxi;
import Taxi.TaxiPassenger;
import _Global.IBuilder;
import _Global.RouteCar;

public class TaxiBuilder implements IBuilder {
    RouteCar car = null;
    @Override
    public void BuildRouteCarObj() { car = new RouteTaxi(); }
    @Override
    public void buildDriver() { car.setDriver(BusDriver.getInstance()); }
    @Override
    public void buildPassenger() { car.setPassengers(new TaxiPassenger[4]); }
    @Override
    public RouteCar getRouteCarObj() { return car; }
}
