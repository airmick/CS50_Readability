package io.airmick.js;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReadabilityTest {
    Readability readability;

    @Before
    public void setUp() throws Exception {
        readability = new Readability();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void count_letters()
    {
        int count = readability.count_letters("abcdef    ad");
        Assert.assertEquals(8, count);
    }

    @Test
    public void count_words() {
        int count = readability.count_words("michael els james everyLong");
        Assert.assertEquals(4, count);
    }

    @Test
    public void count_sentences() {
    }
}