package com.pokergame.game;

import com.pokergame.model.Card;
import com.pokergame.model.Deck;
import com.pokergame.model.Player;

import java.util.List;

public class Game {
    private java.util.List<Player> players;
    private boolean gameEnded;
    private PokerVariant pokerVariant;
    private Deck deck;

    public Game(PokerVariant pokerVariant) {
        this.pokerVariant = pokerVariant;
        this.players = new java.util.ArrayList<>();
        this.gameEnded = false;
        this.deck = new Deck();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void startGame() {
        deck.shuffle();
        dealInitialCards();
    }

    public String determineWinner() {
        pokerVariant.evaluateHands(players);

        String winner = "";
        String winningHand = "";
        int score = 0;
        for (Player player : players) {
            if (player.getScore().y > score) {
                winner = player.getName();
                score = player.getScore().y;
                winningHand = player.getScore().x;
            }
        }
        return winner + " wins with " + winningHand;
    }

    public void endGame() {
        for (Player player : players) {
            player.clearHand();
        }
        this.gameEnded = true;
    }

    public boolean isOver() {
        return this.gameEnded;
    }

    private void dealInitialCards() {
        // The number of cards dealt may vary based on the poker variant
        for (Player player : players) {
            for (int i = 0; i < pokerVariant.getInitialCardsPerPlayer(); i++) {
                Card card = deck.dealCard();
                player.addCardToHand(card);
            }
        }
    }
}
