package abstractFactory;

public class AppleMac extends AbstractPC {

    public AppleMac(String nazwa, COMPUTER_BRAND brand, int cpuPower, double gpuPower, boolean isOverclocked) {
        super(nazwa, brand, cpuPower, gpuPower, isOverclocked);
    }


    public static AbstractPC createMacPro() {
        return new AppleMac("MacPro", COMPUTER_BRAND.APPLE, 100, 50.5, true);
    }

    public static AbstractPC createMacAir() {
        return new AppleMac("MacAir",COMPUTER_BRAND.APPLE ,70, 40.3, false);
    }
}

