package com.pokergame.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlayerTest {
    private Player player;

    @BeforeEach
    void setUp() {
        player = new Player("John");
    }

    @Test
    void playerShouldHaveNameAfterCreation() {
        Assertions.assertEquals("John", player.getName());
    }

    @Test
    void playerShouldHaveCardInHandAfterAddingCard() {
        Card card = new Card("Ace", "Spades");
        player.addCardToHand(card);
        Assertions.assertTrue(player.getHand().getCards().contains(card));
    }

    @Test
    void playerShouldHaveEmptyHandAfterClearingHand() {
        Card card = new Card("Ace", "Spades");
        player.addCardToHand(card);
        player.clearHand();
        Assertions.assertTrue(player.getHand().getCards().isEmpty());
    }

    @Test
    void playerShouldHaveUpdatedScoreAfterSettingScore() {
        Tuple<String, Integer> newScore = new Tuple<>("Pair", 2);
        player.setScore(newScore);
        Assertions.assertEquals(newScore, player.getScore());
    }
}
