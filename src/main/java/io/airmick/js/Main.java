package io.airmick.js;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        Readability rd = new Readability();
        System.out.print("Enter Text: ");
        String text = scanner.nextLine();

        int letters = rd.count_letters(text);
        int sentences = rd.count_sentences(text);
        int words = rd.count_words(text);
        int colemanIndexValue = rd.colemanIndex(letters, sentences, words);

        if (colemanIndexValue < 1)
        {
            System.out.println("Before Grade 1");
        }
        else if (colemanIndexValue >= 1 && colemanIndexValue < 16)
        {
            System.out.printf("Grade %d \n", colemanIndexValue);
        }
        else
        {
            System.out.println("Grade 16+");
        }
    }
}
