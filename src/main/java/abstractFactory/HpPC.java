package abstractFactory;

public class HpPC extends AbstractPC {


    public HpPC(String nazwa, COMPUTER_BRAND brand, int cpuPower, double gpuPower, boolean isOverclocked) {
        super(nazwa, brand, cpuPower, gpuPower, isOverclocked);
    }
}
