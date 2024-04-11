package com.pokergame;

import com.pokergame.model.Card;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CardTest {
    @Test
    void testCardCreation() {
        Card card = new Card("Ace", "Spades");
        Assertions.assertEquals("Ace", card.getRank());
        Assertions.assertEquals("Spades", card.getSuit());
    }
}
