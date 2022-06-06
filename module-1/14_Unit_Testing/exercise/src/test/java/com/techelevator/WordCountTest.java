package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class WordCountTest {
    WordCount wordCount;

    @Before
    public void setUp() {
        wordCount = new WordCount();
    }

    @Test
    public void return_map_of_strings_and_counts() {
        //Arrange
        Map<String, Integer> expected = new HashMap<>();
        String[] words = new String[]{"ba", "ba", "black", "sheep"};
        expected.put("ba", 2);
        expected.put("black", 1);
        expected.put("sheep", 1);

        //Assert
        Assert.assertEquals(expected, wordCount.getCount(words));
    }

    @Test
    public void return_correct_count_when_out_of_order() {
        //Arrange
        Map<String, Integer> expected = new HashMap<>();
        String[] words = new String[]{"ba", "black" ,"sheep", "sheep", "ba"};
        expected.put("ba", 2);
        expected.put("black", 1);
        expected.put("sheep", 2);

        //Assert
        Assert.assertEquals(expected, wordCount.getCount(words));
    }

    @Test
    public void null_array() {
        //Arrange
        Map<String, Integer> expected = new HashMap<>();
        String[] words = new String[]{null,null,null};
        expected.put(null, 3);

        //Assert
        Assert.assertEquals(expected, wordCount.getCount(words));
    }

    @Test
    public void empty_array() {
        //Arrange
        Map<String, Integer> expected = new HashMap<>();
        String[] words = new String[]{};

        //Assert
        Assert.assertEquals(expected, wordCount.getCount(words));
    }
}
