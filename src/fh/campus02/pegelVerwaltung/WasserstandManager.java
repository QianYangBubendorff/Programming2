package fh.campus02.pegelVerwaltung;

import java.util.ArrayList;

public class WasserstandManager {
    private ArrayList<Wasserstand> list = new ArrayList<>();

    public Wasserstand findById(int id) {
        Wasserstand erg = new Wasserstand();
        for (Wasserstand w : list) {
            if (id == w.getId()) {
                erg = w;
            }
        }
        return erg;
    }

    public ArrayList<Wasserstand> findAllByGewasser(String gewaesserName){
        ArrayList<Wasserstand> ergList= new ArrayList<>();
        for (Wasserstand e: list){
            if(gewaesserName.equals(e.getGewaesserName())){
                ergList.add(e);
            }
        }
        return ergList;
    }

    public Wasserstand findLastWasserstand(String gewaessername){
        Wasserstand ergStand= new Wasserstand();
        int zeit=0;
        for(Wasserstand f: list){
            if(gewaessername.equals(f.getGewaesserName())){
                if (zeit < f.getZeitPunkt()) {
                    zeit = f.getZeitPunkt();
                    ergStand = f;
                }
            }

        }
        return ergStand;
    }

    public ArrayList<Wasserstand> findForAlarmierung(){
        ArrayList<Wasserstand> erg= new ArrayList<>();
        for(Wasserstand g: list){
            if(g.getMessWert()>g.getMessWertFuerAlarmierung()){
                erg.add(g);
            }
        }return erg;
    }

    public double calcMittlererWasserstand (String gewaesserName, String ort){
        int count=0;
        double totalMess=0;
        for(Wasserstand k: list){
            if(gewaesserName.equals(k.getGewaesserName()) && ort.equals(k.getOrt())){
                count++;
                totalMess= totalMess+ k.getMessWert();
            }
        }return totalMess/count;
    }

    public ArrayList<Wasserstand> findByZeitpunkt(int von, int bis, String gewaesserName, String ort){
        ArrayList<Wasserstand> erg1= new ArrayList<>();
        for(Wasserstand l: list){
            if(gewaesserName.equals(l.getGewaesserName()) && ort.equals(l.getOrt()) && l.getZeitPunkt()>von && l.getZeitPunkt()<bis){
                erg1.add(l);
            }
        }
        return erg1;
    }

}
