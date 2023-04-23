package _Global;

public abstract class RouteCar {
    public IDriver driver;
    public IPassenger[] passengers;
    public void setDriver(IDriver driver) { this.driver = driver; }
    public void setPassengers(IPassenger[] _passengers) { passengers = _passengers; }
    public void AllInfo(){
        System.out.println("PASSANGERS :");
        for (int i = 0; i < passengers.length; i++)
            if(passengers[i] != null)
                System.out.println(passengers[i].getName() + " seat num is: " + passengers[i].getSeatNumber());
        System.out.println("DRIVER :");
        System.out.println(driver.getName());
    }
    public abstract void DisboardPassengerByName(String[] passengersToDel);
    public abstract void BoardPassengerByName(String[] names);
    public void DisboardPassenger(IPassenger[] passengersToDel) {
        for(int i = 0; i < passengers.length; i++)
            for(int j = 0; j < passengersToDel.length; j++)
                if(passengers[i] != null)
                    if(passengers[i] == passengersToDel[j])
                        passengers[i] = null;
    }
    public void BoardPassenger(IPassenger[] _passengers) {
        int counter = 0;
        for (int i = 0; i < passengers.length; i++) {
            if(passengers[i] == null && counter < _passengers.length) {
                passengers[i] = _passengers[i];
                passengers[i].setSeatNum(i);
                counter++;
            }
        }
    }
    public boolean ReadyToDrive() {
        return ((driver != null) && (passengers != null) && (passengers.length > 0));
    }
}
