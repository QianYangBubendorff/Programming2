package fh.campus02.blackJack;

import java.util.HashMap;

public class DemoBJ {
    public static void main(String[] args) {
        Player p1= new Player("Max",17);
        Player p2= new Player("Susi",20);
        Player p3= new Player("Lucy",23);
        Player p4 = new Player("lee",19);
        Player p5= new Player("Tian",25);
        Blackjack b=new Blackjack();
        b.add(p1);
        b.add(p2);
        b.add(p3);
        b.add(p4);

        b.addCard(p1,21);
        b.addCard(p2,18);
        b.addCard(p3,20);


        System.out.println(b.add(p1));
        System.out.println(b.addCard(p4,1));
        System.out.println(b.getValue(p3));
        System.out.println(b.getWinner());
        System.out.println(b);
    }
}
