package com.pokergame.shuffling;

import com.pokergame.model.Card;

import java.util.List;

/**
 * Represents a shuffle algorithm for a list of cards.
 * This is an interface that can be implemented by different types of shuffle algorithms.
 */
public interface ShuffleAlgorithm {

    /**
     * Shuffles the given list of cards.
     *
     * @param cards the list of cards to be shuffled
     */
    void shuffle(List<Card> cards);
}
