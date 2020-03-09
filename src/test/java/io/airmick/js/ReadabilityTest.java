package io.airmick.js;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReadabilityTest {
    Readability readability;

    @Before
    public void setUp() throws Exception
    {
        readability = new Readability();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void count_lettersTest()
    {
        int count = readability.count_letters("abcdef    ad");
        Assert.assertEquals(8, count);
    }

    @Test
    public void count_wordsTest() {
        int count = readability.count_words("michael joel     kal");
        Assert.assertEquals(3, count);
    }

    @Test
    public void count_sentencesTest()
    {
        int cc = readability.count_sentences("Je suis tres content. Mais! je n'ai aucune idee.  m");
        Assert.assertEquals(3, cc);
    }

    @Test
    public void colemanIndexTest()
    {
        String str = "Harry Potter was a highly unusual boy in many ways. For one thing, he hated the summer holidays more than any other time of year. For another, he really wanted to do his homework, but was forced to do it in secret, in the dead of the night. And he also happened to be a wizard.";
        int a = readability.count_letters(str);
        int b = readability.count_sentences(str);
        int c = readability.count_words(str);
        long result = readability.colemanIndex(a, b, c);
        Assert.assertEquals(5, result);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(result);
    }
}