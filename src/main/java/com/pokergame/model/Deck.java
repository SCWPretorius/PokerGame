package com.pokergame.model;

import com.pokergame.shuffling.BasicShuffleAlgorithm;
import com.pokergame.shuffling.ShuffleAlgorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a deck of playing cards.
 */
public class Deck {
    private List<Card> cards;

    /**
     * Constructs a Deck and initializes it with a standard set of 52 playing cards.
     */
    public Deck() {
        cards = new ArrayList<>();
        initializeDeck();
    }

    /**
     * Initializes the deck with a standard set of 52 playing cards.
     */
    private void initializeDeck() {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"};
        String[] suits = {"H", "D", "C", "S"};

        for (String suit : suits) {
            for (String rank : ranks) {
                Card card = new Card(rank, suit);
                cards.add(card);
            }
        }
    }

    /**
     * Deals a card from the deck.
     *
     * @return the dealt card, or null if the deck is empty
     */
    public Card dealCard() {
        if (!cards.isEmpty()) {
            return cards.remove(cards.size() -1);
        }
        return null;
    }

    /**
     * Returns the current size of the deck.
     *
     * @return the number of cards left in the deck
     */
    public int getSize() {
        return cards.size();
    }

    /**
     * Shuffles the deck using a specified shuffle algorithm.
     */
    public void shuffle() {
        // Change shuffle algorithm here
        System.out.println("Shuffling ... Shuffling ... Shuffling ...");
        ShuffleAlgorithm shuffleAlgorithm = new BasicShuffleAlgorithm();
        shuffleAlgorithm.shuffle(cards);
    }
}
