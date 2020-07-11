package abstractFactory;

import lombok.Data;

@Data
public abstract class AbstractPC {
    String nazwa;
    COMPUTER_BRAND brand;
    int cpuPower;
    double gpuPower;
    boolean isOverclocked;

    public AbstractPC(String nazwa, COMPUTER_BRAND brand, int cpuPower, double gpuPower, boolean isOverclocked) {
        this.nazwa = nazwa;
        this.brand = brand;
        this.cpuPower = cpuPower;
        this.gpuPower = gpuPower;
        this.isOverclocked = isOverclocked;
    }
}
