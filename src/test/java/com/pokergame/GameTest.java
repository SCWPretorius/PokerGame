package com.pokergame;

import com.pokergame.game.five_card_draw.FiveCardsVariant;
import com.pokergame.game.Game;
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
}
