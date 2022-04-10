package fh.campus02.order;

import java.util.Arrays;

public class Order {

    private int nrArticles;
    private int capacityOrder;
    private Article[] articles = new Article[capacityOrder];

    public Order(int nrArticles, int capacityOrder, Article[] articles) {
        nrArticles = 0;
        this.capacityOrder = capacityOrder;
        this.articles = articles;
    }

    public int getNrArticles() {
        return nrArticles;
    }

    public void setNrArticles(int nrArticles) {
        this.nrArticles = nrArticles;
    }

    public int getCapacityOrder() {
        return capacityOrder;
    }

    public void setCapacityOrder(int capacityOrder) {
        this.capacityOrder = capacityOrder;
    }

    public Article[] getArticles() {
        return articles;
    }

    public void setArticles(Article[] articles) {
        this.articles = articles;
    }

    @Override
    public String toString() {
        return "Order{" +
                "nrArticles=" + nrArticles +
                ", capacityOrder=" + capacityOrder +
                ", articles=" + Arrays.toString(articles) +
                '}';
    }

    public void addArticle(Article a) {
        articles[nrArticles] = a;
        nrArticles = nrArticles + 1;
    }

    public int findMostExpensiveArticle() {
        double max = -1.0;
        int maxIndex = 0;
        for (int i = 0; i < capacityOrder; i++) {
            if (max < articles[i].getPrice()) {
                max = articles[i].getPrice();
                maxIndex = i;
            }
        }
        return maxIndex + 1;
    }

    public int findMostExpensiveOrderPosition() {
        double max = 0;
        int maxIndex = 0;
        for (int i = 0; i < capacityOrder; i++) {
            if (max < articles[i].getPrice() * articles[i].getNumber()) {
                max = articles[i].getPrice() * articles[i].getNumber();
                maxIndex = i;
            }
        }
        return maxIndex + 1;
    }

    public double sumOrder() {
        double erg = 0;
        for (int i = 0; i < capacityOrder; i++) {
            erg = erg + articles[i].getPrice() * articles[i].getNumber();
        }
        return erg;
    }

    public double calculateTax() {
        double taxSum = 0;
        double taxRate = 0;
        for (int i = 0; i < capacityOrder; i++) {
            if (articles[i].getPrice() < 20) {
                taxRate = 0.05;
            } else {
                taxRate = 0.20;
            }
            taxSum = taxSum + taxRate * articles[i].getPrice();
        }
        return taxSum;
    }

    public double sumOrderWithTax() {
        return sumOrder() + calculateTax();
    }

//    if the last element in the array is not null, then increase the length of the array by 1. The new array copies all the elements of the old array. The last element of the new array is null.
    public void increaseArray() {
        Article[] erg = new Article[capacityOrder + 1];
        if (articles[capacityOrder - 1] != null) {
            for (int i = 0; i < capacityOrder; i++) {
                erg[i] = articles[i];
            }
        }
        capacityOrder=capacityOrder+1;
        articles = erg;
    }

// copy the element of the old array as long as the article number is not identical. The new index will also increase when the number is not identical.

    public void removeArticle(int nr) {
        Article[] erg = new Article[capacityOrder - 1];
        int index = 0;
        for (int i = 0; i < capacityOrder; i++) {
            if (articles[i].getNumber() != nr) {
                erg[index++] = articles[i];
            }

        }
        articles = erg;


    }
}

