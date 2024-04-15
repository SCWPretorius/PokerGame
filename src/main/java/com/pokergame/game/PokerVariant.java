package com.pokergame.game;

import com.pokergame.model.Player;

import java.util.List;

/**
 * This interface represents a variant of the Poker game.
 * It defines the methods that all poker variants must implement.
 */
public interface PokerVariant {
    /**
     * Returns the name of the poker variant.
     * @return a String representing the name of the poker variant.
     */
    String getName();

    /**
     * Returns the initial number of cards each player should have.
     * @return an integer representing the initial number of cards per player.
     */
    int getInitialCardsPerPlayer();

    /**
     * Returns the maximum number of players allowed in this poker variant.
     * @return an integer representing the maximum number of players.
     */
    int getMaximumPlayers();

    /**
     * Returns the minimum number of players required to play this poker variant.
     * @return an integer representing the minimum number of players.
     */
    int getMinimumPlayers();

    /**
     * Evaluates the hands of all players and determines the winner(s).
     * @param players a List of Player objects representing the players in the game.
     */
    void evaluateHands(List<Player> players);
}
