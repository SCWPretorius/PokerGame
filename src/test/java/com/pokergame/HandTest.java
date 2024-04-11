package com.pokergame;

import com.pokergame.model.Card;
import com.pokergame.model.Hand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HandTest {
    @Test
    void testHandCreation() {
        Hand hand = new Hand();
        Assertions.assertEquals(0, hand.getSize());
    }

    @Test
    void testAddCardToHand() {
        Hand hand = new Hand();
        Card card = new Card("Ace", "Spades");
        hand.addCard(card);
        Assertions.assertEquals(1, hand.getSize());
        Assertions.assertTrue(hand.containsCard(card));
    }
}
