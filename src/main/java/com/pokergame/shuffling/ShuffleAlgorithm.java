package com.pokergame.shuffling;

import com.pokergame.model.Card;

import java.util.List;

public interface ShuffleAlgorithm {
    void shuffle(List<Card> cards);
}
