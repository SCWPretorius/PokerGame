package com.pokergame.shuffling;

import com.pokergame.model.Card;

import java.util.Collections;
import java.util.List;

/**
 * Represents a basic shuffle algorithm for a list of cards.
 * This class implements the ShuffleAlgorithm interface.
 */
public class BasicShuffleAlgorithm implements ShuffleAlgorithm {

    /**
     * Shuffles the given list of cards.
     *
     * @param cards the list of cards to be shuffled
     */
    @Override
    public void shuffle(List<Card> cards) {
        Collections.shuffle(cards);
    }
}
