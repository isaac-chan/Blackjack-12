package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by Michael on 3/8/2016.
 */
public class Game {

    public java.util.List<Card> deck = new ArrayList<>();
    public Player p = new Player();
    public Dealer d = new Dealer();

    public void buildDeck() {
        for(int i = 2; i < 15; i++){
            deck.add(new Card(i,Suit.Clubs));
            deck.add(new Card(i,Suit.Hearts));
            deck.add(new Card(i,Suit.Diamonds));
            deck.add(new Card(i,Suit.Spades));
        }
    }

    public void shuffle() {
        long seed = System.nanoTime();
        Collections.shuffle(deck, new Random(seed));
    }

    public void dealStartHand(){//give two cards to the player and dealer
        for(int i=0; i<2; i++){
            p.setHand(deck.get(deck.size()-1));
            deck.remove(deck.size()-1);
            d.setHand(deck.get(deck.size()-1));
            deck.remove(deck.size()-1);
        }
    }






}
