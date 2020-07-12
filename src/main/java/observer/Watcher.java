package observer;

import java.util.Observable;
import java.util.Observer;

public class Watcher implements Observer {

   private int poziomPaniki;

    public Watcher(int poziomPaniki) {
        this.poziomPaniki = poziomPaniki;
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
