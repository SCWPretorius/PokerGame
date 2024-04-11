package com.pokergame;

import com.pokergame.model.Deck;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DeckTest {
    private Deck deck;

    @BeforeEach
    public void setUp() {
        deck = new Deck();
    }

    @Test
    void testDeckCreation() {
        Assertions.assertEquals(52, deck.getSize());
    }

    @Test
    void testDeckShuffle() {
    }

    @Test
    void testDealCard() {
    }

    @Test
    void testDealAllCards() {
    }

    @Test
    void testDealCardFromEmptyDeck() {
    }
}
