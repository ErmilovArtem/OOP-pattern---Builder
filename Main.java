import BuilderElements.BusBuilder;
import BuilderElements.Director;
import BuilderElements.TaxiBuilder;
import _Global.PassEnum;
import _Global.RouteCar;

public class Main {
    public static void main(String[] args) {
        BusBuilder busBuilder = new BusBuilder();
        TaxiBuilder taxiBuilder = new TaxiBuilder();

        taxiBuilder.BuildRouteCarObj();
        taxiBuilder.buildDriver();
        taxiBuilder.buildPassenger();

        busBuilder.BuildRouteCarObj();
        busBuilder.buildDriver();
        busBuilder.buildPassenger();

        String[] passengers = {"Emilie Doe", "Andrew Doe", "Des Doe", "Dave Doe", "Cristian Doe", "Unknown Pass"};
        Director director = new Director();

        RouteCar bus1 = director.CreateBoard(busBuilder);
        RouteCar taxi1 = director.CreateBoard(taxiBuilder);

        bus1.BoardPassengerByName(passengers);
        taxi1.BoardPassengerByName(passengers);

        bus1.AllInfo();
        taxi1.AllInfo();

        String[] passengersToDel = {"Emilie Doe", "Unknown Pass"};
        bus1.DisboardPassengerByName(passengersToDel);
        taxi1.DisboardPassengerByName(passengersToDel);
        bus1.AllInfo();

        String[] boardingPassengers = {"Ermilov Artem", "Alexandr Kosiuk", "Ureva Ulia"};
        bus1.BoardPassengerByName(boardingPassengers);
        taxi1.BoardPassengerByName(boardingPassengers);
        bus1.AllInfo();

        System.out.println(bus1.ReadyToDrive());
        System.out.println(taxi1.ReadyToDrive());

        taxi1.passengers[1].setEnum(PassEnum.KIDDO);
        System.out.println(taxi1.passengers[1].getEnum());

        System.out.println(taxi1.ReadyToDrive());
    }
}