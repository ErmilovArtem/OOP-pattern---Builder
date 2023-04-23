package _Global;

import Bus.BusDriver;

public interface IDriver {
    String name = null;
    IDriver busDriver = null;
    LicenseEnum license = null;
    String getName();
    void setName(String name);
}
