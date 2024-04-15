package com.pokergame.game.five_card_draw;

import com.pokergame.model.Card;
import com.pokergame.model.Hand;
import com.pokergame.model.Tuple;

/***
 * Class used to analyze the poker hand and return the hand strength
 * Algorithm was found on https://rosettacode.org/wiki/Poker_hand_analyser modifications was made
 */
public class PokerHandAnalyzer {

    final static String FACES = "AKQJT98765432";
    final static String SUITS = "HDSC";

    public static Tuple analyzeHand(Hand hand) {
        if (hand == null)
            return new Tuple("null", -1);

        if (hand.getSize() != 5)
            return new Tuple("invalid hand", -1);

        int[] faceCount = new int[FACES.length()];
        long straight = 0, flush = 0;
        for (Card card : hand.getCards()) {

            int face = FACES.indexOf(card.getRank());
            if (face == -1)
                return new Tuple("invalid hand", -1);
            straight |= (1 << face);

            faceCount[face]++;

            int suit = SUITS.indexOf(card.getSuit());
            if (suit == -1)
                return new Tuple("invalid hand", -1);
            flush |= (1 << card.getSuit().charAt(0));
        }

        // shift the bit pattern to the right as far as possible
        while (straight % 2 == 0)
            straight >>= 1;

        // straight is 00011111; A-2-3-4-5 is 1111000000001
        boolean hasStraight = straight == 0b11111 || straight == 0b1111000000001;

        // unsets right-most 1-bit, which may be the only one set
        boolean hasFlush = (flush & (flush - 1)) == 0;

        if (hasStraight && hasFlush)
            return new Tuple<>("straight-flush", 9);

        int total = 0;
        for (int count : faceCount) {
            if (count == 4)
                return new Tuple("four-of-a-kind", 8);
            if (count == 3)
                total += 3;
            else if (count == 2)
                total += 2;
        }

        if (total == 5)
            return new Tuple("full-house", 7);

        if (hasFlush)
            return new Tuple("flush", 6);

        if (hasStraight)
            return new Tuple("straight", 5);

        if (total == 3)
            return new Tuple("three-of-a-kind", 4);

        if (total == 4)
            return new Tuple("two-pair", 3);

        if (total == 2)
            return new Tuple("one-pair", 2);

        return new Tuple("high-card", 1);
    }

    private static class Score {
        final int weight;
        final String name;
        final Hand hand;

        Score(String n, int w, Hand h) {
            weight = w;
            name = n;
            hand = h;
        }

        @Override
        public String toString() {
            return hand.toString() + " " + name;
        }
    }
}
