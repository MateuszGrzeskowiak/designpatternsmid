package adapter.adapters;

import adapter.IHomeDevice;
import adapter.devices.Czajnik;

public class CzajnikAdapter implements IHomeDevice {
    private final Czajnik czajnik;

    public CzajnikAdapter(Czajnik czajnik) {
        this.czajnik = czajnik;
    }

    @Override
    public void turnOn() {
        czajnik.on();
    }

    @Override
    public void turnOff() {
        czajnik.off();
    }

    @Override
    public boolean getStatus() {
        return czajnik.isWlaczony();
    }
}
