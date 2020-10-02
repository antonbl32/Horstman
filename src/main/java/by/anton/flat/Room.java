package by.anton.flat;

import java.io.Serializable;

public class Room implements TypeDevice, Serializable {
    boolean isActive;
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void switchOn() {
        this.isActive=true;
    }

    @Override
    public void switchOff() {
        this.isActive=false;
    }
}
