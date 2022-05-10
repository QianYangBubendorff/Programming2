package fh.campus02.logisticManager;
import java.util.ArrayList;

public class LogisticManager {
    private ArrayList<Moveable> moveableobjekte;

    public LogisticManager() {
       moveableobjekte= new ArrayList<>();
    }

    public void add(Moveable m){
        moveableobjekte.add(m);
    }

    public void moveAll(String destination){
        for(Moveable m:moveableobjekte){
            m.move(destination);
        }
    }
}
