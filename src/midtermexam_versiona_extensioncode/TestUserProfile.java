/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author kunal
 */
import java.util.Scanner;

/**
 * Class to test the creation of a user profile.
 */
public class TestUserProfile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the User Profile Creation!");
        System.out.print("Enter your name: ");
        String userName = sc.nextLine();

        System.out.println("Choose your favorite genre:");
        displayGenres();
        int genreChoice = sc.nextInt();
        sc.nextLine(); // Consume the remaining newline character

        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        String favoriteGenre = genres[genreChoice - 1];

        UserProfile userProfile = new UserProfile(userName, favoriteGenre);

        System.out.println("User Profile Created:");
        System.out.println("User ID: " + userProfile.getUserID());
        System.out.println("Favorite Genre: " + userProfile.getGenre());
    }

    /**
     * Displays the list of possible genres.
     */
    private static void displayGenres() {
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }
    }
}
