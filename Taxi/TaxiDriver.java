package Taxi;

import _Global.IDriver;
import _Global.LicenseEnum;

public class TaxiDriver implements IDriver {
    private String name = "";
    private static TaxiDriver taxiDriver;
    private final LicenseEnum license = LicenseEnum.BUS_LICENSE;
    private TaxiDriver(){}
    public static TaxiDriver getInstance(){
        if (taxiDriver == null)
            taxiDriver = new TaxiDriver();
        return taxiDriver;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String _name) {
        this.name = _name;
    }
}
