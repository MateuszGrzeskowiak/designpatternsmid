package abstractFactory;

public class AsusPC extends AbstractPC {


    public AsusPC(String nazwa, COMPUTER_BRAND brand, int cpuPower, double gpuPower, boolean isOverclocked) {
        super(nazwa, brand, cpuPower, gpuPower, isOverclocked);
    }
}
