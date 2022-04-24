package fh.campus02.blackJack;

import java.util.HashMap;
import java.util.Map;

public class Blackjack {
    private Map<Player,Integer> players=new HashMap<>();

    public Map<Player, Integer> getPlayers() {
        return players;
    }

    public void setPlayers(Map<Player, Integer> players) {
        this.players = players;
    }

    boolean add(Player player){
//        int result= players.put(player,0);
//        if(result==0){
//           return false;
//        }
//        return true;

        if(players.containsKey(player)){
            return false;
        }else players.put(player,0);
        return true;
    }

    boolean addCard(Player player, Integer cardValue){
        if(players.containsKey(player)){
            players.replace(player,players.get(player)+cardValue);
            return true;
        }else return false;
    }

    Integer getValue(Player player){
        if(players.containsKey(player)){
            return players.get(player);
        }else return null;
    }

    Player getWinner(){
        int highest=0;
        int count=0;
        Player winner=new Player("",0);
        for(Player p: players.keySet()){
            if(players.get(p)>highest && players.get(p)<=21){
                highest=players.get(p);
                winner=p;}
        }
        for(Player p: players.keySet()) {
            if (players.get(p) == highest) {
                count++;
            }
        }
        if(count==1){
        return winner;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Blackjack{" +
                "players=" + players +
                '}';
    }
}
