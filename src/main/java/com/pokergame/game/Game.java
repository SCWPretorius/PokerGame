package com.pokergame.game;

import com.pokergame.model.Player;

import java.util.List;

public class Game {
    private java.util.List<Player> players;
    private boolean gameEnded;

    public Game(PokerVariant pokerVariant) {
        this.players = new java.util.ArrayList<>();
        this.gameEnded = false;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void startGame() {
    }

    public void playRound() {
    }

    public void determineWinner() {
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
}
