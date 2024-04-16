package com.pokergame.game.five_card_draw;

import com.pokergame.model.Card;
import com.pokergame.model.Hand;
import com.pokergame.model.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class FiveCardsVariantTest {
    @Test
    void fiveCardsVariantShouldReturnCorrectName() {
        FiveCardsVariant variant = new FiveCardsVariant();
        Assertions.assertEquals("", variant.getName());
    }

    @Test
    void fiveCardsVariantShouldReturnCorrectInitialCardsPerPlayer() {
        FiveCardsVariant variant = new FiveCardsVariant();
        Assertions.assertEquals(5, variant.getInitialCardsPerPlayer());
    }

    @Test
    void fiveCardsVariantShouldReturnCorrectMaximumPlayers() {
        FiveCardsVariant variant = new FiveCardsVariant();
        Assertions.assertEquals(5, variant.getMaximumPlayers());
    }

    @Test
    void fiveCardsVariantShouldReturnCorrectMinimumPlayers() {
        FiveCardsVariant variant = new FiveCardsVariant();
        Assertions.assertEquals(2, variant.getMinimumPlayers());
    }

    @Test
    void fiveCardsVariantShouldEvaluateHandsCorrectly() {
        FiveCardsVariant variant = new FiveCardsVariant();
        Player player = new Player("Test Player");
        player.addCardToHand(new Card("Ace", "Spades"));
        player.addCardToHand(new Card("King", "Spades"));
        player.addCardToHand(new Card("Queen", "Spades"));
        player.addCardToHand(new Card("Jack", "Spades"));
        player.addCardToHand(new Card("10", "Spades"));
        List<Player> players = new ArrayList<>();
        players.add(player);
        variant.evaluateHands(players);
        Assertions.assertEquals(PokerHandAnalyzer.analyzeHand(player.getHand()).y, player.getScore().y);
    }
}
