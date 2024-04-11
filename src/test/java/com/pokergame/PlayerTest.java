package com.pokergame;

import com.pokergame.model.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PlayerTest {
    @Test
    void testPlayerCreation() {
        Player player = new Player("John");
        Assertions.assertEquals("John", player.getName());
    }
}
