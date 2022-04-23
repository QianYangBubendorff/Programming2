package fh.campus02.Eventkalender;

import java.util.ArrayList;
import java.util.HashMap;

public class EventKalenders {
    public static void main(String[] args) {
        EventKalenders k1 = new EventKalenders();
        Event e1 = new Event();
        e1.setEintrittspreis(20.5);
        e1.setOrt("Augarten");
        e1.setTitle("Party");
        Event e2 = new Event();
        e2.setEintrittspreis(10.5);
        e2.setOrt("Stadtpark");
        e2.setTitle("New Event");
        Event e3 = new Event();
        e3.setOrt("Augarten");
        e3.setEintrittspreis(15.5);
        e3.setTitle("Special Event");
        k1.add(e1);
        k1.add(e2);
        k1.add(e3);
        System.out.println(k1.getByTitle("Party"));
        System.out.println(k1.getByOrt("Stadtpark"));
        System.out.println(k1.getByEintrittsPreis(10.0,15.5));
        System.out.println(k1.getMostExpensiveByOrt("Augarten"));
        System.out.println(k1.getAvgPreisByOrt("Augarten"));
        System.out.println(k1.getCountEventsByOrt());
        System.out.println(k1.getSumPriceEventsByOrt());

    }

    private ArrayList<Event> list = new ArrayList<>();

    public void add(Event e) {
        list.add(e);
    }

    public Event getByTitle(String title) {
        Event result = new Event();
        for (Event ev : list) {
            if (ev.getTitle().equals(title)) {
                result = ev;
            }
        }
        return result;
    }

    public ArrayList<Event> getByOrt(String ort) {
        ArrayList<Event> resultList = new ArrayList<>();
        for (Event ev : list) {
            if (ev.getOrt().equals(ort)) {
                resultList.add(ev);
            }
        }
        return resultList;
    }

    public ArrayList<Event> getByEintrittsPreis(Double min, double max) {
        ArrayList<Event> resultList = new ArrayList<>();
        for (Event ev : list) {
            if (ev.getEintrittspreis() >= min && ev.getEintrittspreis() <= max) {
                resultList.add(ev);
            }
        }
        return resultList;
    }

    public Event getMostExpensiveByOrt(String ort) {
        double highest = 0;
        int index=0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getEintrittspreis() > highest && list.get(i).getOrt().equals(ort)) {
                highest = list.get(i).getEintrittspreis();
                index=i;

            }

        }
        return list.get(index);
    }

    public double getAvgPreisByOrt(String ort) {
        double erg = 0;
        double sum = 0;
        int count = 0;
        for (Event ev : list) {
            if (ev.getOrt().equals(ort)) {
                count++;
                sum = sum + ev.getEintrittspreis();
                erg = sum / count;
            }
        }
        return erg;
    }

    public HashMap<String, Integer> getCountEventsByOrt() {
        HashMap<String, Integer> ergMap = new HashMap<>();
        int count = 1;
//        boolean duplicateFound = false;
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = 1; j < list.size(); j++) {
//                if (list.get(i).equals(list.get(j))) {
//                    ergMap.put(list.get(i).getOrt(), count++);
//                    duplicateFound = true;
//                }
//            }
//            if (!duplicateFound) {
//                ergMap.put(list.get(i).getOrt(), count);
//            }
//        }
       for (Event ev : list){
           if(!ergMap.containsKey(ev.getOrt())){
               ergMap.put(ev.getOrt(),1);
           }else ergMap.put(ev.getOrt(),ergMap.get(ev.getOrt())+1);
       }
        return ergMap;
    }

    public HashMap<String,Double> getSumPriceEventsByOrt(){
        HashMap<String, Double> ergMap = new HashMap<>();
        double sumPrice=0.0;
        for (Event ev : list){
            if(!ergMap.containsKey(ev.getOrt())){
                ergMap.put(ev.getOrt(),ev.getEintrittspreis());
            }else {
                sumPrice = ergMap.get(ev.getOrt());
                sumPrice = sumPrice + ev.getEintrittspreis();
                ergMap.put(ev.getOrt(), sumPrice);
            }
            }
        return ergMap;
        }


}
