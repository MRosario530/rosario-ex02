/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Miguel Rosario
 */
import java.util.*;
public class Solution02 {

    public static void main(String[] args) {
	/*
        print: What is the input string?
        'userInput' = read string from user
        print: 'userInput' has userInput.length characters.
	*/
        Scanner input = new Scanner(System.in);
        System.out.print("What is the input string? ");
        String userInput = input.nextLine();
        System.out.println(userInput + " has " + userInput.length() + " characters.");
    }

}
