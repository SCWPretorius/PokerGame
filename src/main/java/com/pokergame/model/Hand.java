package com.pokergame.model;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public void clear() {
        cards.clear();
    }

    public int getSize() {
        return cards.size();
    }

    public List<Card> getCards() {
        return cards;
    }

    public boolean containsCard(Card card) {
        return cards.contains(card);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Card card : cards) {
            sb.append(card).append(" ");
        }
        return sb.toString().trim();
    }

//    @Override
//    public String toString() {
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("Your hand: ");
//        if (getSize() > 0) {
//            for (Card card : cards) {
//                // change card letters to corresponding pips
//                stringBuilder.append(card.getSuit().replaceAll("C", "♣")
//                        .replaceAll("D", "♦")
//                        .replaceAll("H", "♥")
//                        .replaceAll("S", "♠")
//                        .replaceAll("T", "10")).append(" ");
//            }
//        } else {
//            stringBuilder.append("Not enough com.poker.cards");
//        }
//        stringBuilder.append("\nYou have: ").append(name);
//        return stringBuilder.toString();
//    }
}
