package by.anton.flat;

import java.io.Serializable;

public class Kitchen implements TypeDevice, Serializable {
    int v; //обьем посуды


    public Kitchen(int i) {

        this.v=i;

    }

    @Override
    public void switchOn() {

    }

    @Override
    public void switchOff() {

    }
}
