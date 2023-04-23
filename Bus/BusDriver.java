package Bus;

import _Global.IDriver;
import _Global.LicenseEnum;

public class BusDriver implements IDriver {
    private String name = "";
    private final LicenseEnum license = LicenseEnum.BUS_LICENSE;
    private static BusDriver busDriver;
    private BusDriver(){}
    public static BusDriver getInstance(){
        if (busDriver == null)
            busDriver = new BusDriver();
        return busDriver;
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
