package com.pokergame.game.five_card_draw;

import com.pokergame.game.PokerVariant;
import com.pokergame.model.Hand;
import com.pokergame.model.Player;

import java.util.List;

public class FiveCardsVariant implements PokerVariant {
    @Override
    public String getName() {
        return "";
    }

    @Override
    public int getInitialCardsPerPlayer() {
        return 5;
    }

    @Override
    public int getMaximumPlayers() {
        return 5;
    }

    @Override
    public int getMinimumPlayers() {
        return 2;
    }

    @Override
    public void evaluateHands(List<Player> players) {
        for (Player player : players) {
            Hand hand = player.getHand();
            player.setScore(PokerHandAnalyzer.analyzeHand(hand));
        }
    }
}
