package Bus;

import _Global.IPassenger;
import _Global.RouteCar;

public class RouteBus extends RouteCar {
    @Override
    public void DisboardPassengerByName(String[] passengersToDel) {
        for(int i = 0; i < passengers.length; i++)
            for(int j = 0; j < passengersToDel.length; j++)
                if(passengers[i] != null)
                    if(passengers[i].getName() == passengersToDel[j])
                        passengers[i] = null;
    }
    @Override
    public void BoardPassengerByName(String[] names) {
        int counter = 0;
        for (int i = 0; i < passengers.length; i    ++) {
            if(passengers[i] == null && counter < names.length) {
                passengers[i] = new BusPassanger();
                passengers[i].setName(names[counter]);
                passengers[i].setSeatNum(i);
                counter++;
            }
        }
    }
}
