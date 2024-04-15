package com.pokergame.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a hand of playing cards.
 */
public class Hand {
    private List<Card> cards;

    /**
     * Constructs a Hand and initializes it with an empty list of cards.
     */
    public Hand() {
        cards = new ArrayList<>();
    }

    /**
     * Adds a card to the hand.
     *
     * @param card the card to be added to the hand
     */
    public void addCard(Card card) {
        cards.add(card);
    }

    /**
     * Clears all the cards from the hand.
     */
    public void clear() {
        cards.clear();
    }

    /**
     * Returns the current size of the hand.
     *
     * @return the number of cards in the hand
     */
    public int getSize() {
        return cards.size();
    }

    /**
     * Returns the cards in the hand.
     *
     * @return the cards in the hand
     */
    public List<Card> getCards() {
        return cards;
    }

    /**
     * Checks if a specific card is in the hand.
     *
     * @param card the card to check for in the hand
     * @return true if the card is in the hand, false otherwise
     */
    public boolean containsCard(Card card) {
        return cards.contains(card);
    }

    /**
     * Returns a string representation of the hand.
     * The cards are represented by their rank and suit, with suits represented by their respective symbols.
     *
     * @return a string representation of the hand
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Card card : cards) {
            sb.append(card).append(" ");
        }

        return sb.toString().trim()
                .replaceAll("C", "♣")
                .replaceAll("D", "♦")
                .replaceAll("H", "♥")
                .replaceAll("S", "♠")
                .replaceAll("T", "10");
    }
}
