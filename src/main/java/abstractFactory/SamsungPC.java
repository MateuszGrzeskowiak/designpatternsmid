package abstractFactory;

public class SamsungPC extends AbstractPC {

    public SamsungPC(String nazwa, COMPUTER_BRAND brand, int cpuPower, double gpuPower, boolean isOverclocked) {
        super(nazwa, brand, cpuPower, gpuPower, isOverclocked);
    }
}
