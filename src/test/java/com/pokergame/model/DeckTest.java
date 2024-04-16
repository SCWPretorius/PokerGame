package com.pokergame.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DeckTest {
    @Test
    void deckShouldContain52CardsInitially() {
        Deck deck = new Deck();
        Assertions.assertEquals(52, deck.getSize());
    }

    @Test
    void deckShouldContain51CardsAfterDrawingOne() {
        Deck deck = new Deck();
        deck.dealCard();
        Assertions.assertEquals(51, deck.getSize());
    }

    @Test
    void deckShouldBeEmptyAfterDrawingAllCards() {
        Deck deck = new Deck();
        for (int i = 0; i < 52; i++) {
            deck.dealCard();
        }
        Assertions.assertEquals(0, deck.getSize());
    }

    @Test
    void drawingFromEmptyDeckShouldReturnNull() {
        Deck deck = new Deck();
        for (int i = 0; i < 52; i++) {
            deck.dealCard();
        }
        Assertions.assertNull(deck.dealCard());
    }

    @Test
    void deckShouldNotBeInOrderAfterShuffle() {
        Deck deck = new Deck();
        Deck shuffledDeck = new Deck();
        shuffledDeck.shuffle();
        Assertions.assertNotEquals(deck, shuffledDeck);
    }
}
