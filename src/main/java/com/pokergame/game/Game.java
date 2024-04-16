package com.pokergame.game;

import com.pokergame.model.Card;
import com.pokergame.model.Deck;
import com.pokergame.model.Player;

import java.util.List;

/**
 * This class represents a game of poker.
 * It contains the list of players, the game state, the poker variant being played, and the deck of cards.
 */
public class Game {
    private java.util.List<Player> players;
    private boolean gameEnded;
    private PokerVariant pokerVariant;
    private Deck deck;

    /**
     * Constructs a new Game with the specified poker variant.
     * @param pokerVariant the poker variant to be played in this game.
     */
    public Game(PokerVariant pokerVariant) {
        this.pokerVariant = pokerVariant;
        this.players = new java.util.ArrayList<>();
        this.gameEnded = false;
        this.deck = new Deck();
    }

    /**
     * Adds a player to the game.
     * @param player the player to be added.
     */
    public void addPlayer(Player player) {
        players.add(player);
    }

    /**
     * Returns the list of players in the game.
     * @return a List of Player objects representing the players in the game.
     */
    public List<Player> getPlayers() {
        return players;
    }

    /**
     * Starts the game by shuffling the deck and dealing the initial cards to the players.
     */
    public void startGame() {
        deck.shuffle();
        dealInitialCards();
    }

    /**
     * Determines the winner of the game based on the scores of the players' hands.
     * @return a String representing the winner and their winning hand.
     */
    public String determineWinner() {
        pokerVariant.evaluateHands(players);

        String winner = "";
        String ranking = "";
        String winningHand = "";
        int score = -1;
        for (Player player : players) {
            if (player.getScore().y > score) {
                winner = player.getName();
                score = player.getScore().y;
                ranking = player.getScore().x;
                winningHand = player.getHand().toString();
            }
        }
        return winner + " wins with " + ranking + "\n" + winningHand;
    }

    /**
     * Ends the game by clearing the players' hands and setting the game state to ended.
     */
    public void endGame() {
        for (Player player : players) {
            player.clearHand();
        }
        this.gameEnded = true;
    }

    /**
     * Checks if the game is over.
     * @return a boolean representing whether the game has ended.
     */
    public boolean isOver() {
        return this.gameEnded;
    }

    /**
     * Deals the initial cards to the players based on the poker variant being played.
     */
    private void dealInitialCards() {
        // The number of cards dealt may vary based on the poker variant
        for (Player player : players) {
            for (int i = 0; i < pokerVariant.getInitialCardsPerPlayer(); i++) {
                Card card = deck.dealCard();
                player.addCardToHand(card);
            }
        }
    }
}
