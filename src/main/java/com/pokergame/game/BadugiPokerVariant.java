package com.pokergame.game;

import com.pokergame.model.Hand;
import com.pokergame.model.Player;

import java.util.List;

public class BadugiPokerVariant implements PokerVariant {

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
    public void evaluateHands(List<Player> players) {

    }

    @Override
    public String getHandRankingDescription(Hand hand) {
        return "";
    }
}
