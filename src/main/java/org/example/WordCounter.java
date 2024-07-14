package org.example;

///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           WordCounter
// Course:          CS200 Spring 2023
//
// Author:
// Email:
// Lecturer's Name: jimw
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
//
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

import java.util.Random;
import java.util.ArrayList;


/**
 * Contains methods for calculating grades.
 *
 * @author
 */
public class WordCounter {

    /**
     * This method adds a randomly selected word from the WORD_ARRAY array
     * in the org.example.Config file to the end of the given ArrayList
     * if either parameter is null this simply returns.
     *
     * @param wordList the ArrayList of words to add the randomly selected word to
     * @param rand     the Random object used to generate the random index
     *                 for selecting the word from the word array
     */
    public static void addWord(ArrayList<String> wordList, Random rand) {
        // TODO: complete this method
    }

    /**
     * This method finds the most frequently occurring word
     * in the ArrayList. If there is a tie, return the first occurred word
     * in the order based on the WORD_ARRAY array.
     *
     * @param wordList an ArrayList representing a list of words to search for
     * @return a String representing the most frequently occurring word in the list,
     *         or "none" if the list is empty or null
     */
    public static String findMostOccurringWord(ArrayList<String> wordList) {
        // TODO: complete this method
        return null;
    }

    /**
     * This method finds  the least frequently occurring word
     * in the ArrayList. If there is a tie, return the first occurred word
     * in the order based on the WORD_ARRAY array.
     *
     * @param wordList the ArrayList of words to be searched from
     * @return a String representing the least frequently occurring word in the list,
     *         or "none" if the list is null or empty.
     */
    public static String findLeastOccurringWord(ArrayList<String> wordList) {
        // TODO: complete this method
        return null;
    }

    /**
     * This method what percentage of words in the ArrayList are the given word
     * E.g.:
     * if wordList = ["one", "two", "three", "four", "five"]
     * and word = "two"
     * the return value should be 20.0 (because 1 / 5 = 20%)
     *
     * Note: The return value should include decimals.
     * Make sure to use double division instead of integer division.
     *
     * @param wordList the ArrayList of all words
     * @param word     a specific word to count
     * @return a percentage in the range of [0.0, 100.0]; or -1 if the ArrayList is
     *         null or empty.
     */
    public static double calcPercentageOccur(ArrayList<String> wordList, String word) {
        // TODO: complete this method
        return 0;
    }

    /**
     * This method finds out all the elements in the ArrayList that are a certain
     * word,
     * and stores their indices from that list into a new ArrayList, which is then
     * returned.
     *
     * @param wordList   the ArrayList of all words
     * @param wordToFind a specific word to be found in the ArrayList
     * @return an ArrayList of found indices in ascending order; or null if wordList
     *         is null
     */
    public static ArrayList<Integer> findSpecificWordIndice(ArrayList<String> wordList,
                                                            String wordToFind) {
        // TODO: complete this method
        return null;
    }

    /**
     * Main method calls implemented methods to fil an ArrayList with random words,
     * run statistical analysis on this list, and print the results.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<String>();
        Random rand = new Random(Config.SEED);
        for (int i = 0; i < Config.NUM_WORDS; i++)
            addWord(wordList, rand);

        String mode = findMostOccurringWord(wordList);
        System.out.println("The most frequent word is: " + mode);

        String min = findLeastOccurringWord(wordList);
        System.out.println("The least frequent word is: " + min);

        double successRate = calcPercentageOccur(wordList, "three");
        System.out.println("The percentage of 'three' occurrences is: " + successRate + "%");

        ArrayList<Integer> studentIndices = findSpecificWordIndice(wordList, "two");
        System.out.println("Here are the indices where 'two' is: " + studentIndices);

    }
}
