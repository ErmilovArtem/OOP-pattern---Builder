package Bus;

import _Global.PassEnum;
import _Global.IPassenger;

public class BusPassanger implements IPassenger {
    int number_of_seat = 0;
    String passengerName;
    public PassEnum type;
    void Passenger(int num){
        this.number_of_seat = num;
    }

    @Override
    public int getSeatNumber() {
        return this.number_of_seat;
    }

    @Override
    public void setName(String name) {
        this.passengerName = name;
    }

    @Override
    public String getName() {
        return passengerName;
    }

    @Override
    public void setSeatNum(int seatNum) {this.number_of_seat = seatNum;}

    @Override
    public String getInfo() {
        return switch (type) {
            case ADULT -> passengerName + " - ADULT PASS";
            case KIDDO -> passengerName + " - KID PASS";
            case BENIFICIARY -> passengerName + " - BENIFICIARY PASS";
        };
    }

    @Override
    public PassEnum getEnum() { return type; }
    public void setEnum(PassEnum _type) { type = _type; }
}
