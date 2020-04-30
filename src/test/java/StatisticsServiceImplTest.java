import javafx.util.Pair;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StatisticsServiceImplTest {

    private StatisticsService classToTest = new StatisticsServiceImpl();

    @Test(expected = IllegalArgumentException.class)
    public void givenNullSentence_whenGetLongestWord_thenThrowException() {
        classToTest.getLongestWord(null);
    }

    @Test
    public void givenEmptySentence_whenGetLongestWord_thenReturnEmptyString() {
        Pair<String, Integer> result = classToTest.getLongestWord("");

        assertEquals(new Pair<>("", 0), result);
    }

    @Test
    public void givenSentenceWithMultipleSpacesOnly_whenGetLongestWord_thenReturnEmptyString() {
        Pair<String, Integer> result = classToTest.getLongestWord("   ");

        assertEquals(new Pair<>("", 0), result);
    }

    @Test
    public void givenSentenceWithOneWord_whenGetLongestWord_thenReturnWord() {
        Pair<String, Integer> result = classToTest.getLongestWord("Wow!");

        assertEquals(new Pair<>("Wow", 3), result);
    }

    @Test
    public void givenSentenceWithTwoWordsOfDifferentLengths_whenGetLongestWord_thenReturnLongerWord() {
        Pair<String, Integer> result = classToTest.getLongestWord("I'm happy.");

        assertEquals(new Pair<>("happy", 5), result);
    }

    @Test
    public void givenSentenceWithTwoWordsOfSameLength_whenGetLongestWord_thenReturnFirstWord() {
        Pair<String, Integer> result = classToTest.getLongestWord("Stay safe...");

        assertEquals(new Pair<>("Stay", 4), result);
    }

    @Test
    public void givenSentenceWithMultipleWordsOfDifferentLengths_whenGetLongestWord_thenReturnLongestWord() {
        Pair<String, Integer> result = classToTest.getLongestWord("The cow jumped over the moon");

        assertEquals(new Pair<>("jumped", 6), result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenNullSentence_whenGetShortestWord_thenThrowException() {
        classToTest.getShortestWord(null);
    }

    @Test
    public void givenEmptySentence_whenGetShortestWord_thenReturnEmptyString() {
        Pair<String, Integer> result = classToTest.getShortestWord("");

        assertEquals(new Pair<>("", 0), result);
    }

    @Test
    public void givenSentenceWithMultipleSpacesOnly_whenGetShortestWord_thenReturnEmptyString() {
        Pair<String, Integer> result = classToTest.getShortestWord("   ");

        assertEquals(new Pair<>("", 0), result);
    }

    @Test
    public void givenSentenceWithOneWord_whenGetShortestWord_thenReturnWord() {
        Pair<String, Integer> result = classToTest.getShortestWord("Wow!");

        assertEquals(new Pair<>("Wow", 3), result);
    }

    @Test
    public void givenSentenceWithTwoWordsOfDifferentLengths_whenGetShortestWord_thenReturnShorterWord() {
        Pair<String, Integer> result = classToTest.getShortestWord("I'm happy.");

        assertEquals(new Pair<>("Im", 2), result);
    }

    @Test
    public void givenSentenceWithTwoWordsOfSameLength_whenGetShortestWord_thenReturnFirstWord() {
        Pair<String, Integer> result = classToTest.getShortestWord("Stay safe...");

        assertEquals(new Pair<>("Stay", 4), result);
    }

    @Test
    public void givenSentenceWithMultipleWordsOfDifferentLengths_whenGetShortestWord_thenReturnShortestWord() {
        Pair<String, Integer> result = classToTest.getShortestWord("The cow jumped over the moon");

        assertEquals(new Pair<>("The", 3), result);
    }

}