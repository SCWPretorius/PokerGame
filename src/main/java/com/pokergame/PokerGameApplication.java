package com.pokergame;

import com.pokergame.game.badugi_poker_variant.BadugiPokerVariant;
import com.pokergame.game.five_card_draw.FiveCardsVariant;
import com.pokergame.game.Game;
import com.pokergame.game.PokerVariant;
import com.pokergame.model.Player;

import java.util.Scanner;

public class PokerGameApplication {

    public static void main(String[] args) {
        try {
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

                Player player = new Player(playerName);
                game.addPlayer(player);
            }

            // Start the game
            game.startGame();

            // Determine the winner
            System.out.println(game.determineWinner());

            // End the game
            game.endGame();

            System.out.println("Thank you for playing!");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static PokerVariant choosePokerVariant(Scanner scanner) {
        try {
            System.out.println("Choose the poker variant:");
            System.out.println("1. Five Cards");
            System.out.println("2. Badugi");
            // Add more poker variants here

            System.out.print("Enter your choice (1-2): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            return switch (choice) {
                case 1 -> new FiveCardsVariant();
                case 2 -> new BadugiPokerVariant();
                // Add more cases for other poker variants
                default -> {
                    System.out.println("Invalid choice. Defaulting to Five Cards.");
                    yield new FiveCardsVariant();
                }
            };
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
            return new FiveCardsVariant();
        }
    }

    private static int getNumPlayers(Scanner scanner, PokerVariant pokerVariant) {
        try {
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
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
            return 2;
        }
    }
}
