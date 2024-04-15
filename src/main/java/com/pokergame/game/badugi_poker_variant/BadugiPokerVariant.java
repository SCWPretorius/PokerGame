package com.pokergame.game.badugi_poker_variant;

import com.pokergame.game.PokerVariant;
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
    public void evaluateHands(List<Player> players) {}
}
