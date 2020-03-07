package io.airmick.js;

public class Readability {
    private int count_letters;
    private int count_words;
    private int count_sentences;

    public Readability(int count_letters, int count_words, int count_sentences)
    {
        this.count_letters = count_letters;
        this.count_words = count_words;
        this.count_sentences = count_sentences;
    }

    public int getCount_letters()
    {
        return count_letters;
    }

    public void setCount_letters(int count_letters)
    {
        this.count_letters = count_letters;
    }

    public int getCount_words()
    {
        return count_words;
    }

    public void setCount_words(int count_words)
    {
        this.count_words = count_words;
    }

    public int getCount_sentences()
    {
        return count_sentences;
    }

    public void setCount_sentences(int count_sentences)
    {
        this.count_sentences = count_sentences;
    }
}
