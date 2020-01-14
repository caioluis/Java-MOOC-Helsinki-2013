
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Caio
 */
public class Hand implements Comparable<Hand> {

    private ArrayList<Card> cards = new ArrayList();

    public void add(Card card) {
        cards.add(card);
    }

    public void print() {
        for (Card card : cards) {
            System.out.println(card.toString());
        }
    }

    public void sort() {
        Collections.sort(cards);
    }

    @Override
    public int compareTo(Hand hand) {
        int firstValue = 0;
        int secondValue = 0;
        for (Card card : this.cards) {
            firstValue += card.getValue();
        }
        for (Card card : hand.cards) {
            secondValue += card.getValue();
        }
        if (firstValue < secondValue) {
            return -1;
        } if (firstValue == secondValue) {
            return 0;
        } else{
            return 1; 
        } 
    }
}
