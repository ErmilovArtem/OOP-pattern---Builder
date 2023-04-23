package _Global;


public interface IBuilder {
    RouteCar car = null;
    void BuildRouteCarObj();
    void buildDriver();
    void buildPassenger();
    RouteCar getRouteCarObj();
}
