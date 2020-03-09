package io.airmick.js;

public class Readability implements ReadableInterface{

    public Readability()
    {

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
                while (!(Character.isWhitespace(convert[i])) && i < len -1)
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
        int count = 0;
        for (int i = 0, len = input.length(); i < len; i++)
        {
            if (input.charAt(i) == '.' || input.charAt(i) == '?' || input.charAt(i) == '!')
            {
                count++;
            }
        }
        return count;
    }

    public int colemanIndex(int letter, int sentence, int word)
    {
        float L = (float)(letter * 100) / word;
        float S = (float)(sentence * 100) / word;
        float index = (float) ((0.0588 * L) - (0.296 * S) - 15.8);

        return Math.round(index);
    }
}
