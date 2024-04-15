package com.pokergame.game;

import com.pokergame.model.Hand;
import com.pokergame.model.Player;

import java.util.List;

public interface PokerVariant {
    String getName();
    int getInitialCardsPerPlayer();
    int getMaximumPlayers();
    int getMinimumPlayers();
    boolean isHandComplete(Hand hand);
    void evaluateHands(List<Player> players);
    String getHandRankingDescription(Hand hand);
}
