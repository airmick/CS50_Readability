package io.airmick.js;

public class Readability implements ReadableInterface{
    private int count_letters;
    private int count_words;
    private int count_sentences;

    public Readability()
    {

    }

    public Readability(int count_letters, int count_words, int count_sentences)
    {
        this.count_letters = count_letters;
        this.count_words = count_words;
        this.count_sentences = count_sentences;
    }

    @Override
    public int count_letters(String input)
    {
        int count = 0;
        char[] convert = input.toCharArray();
        for (int i = 0, len = input.length(); i < len; i++)
        {
            if (Character.isLetter(convert[i]))
            {
                count ++;
            }
        }
        return count;
    }

    @Override
    public int count_words(String input)
    {
        int count = 0;
        char[] convert = input.toCharArray();
        for (int i = 0, len = input.length(); i < len; i++)
        {
            if (!(Character.isWhitespace(convert[i])))
            {
                while (!(Character.isWhitespace(convert[i])) && i < len)
                {
                    i++;
                }
                count++;
            }
        }
        return count;
    }

    @Override
    public int count_sentences(String input)
    {
        return 1;
    }
}
