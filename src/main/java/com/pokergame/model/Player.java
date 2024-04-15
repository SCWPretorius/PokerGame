package com.pokergame.model;

/**
 * Represents a player in the poker game.
 */
public class Player {
    private String name;
    private Hand hand;
    private Tuple<String, Integer> score;

    /**
     * Constructs a Player with the specified name.
     *
     * @param name the name of the player
     */
    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
        this.score = new Tuple<>("", 0);
    }

    /**
     * Returns the name of the player.
     *
     * @return the name of the player
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the hand of the player.
     *
     * @return the hand of the player
     */
    public Hand getHand() {
        return hand;
    }

    /**
     * Adds a card to the player's hand.
     *
     * @param card the card to be added to the player's hand
     */
    public void addCardToHand(Card card) {
        hand.addCard(card);
    }

    /**
     * Clears all the cards from the player's hand.
     */
    public void clearHand() {
        hand.clear();
    }

    /**
     * Sets the score of the player.
     *
     * @param score the score to be set for the player
     */
    public void setScore(Tuple score) {
        this.score = score;
    }

    /**
     * Returns the score of the player.
     *
     * @return the score of the player
     */
    public Tuple<String, Integer> getScore() {
        return score;
    }
}
