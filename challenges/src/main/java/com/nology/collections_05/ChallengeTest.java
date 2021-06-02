package com.nology.collections_05;

import com.nology.collections_05.Challenge;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChallengeTest {

    private Challenge challenge;
    private List<String> data;
    private List<Integer> data2;

    @BeforeEach
    void setUp() {
        challenge = new Challenge();
        data = new ArrayList<String>();
        data.add("Andy");
        data.add("Sam");
        data.add("Bex");
        data.add("Ollie");

        data2 = new ArrayList<Integer>();
        data2.add(3);
        data2.add(5);
        data2.add(10);
        data2.add(12);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void csvToList_validCsv_ReturnsList() {
        List<String> result = challenge.csvToList("Andy,Sam,Bex,Ollie");
        assertEquals(4, result.size());
        assertEquals("Andy", result.get(0));
        assertEquals("Sam", result.get(1));
        assertEquals("Bex", result.get(2));
        assertEquals("Ollie", result.get(3));
    }

    @Test
    public void getSlicedArray_ValidInputs_ReturnsSubList() {

        List<String> result = challenge.getSlicedArray(this.data, 1, 3);
        assertEquals("Sam", result.get(0));
        assertEquals("Ollie", result.get(2));
        assertEquals(3, result.size());
    }

    @Test
    public void getSlicedArray_InvalidInputs_ReturnsSubList() {

        List<String> result = challenge.getSlicedArray(this.data, 4, 6);
        assertEquals(0, result.size());
    }

    @Test
    public void swapElements_ValidInputs_ReturnsSwappedArray() {
        List<String> result = challenge.swapElements(this.data, 0, 3);
        assertEquals("Ollie", result.get(0));
        assertEquals("Andy", result.get(3));
        assertEquals(4, result.size());
    }

    @Test
    public void removeOddNumbers_ValidInput_ReturnsEvenNumbers() {
        List<Integer> result = challenge.removeOddNumbers(this.data2);
        assertEquals(2, result.size());
        assertEquals(12, result.get(1));
    }

    @Test
    public void getUniqueItems_ValidInput_ReturnsDistinctList() {
        this.data.add("Andy");
        this.data.add("Ollie");
        List<String> result = challenge.getUniqueItems(this.data);
        assertEquals(4, result.size());
        assertEquals("Andy", result.get(0));
        assertEquals("Sam", result.get(1));
        assertEquals("Bex", result.get(2));
        assertEquals("Ollie", result.get(3));
    }

    @Test
    public void getMorseTranslation_ValidLetter_ReturnsMorseTranslation() {
        int result = challenge.getBinaryTranslation('A');
        assertEquals(01100001, result);
        result = challenge.getBinaryTranslation('a');
        assertEquals(01100001, result);
        result = challenge.getBinaryTranslation('B');
        assertEquals(01100010, result);
        result = challenge.getBinaryTranslation('C');
        assertEquals(01100011, result);
        result = challenge.getBinaryTranslation('D');
        assertEquals(01100100, result);
        result = challenge.getBinaryTranslation('E');
        assertEquals(01100101, result);
    }

    @Test
    public void findItem_ValidArray_ReturnsIndexOfSearchItem() {
        ArrayList<Integer> testData = new ArrayList<Integer>();
        testData.add(3);
        testData.add(5);
        testData.add(10);
        testData.add(12);
        testData.add(20);
        testData.add(36);
        testData.add(72);

        int result = challenge.findItem(testData, 12);
        assertEquals(1, result);

        result = challenge.findItem(testData, 36);
        assertEquals(2, result);

        result = challenge.findItem(testData, 5);
        assertEquals(2, result);

        result = challenge.findItem(testData, 20);
        assertEquals(3, result);

        result = challenge.findItem(testData, 3);
        assertEquals(3, result);
    }
}
