package _Global;

public interface IPassenger {
    int getSeatNumber();
    void setName(String name);
    String getName();
    void setSeatNum(int seatNum);
    String getInfo();
    PassEnum getEnum();
    void setEnum(PassEnum type);
}
