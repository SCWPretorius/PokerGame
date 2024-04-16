package com.pokergame.game;

import com.pokergame.game.five_card_draw.FiveCardsVariant;
import com.pokergame.model.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    private Game game;
    private Player player;

    @BeforeEach
    void setUp() {
        game = new Game(new FiveCardsVariant());
        player = new Player("Test Player");
    }

    @Test
    void playerIsAddedToGame() {
        game.addPlayer(player);
        assertTrue(game.getPlayers().contains(player));
    }

    @Test
    void gameIsNotOverInitially() {
        assertFalse(game.isOver());
    }

    @Test
    void gameEndsCorrectly() {
        game.addPlayer(player);
        game.startGame();
        game.endGame();
        assertTrue(game.isOver());
    }

    @Test
    void gameShouldHaveNoPlayersInitially() {
        assertTrue(game.getPlayers().isEmpty());
    }

    @Test
    void gameShouldNotBeOverAfterStart() {
        game.startGame();
        assertFalse(game.isOver());
    }

    @Test
    void gameShouldBeOverAfterEnd() {
        game.endGame();
        assertTrue(game.isOver());
    }

    @Test
    void gameShouldClearPlayersHandsAfterEnd() {
        game.addPlayer(player);
        game.startGame();
        assertFalse(player.getHand().getCards().isEmpty());
        game.endGame();
        assertTrue(player.getHand().getCards().isEmpty());
    }

    @Test
    void gameShouldDetermineWinnerCorrectly() {
        game.addPlayer(player);
        game.startGame();
        // Assuming player has the highest score after start
        assertTrue(game.determineWinner().contains(player.getName()));
    }
}
