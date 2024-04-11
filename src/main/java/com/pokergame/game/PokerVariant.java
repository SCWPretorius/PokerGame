package com.pokergame.game;

import com.pokergame.model.Hand;

public interface PokerVariant {
    String getName();
    int getInitialCardsPerPlayer();
    int getMaximumPlayers();
    int getMinimumPlayers();
    boolean isHandComplete(Hand hand);
    int compareHands(Hand hand1, Hand hand2);
    String getHandRankingDescription(Hand hand);
}
