import java.util.Scanner;

public class game {

    public static void main(String[] args) {
        System.out.println("Welcome to Text Adventure Game!");

        // Call method to start the game
        startGame();
    }

    // Method to start the game
    public static void startGame() {
        System.out.println("You find yourself in a dense forest. The path splits into four directions. Which way will you choose?");
        System.out.println("1. Go left towards the mountains.");
        System.out.println("2. Go right towards the river.");
        System.out.println("3. Go straight into the cave.");
        System.out.println("4. Go back the way you came.");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        // Process player choice for the initial direction
        switch (choice) {
            case 1:
                System.out.println("You decide to go left towards the mountains.");
                exploreMountains();
                break;
            case 2:
                System.out.println("You decide to go right towards the river.");
                exploreRiver();
                break;
            case 3:
                System.out.println("You decide to go straight into the cave.");
                exploreCave();
                break;
            case 4:
                System.out.println("You decide to go back the way you came.");
                System.out.println("You find yourself back at the starting point.");
                // Call method to start the game again
                startGame();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                // Call method to display choices again
                startGame();
                break;
        }
    }

    // Method to explore the mountains
    public static void exploreMountains() {
        System.out.println("You start climbing the steep mountains, and after a grueling journey, you reach the summit.");
        System.out.println("At the top, you see a hidden cave entrance. What will you do?");
        System.out.println("1. Enter the cave.");
        System.out.println("2. Rest and regain strength.");
        System.out.println("3. Descend back down the mountains.");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        // Process player choice for exploring the mountains
        switch (choice) {
            case 1:
                System.out.println("You gather your courage and enter the dark cave.");
                exploreCave();
                break;
            case 2:
                System.out.println("You decide to rest and regain strength before continuing your journey.");
                System.out.println("You feel refreshed and ready for the next challenge.");
                exploreMountains();
                break;
            case 3:
                System.out.println("You decide to descend back down the mountains.");
                System.out.println("You find yourself back at the starting point.");
                // Call method to start the game again
                startGame();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                // Call method to display choices again
                exploreMountains();
                break;
        }
    }

    // Method to explore the river
    public static void exploreRiver() {
        System.out.println("You follow the river downstream and reach a small village.");
        System.out.println("The villagers tell you about a hidden treasure in a nearby cave. What will you do?");
        System.out.println("1. Go to the cave and search for the treasure.");
        System.out.println("2. Stay in the village and help the villagers.");
        System.out.println("3. Leave the village and continue your journey.");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        // Process player choice for exploring the river
        switch (choice) {
            case 1:
                System.out.println("You decide to go to the cave and search for the hidden treasure.");
                exploreCave();
                break;
            case 2:
                System.out.println("You decide to stay in the village and help the villagers.");
                System.out.println("The villagers are grateful for your assistance and reward you with a valuable artifact.");
                System.out.println("You can choose to keep the artifact or return it to the villagers. What will you do?");
                System.out.println("1. Keep the artifact.");
                System.out.println("2. Return the artifact to the villagers.");

                int artifactChoice = scanner.nextInt();

                // Process player choice for the artifact
                switch (artifactChoice) {
                    case 1:
                        System.out.println("You keep the artifact and feel a surge of power coursing through you.");
                        System.out.println("You become the ruler of the village and live a prosperous life.");
                        endGame();
                        break;
                    case 2:
                        System.out.println("You decide to return the artifact to the villagers, displaying selflessness.");
                        System.out.println("The villagers are grateful for your honesty and reward you with a generous gift.");
                        exploreRiver();
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        exploreRiver();
                        break;
                }
                break;
            case 3:
                System.out.println("You decide to leave the village and continue your journey.");
                System.out.println("You bid farewell to the villagers and set off on a new adventure.");
                exploreCave();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                exploreRiver();
                break;
        }
    }

    // Method to explore the cave
    public static void exploreCave() {
        System.out.println("You enter the dark cave and hear strange noises echoing through the walls.");
        System.out.println("What will you do?");
        System.out.println("1. Proceed further into the cave.");
        System.out.println("2. Retreat back outside.");
        System.out.println("3. Investigate the source of the noises.");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        // Process player choice for exploring the cave
        switch (choice) {
            case 1:
                System.out.println("You muster your courage and venture deeper into the cave.");
                System.out.println("As you progress, you encounter a fierce dragon guarding a hoard of treasure.");
                System.out.println("What will you do?");
                System.out.println("1. Fight the dragon and claim the treasure.");
                System.out.println("2. Try to sneak past the dragon and steal the treasure.");
                System.out.println("3. Negotiate with the dragon for a share of the treasure.");

                int dragonChoice = scanner.nextInt();

                // Process player choice for the dragon encounter
                switch (dragonChoice) {
                    case 1:
                        System.out.println("You decide to fight the dragon head-on, wielding your weapon with all your might.");
                        System.out.println("After a fierce battle, you manage to defeat the dragon and claim the treasure.");
                        System.out.println("With the treasure in hand, you become a legendary hero and live a life of luxury.");
                        endGame();
                        break;
                    case 2:
                        System.out.println("You decide to attempt to sneak past the dragon, moving carefully and quietly.");
                        System.out.println("Unfortunately, your attempt fails and the dragon spots you.");
                        System.out.println("The dragon unleashes its fiery breath and you are unable to escape.");
                        System.out.println("You meet a fiery end in the dragon's lair.");
                        endGame();
                        break;
                    case 3:
                        System.out.println("You decide to try to negotiate with the dragon, using your charisma and diplomacy.");
                        System.out.println("Miraculously, the dragon agrees to share the treasure with you.");
                        System.out.println("You leave the cave with a portion of the treasure and the dragon's respect.");
                        endGame();
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        exploreCave();
                        break;
                }
                break;
            case 2:
                System.out.println("You decide to retreat back outside, realizing the dangers of the cave.");
                exploreRiver();
                break;
            case 3:
                System.out.println("You decide to investigate the source of the noises, curious to know what awaits you.");
                System.out.println("As you approach the source, you find a group of friendly dwarves mining for precious gems.");
                System.out.println("The dwarves offer to share their findings with you. What will you do?");
                System.out.println("1. Accept the dwarves' offer and take some gems.");
                System.out.println("2. Decline the dwarves' offer and continue exploring the cave.");
                System.out.println("3. Offer to help the dwarves in exchange for a share of the gems.");

                int dwarvesChoice = scanner.nextInt();

                // Process player choice for the dwarves encounter
                switch (dwarvesChoice) {
                    case 1:
                        System.out.println("You decide to accept the dwarves' offer and take some gems.");
                        System.out.println("The dwarves are happy to share their findings with you, and you leave the cave with a handful of precious gems.");
                        endGame();
                        break;
                    case 2:
                        System.out.println("You decide to decline the dwarves' offer and continue exploring the cave.");
                        System.out.println("You venture deeper into the cave and encounter a treacherous trap that leads to your demise.");
                        endGame();
                        break;
                    case 3:
                        System.out.println("You decide to offer to help the dwarves in exchange for a share of the gems.");
                        System.out.println("The dwarves gladly accept your help and share a portion of their gems with you as a reward.");
                        endGame();
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        exploreCave();
                        break;
                }
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                exploreCave();
                break;
        }
    }

    // Method to end the game
    public static void endGame() {
        System.out.println("Congratulations! You have completed the game.");
        System.out.println("Thank you for playing Text Adventure Game.");
        System.out.println("Would you like to play again? (yes/no)");

        Scanner scanner = new Scanner(System.in);
        String playAgain = scanner.nextLine();

        if (playAgain.equalsIgnoreCase("yes")) {
            // Call method to start the game again
            startGame();
        } else if (playAgain.equalsIgnoreCase("no")) {
            System.out.println("Thank you for playing. Goodbye!");
        } else {
            System.out.println("Invalid input. Exiting game.");
        }
    }
}
