// Trying to implement something similar to a game controller in this file
// want to run it based on a while loop and when the user enters certain
// characters and enters then execute a command (exit, add todo, remove todo, etc.)

import java.util.Scanner; // Import the scanner library to get user input and set it to variables

public class TodoController {
    // Create a scanner object to be able to take in user input
    private Scanner sc = new Scanner(System.in);

    // Create function for intro
    public void intro() {
        System.out.println("Welcome to a Java Todo List App");
    }

    // Create function to prompt user for a command
    public void prompt() {
        System.out.println("Here are a list of commands:\n[a]dd todo\n[d]elete todo\n");

        // Use scanner to take in a char value
        // char command =


    }

    // Create functions to mimic commands for the TodoContainer
    // Possibly use switch statements to describe the command
}
