package com.pokergame.game;

import com.pokergame.model.Hand;

public class FiveCardsVariant implements PokerVariant {
    @Override
    public String getName() {
        return "";
    }

    @Override
    public int getInitialCardsPerPlayer() {
        return 0;
    }

    @Override
    public int getMaximumPlayers() {
        return 0;
    }

    @Override
    public int getMinimumPlayers() {
        return 0;
    }

    @Override
    public boolean isHandComplete(Hand hand) {
        return false;
    }

    @Override
    public int compareHands(Hand hand1, Hand hand2) {
        return 0;
    }

    @Override
    public String getHandRankingDescription(Hand hand) {
        return "";
    }
}
