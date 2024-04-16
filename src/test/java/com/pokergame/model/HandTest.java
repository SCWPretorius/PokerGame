package com.pokergame.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HandTest {
    @Test
    void handShouldBeEmptyAfterCreation() {
        Hand hand = new Hand();
        Assertions.assertEquals(0, hand.getSize());
    }

    @Test
    void handShouldContainCardAfterAddition() {
        Hand hand = new Hand();
        Card card = new Card("Ace", "Spades");
        hand.addCard(card);
        Assertions.assertEquals(1, hand.getSize());
        Assertions.assertTrue(hand.containsCard(card));
    }

    @Test
    void handShouldNotContainCardAfterClear() {
        Hand hand = new Hand();
        Card card = new Card("Ace", "Spades");
        hand.addCard(card);
        hand.clear();
        Assertions.assertEquals(0, hand.getSize());
        Assertions.assertFalse(hand.containsCard(card));
    }

    @Test
    void handShouldReturnCorrectSize() {
        Hand hand = new Hand();
        Card card1 = new Card("Ace", "Spades");
        Card card2 = new Card("King", "Hearts");
        hand.addCard(card1);
        hand.addCard(card2);
        Assertions.assertEquals(2, hand.getSize());
    }

    @Test
    void handShouldNotContainCardNotAdded() {
        Hand hand = new Hand();
        Card card1 = new Card("Ace", "Spades");
        Card card2 = new Card("King", "Hearts");
        hand.addCard(card1);
        Assertions.assertFalse(hand.containsCard(card2));
    }
}
