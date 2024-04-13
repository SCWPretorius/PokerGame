package com.pokergame;

import com.pokergame.game.BadugiPokerVariant;
import com.pokergame.game.FiveCardsVariant;
import com.pokergame.game.Game;
import com.pokergame.game.PokerVariant;
import com.pokergame.model.Player;

import java.util.Scanner;

public class PokerGameApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Poker Game!");

        // Choose the poker variant
        PokerVariant pokerVariant = choosePokerVariant(scanner);

        // Create a new game with the chosen variant
        Game game = new Game(pokerVariant);

        // Get the number of players
        int numPlayers = getNumPlayers(scanner, pokerVariant);

        // Create and add players to the game
        for (int i = 1; i <= numPlayers; i++) {
            System.out.print("Enter the name of player " + i + ": ");
            String playerName = scanner.nextLine();
            System.out.print("Enter the initial chips for player " + i + ": ");
            scanner.nextLine(); // Consume the newline character

            Player player = new Player(playerName);
            game.addPlayer(player);
        }

        // Start the game
        game.startGame();

        // Play rounds until the game is over
        while (!game.isOver()) {
            game.playRound();
        }

        // Determine the winner and distribute the pot
        game.determineWinner();

        // End the game
        game.endGame();

        System.out.println("Thank you for playing!");
    }

    private static PokerVariant choosePokerVariant(Scanner scanner) {
        System.out.println("Choose the poker variant:");
        System.out.println("1. Five Cards");
        System.out.println("2. Badugi");
        // Add more poker variants here

        System.out.print("Enter your choice (1-2): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (choice) {
            case 1:
                return  new FiveCardsVariant();
            case 2:
                return new BadugiPokerVariant();
            // Add more cases for other poker variants
            default:
                System.out.println("Invalid choice. Defaulting to Five Cards.");
                return new FiveCardsVariant();
        }
    }

    private static int getNumPlayers(Scanner scanner, PokerVariant pokerVariant) {
        int minPlayers = pokerVariant.getMinimumPlayers();
        int maxPlayers = pokerVariant.getMaximumPlayers();

        System.out.print("Enter the number of players (" + minPlayers + "-" + maxPlayers + "): ");
        int numPlayers = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        while (numPlayers < minPlayers || numPlayers > maxPlayers) {
            System.out.print("Invalid number of players. Please enter a number between " + minPlayers + " and " + maxPlayers + ": ");
            numPlayers = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
        }

        return numPlayers;
    }
}
