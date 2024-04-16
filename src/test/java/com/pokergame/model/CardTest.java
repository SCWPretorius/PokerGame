package com.pokergame.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CardTest {
    @Test
    void cardShouldHaveCorrectSuitAndRankAfterCreation() {
        Card card = new Card("Ace", "Spades");
        Assertions.assertEquals("Ace", card.getRank());
        Assertions.assertEquals("Spades", card.getSuit());
    }

    @Test
    void cardShouldReturnCorrectStringRepresentation() {
        Card card = new Card("Ace", "Spades");
        Assertions.assertEquals("AceSpades", card.toString());
    }

    @Test
    void cardsWithDifferentSuitOrRankShouldNotBeEqual() {
        Card card1 = new Card("Ace", "Spades");
        Card card2 = new Card("King", "Spades");
        Card card3 = new Card("Ace", "Hearts");
        Assertions.assertNotEquals(card1, card2);
        Assertions.assertNotEquals(card1, card3);
    }
}
