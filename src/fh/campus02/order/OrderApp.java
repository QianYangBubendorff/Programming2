package fh.campus02.order;

import java.util.Arrays;

public class OrderApp {
    public static void main(String[] args) {
        Article a1=new Article("tshirt",1,20.30);
        Article a2=new Article("dress",2,40.30);
        Article a3=new Article("shorts",3,30.30);
        Article a4=new Article("hat",4,10.30);
        Article a5=new Article("gloves",5,10.30);

        Order o1=new Order(0,4,new Article[4]);

        o1.addArticle(a1);
        o1.addArticle(a2);
        o1.addArticle(a3);
        o1.addArticle(a4);
        System.out.println(o1.toString());

        System.out.println(o1.findMostExpensiveArticle());
        System.out.println(o1.findMostExpensiveOrderPosition());
        System.out.println(o1.calculateTax());
        System.out.println(o1.sumOrder());
        System.out.println(o1.sumOrderWithTax());

        o1.increaseArray();
        o1.addArticle(a5);
        System.out.println(o1.toString());

        o1.removeArticle(2);
        System.out.println(o1.toString());

    }

}
