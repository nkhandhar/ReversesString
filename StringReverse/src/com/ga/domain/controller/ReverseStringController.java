package com.ga.domain.controller;
/**
 * The Class ReverseStringController.
 * 
 * @author Nilay
 */
public class ReverseStringController {
    /**
     * The main method.
     * @param args the arguments
     */
    public static void main(String args[]) {
        String word = "Band";
        String reverse = reverse(word);
        System.out.printf(" original String : %s , reversed String %s %n", word, reverse);
    }
    /**
     * Reverse.
     * Reverse the character of given string
     * @param source the source
     * @return the string
     */
    public static String reverse(String source) {
        if (source == null || source.isEmpty()) {
            return source;
        }
        String reverse = "";
        for (int i = source.length() - 1; i >= 0; i--) {
            reverse = reverse + source.charAt(i);
        }
        return reverse;
    }
}
