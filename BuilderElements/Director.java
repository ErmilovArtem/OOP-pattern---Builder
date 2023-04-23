package BuilderElements;

import _Global.*;

public class Director {
    public RouteCar CreateBoard(IBuilder BuilderBoard){
        BuilderBoard.BuildRouteCarObj();
        BuilderBoard.buildDriver();
        BuilderBoard.buildPassenger();
        return BuilderBoard.getRouteCarObj();
    }
}
