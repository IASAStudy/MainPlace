package ch7;

import java.util.*;

public class Exercise7_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();
        for(int i=0; i<deck.cards.length; i++){
            System.out.print(deck.cards[i]+", ");
        }
        System.out.println();
        System.out.println(deck.pick(0));
        System.out.println(deck.pick());

        deck.shuffle();
        for(int i=0; i<deck.cards.length; i++){
            System.out.print(deck.cards[i]+", ");
        }
        System.out.println();
        System.out.println(deck.pick(0));
    }
}

class SutdaDeck {
    final int CARD_NUM =20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for(int i=0; i<CARD_NUM;i++) {
            cards[i] = new SutdaCard();
            cards[i].num= i%10+1;
            if(i==0 || i==2 || i==7) {
                cards[i].isKwang=true;
            } else {
                cards[i].isKwang=false;
            }
        }
    }

    void shuffle() {
        List<SutdaCard> tmp= Arrays.asList(cards); // array to list
        Collections.shuffle(tmp);   // shuffle
        cards = tmp.toArray(new SutdaCard[tmp.size()]); //list to array
    }

    SutdaCard pick(int index) {
        return cards[index];
    }
    SutdaCard pick() {
        return cards[(int)(Math.random()*CARD_NUM)];
    }
}

class SutdaCard{ // Here 7-14
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1,true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num+(isKwang ? "K":"");
    }
}
