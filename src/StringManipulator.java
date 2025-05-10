/********************************************************
 * String Manipulator                                   *
 * This program prompts the user to enter the name of   *
 * their favorite city, and then displays the number    *
 * of characters, the name in uppercase, lowercase,     *
 * and the first character of the city name.            *
 ********************************************************/

import java.util.Scanner;

public class StringManipulator {

    /********************************************************
     * Main Method                                          *
     * Prompts the user for their favorite city, performs   *
     * string manipulations, and displays the results.      *
     ********************************************************/
    public static void main(String[] args) {

        //***********************************************
        // Variable Declarations                        *
        // To store user input and manipulated strings  *
        //***********************************************
        String favoriteCity;         // Holds the name of the user's favorite city

        //***********************************************
        // Input Section                                *
        // Prompting the user to enter their favorite   *
        // city name                                    *
        //***********************************************
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter the name of your favorite city: ");
        favoriteCity = keyboardInput.nextLine();

        //***********************************************
        // Calculation Section                          *
        // Perform string manipulations                 *
        //***********************************************
        int cityLength = favoriteCity.length();            // Get the number of characters
        String cityUppercase = favoriteCity.toUpperCase(); // Convert to uppercase
        String cityLowercase = favoriteCity.toLowerCase(); // Convert to lowercase
        char firstCharacter = favoriteCity.charAt(0);      // Get the first character

        //***********************************************
        // Output Section                               *
        // Display the results                          *
        //***********************************************
        System.out.println();
        System.out.println("Number of characters: " + cityLength);
        System.out.println("City name in uppercase: " + cityUppercase);
        System.out.println("City name in lowercase: " + cityLowercase);
        System.out.println("First character of the city name: " + firstCharacter);

        //***********************************************
        // Developer Credit                             *
        //***********************************************
        System.out.println("\nDeveloped by: Nikita Baiborodov");

        //***********************************************
        // Resource Cleanup                             *
        // Close the scanner to prevent resource leaks  *
        //***********************************************
        keyboardInput.close();
        System.exit(0);
    }
}
