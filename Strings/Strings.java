package Strings.src;

import java.util.Scanner;

import java.util.*;

class Strings {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String string1 = input.nextLine();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter a word:");
        String string2 = input2.nextLine();

        System.out.println("\n" + "Length of first string: " + string1.length() + "\n");
        System.out.println("Length of second string: " + string2.length() + "\n");

        System.out.println("The word entered is a substring of the first string: " + string1.toLowerCase().contains(string2.toLowerCase()) + "\n");
        System.out.println("The string starts with the letter 'a' (ignore case): " + (string1.toLowerCase().contains("a")) + "\n");
        System.out.println("The string ends with the text \"DCI\" (case sensitve): " + (string1.contains("DCI")) + "\n");
        System.out.println("The word contains the letters \"UST\" (case sensitve): " + (string2.contains("UST")) + "\n");
        System.out.print("The string starts and ends with the same character (case sensitive): ");
        char firstLetter = string1.charAt(0);
        char lastLetter = string1.charAt(string1.length() - 1);
        if (firstLetter == lastLetter)
            System.out.print("true" + "\n\n");
        else
            System.out.print("false" + "\n\n");

        System.out.println("The string and word are the same (case sensitive): " + (string1.equals(string2)) + "\n");
        System.out.println("The string and word are the same (case sensitive): " + (string1.equalsIgnoreCase(string2)) + "\n");

            input.close();
            input2.close();
    }
}
