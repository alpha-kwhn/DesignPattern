package Week2.P3;

public class ElectricPowerSwitch {

    public ElectricStuff stuff;
    public boolean on;

    public ElectricPowerSwitch(ElectricStuff stuff) {
        this.stuff = stuff;
        this.on = false;
    }

    public boolean isOn() {
        return this.on;
    }

    public void press(){

        boolean checkOn = isOn();
        if (checkOn) {
            stuff.turnOff();
            this.on = false;
        } else {
            stuff.turnOn();
            this.on = true; }
    }
}

