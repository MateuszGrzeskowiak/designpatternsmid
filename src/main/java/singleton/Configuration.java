package singleton;


public class Configuration {
    public final Configuration INSTANCE = new Configuration();

    private Configuration() {
    }
}
