package com.pokergame.shuffling;

import com.pokergame.model.Card;

import java.util.Collections;
import java.util.List;

public class BasicShuffleAlgorithm implements ShuffleAlgorithm {

    @Override
    public void shuffle(List<Card> cards) {
        Collections.shuffle(cards);
    }
}
