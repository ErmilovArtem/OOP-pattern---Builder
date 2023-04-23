package Taxi;

import _Global.IPassenger;
import _Global.PassEnum;

public class TaxiPassenger implements IPassenger {
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
            case BENIFICIARY -> null;
        };
    }

    @Override
    public PassEnum getEnum() { return type; }
    @Override
    public void setEnum(PassEnum _type) { type = _type; }
}
