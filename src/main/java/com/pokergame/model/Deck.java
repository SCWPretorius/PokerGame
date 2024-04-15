package com.pokergame.model;

import com.pokergame.shuffling.BasicShuffleAlgorithm;
import com.pokergame.shuffling.ShuffleAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        initializeDeck();
    }

    private void initializeDeck() {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits = {"H", "D", "C", "S"};

        for (String suit : suits) {
            for (String rank : ranks) {
                Card card = new Card(rank, suit);
                cards.add(card);
            }
        }
    }

    public Card dealCard() {
        if (!cards.isEmpty()) {
            return cards.removeLast();
        }
        return null;
    }

    public int getSize() {
        return cards.size();
    }

    public void shuffle() {
        // Change shuffle algorithm here
        System.out.println("Shuffling ... Shuffling ... Shuffling ...");
        ShuffleAlgorithm shuffleAlgorithm = new BasicShuffleAlgorithm();
        shuffleAlgorithm.shuffle(cards);
    }
}
