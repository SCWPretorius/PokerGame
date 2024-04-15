package com.pokergame.model;

public class Player {
    private String name;
    private Hand hand;
    private Tuple<String, Integer> score;

    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
        this.score = new Tuple<>("", 0);
    }

    public String getName() {
        return name;
    }

    public Hand getHand() {
        return hand;
    }

    public void addCardToHand(Card card) {
        hand.addCard(card);
    }

    public void clearHand() {
        hand.clear();
    }

    public void setScore(Tuple score) {
        this.score = score;
    }

    public Tuple<String, Integer> getScore() {
        return score;
    }
}
