package com.pokergame.game;

import com.pokergame.model.Player;

import java.util.List;

public interface PokerVariant {
    String getName();
    int getInitialCardsPerPlayer();
    int getMaximumPlayers();
    int getMinimumPlayers();
    void evaluateHands(List<Player> players);
}
