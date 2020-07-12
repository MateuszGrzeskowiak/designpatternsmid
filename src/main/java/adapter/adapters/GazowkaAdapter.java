package adapter.adapters;

import adapter.IHomeDevice;
import adapter.devices.Gazowka;

public class GazowkaAdapter implements IHomeDevice {
    private final Gazowka gazowka;

    public GazowkaAdapter(Gazowka gazowka) {
        this.gazowka = gazowka;
    }

    @Override
    public void turnOn() {
        gazowka.setOn(true);
    }

    @Override
    public void turnOff() {
        gazowka.setOn(false);
    }

    @Override
    public boolean getStatus() {
        return gazowka.isOn();
    }
}