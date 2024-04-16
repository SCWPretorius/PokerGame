package com.pokergame.game.badugi_poker_variant;

import com.pokergame.game.PokerVariant;
import com.pokergame.model.Player;

import java.util.List;

/**
 * This class represents the Badugi variant of the Poker game.
 * It implements the PokerVariant interface.
 */
public class BadugiPokerVariant implements PokerVariant {

    /**
     * Returns the name of the poker variant.
     * @return a String representing the name of the poker variant.
     */
    @Override
    public String getName() {
        return "";
    }

    /**
     * Returns the initial number of cards each player should have.
     * @return an integer representing the initial number of cards per player.
     */
    @Override
    public int getInitialCardsPerPlayer() {
        return 0;
    }

    /**
     * Returns the maximum number of players allowed in this poker variant.
     * @return an integer representing the maximum number of players.
     */
    @Override
    public int getMaximumPlayers() {
        return 0;
    }

    /**
     * Returns the minimum number of players required to play this poker variant.
     * @return an integer representing the minimum number of players.
     */
    @Override
    public int getMinimumPlayers() {
        return 0;
    }

    /**
     * Evaluates the hands of the players.
     * @param players a List of Player objects representing the players in the game.
     */
    @Override
    public void evaluateHands(List<Player> players) {}
}
