package fh.campus02.hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;

public class SerialKillers {
//    unique serial killer names

    public static void main(String[] args) {
        HashSet<String> serialNickNames = new HashSet<>();

        serialNickNames.add("Tred Bundy");
        serialNickNames.add("Hannibal Lecter");
        serialNickNames.add("Zodiac Killer");

        for(String s: serialNickNames){
            System.out.println(s);
        }
        serialNickNames.add("Tred Bundy");
        System.out.println("*********************");
        System.out.println(serialNickNames.add("Tred Bundy"));
        System.out.println(serialNickNames.add("Edmund Kemper"));

        for(String s: serialNickNames){
            System.out.println(s);
        }

        HashSet<String> americanSerialKiller = new HashSet<>();
        americanSerialKiller.add("Tred Bundy");
        americanSerialKiller.add("Edmund Kemper");
        americanSerialKiller.add("Hannibal Lecter");
        serialNickNames.retainAll(americanSerialKiller);// retainAll method, keep the common elements of both HashSets.
        System.out.println("--------");
        for(String s: serialNickNames){
            System.out.println(s);
        }

//        Hashmap to store all the victims

        HashMap<String, ArrayList<String>> opfer = new HashMap<>();
        for(String crazyAmerican: americanSerialKiller){
            ArrayList<String> o= new ArrayList<>();
            o.add("Opfer 1");
            o.add("Opfer 2");
            o.add("Opfer 3");
            opfer.put(crazyAmerican,o);
        }

        ArrayList<String> opfi = opfer.get("Tred Bundy");

        opfi.add("opfer 4");
    }
}
