package Taxi;

import _Global.IPassenger;
import _Global.PassEnum;
import _Global.RouteCar;

public class RouteTaxi extends RouteCar {
    private boolean haveChildSeat = false;
    public boolean isHaveChildSeat() { return haveChildSeat; }
    public void delChildSeat() { haveChildSeat = false; }
    public void giveChildSeat() { haveChildSeat = true; }

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
                passengers[i] = new TaxiPassenger();
                passengers[i].setName(names[counter]);
                passengers[i].setSeatNum(i);
                counter++;
            }
        }
    }

    @Override
    public boolean ReadyToDrive() {
        if(!isHaveChildSeat()) {
            for (int i = 0; i < passengers.length; i++) {
                if(passengers[i].getEnum() == PassEnum.KIDDO) {
                    System.out.println("CAR WITH KIDS BUT WITHOUT CHILD SEATS!");
                    return false;} }
        }
        return ((driver != null) && (passengers != null) && (passengers.length > 0)); }
}
