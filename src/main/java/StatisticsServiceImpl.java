import javafx.util.Pair;

import java.util.Arrays;
import java.util.Comparator;

public class StatisticsServiceImpl implements StatisticsService {

    @Override
    public Pair<String, Integer> getLongestWord(String sentence) {
        if (sentence == null) {
            throw new IllegalArgumentException("The sentence cannot be null");
        }
        String longestWord = Arrays.stream(sentence.replaceAll("\\p{P}", "").split("\\s+")).max(Comparator.comparingInt(String::length)).orElse("");
        return new Pair<>(longestWord, longestWord.length());
    }

    @Override
    public Pair<String, Integer> getShortestWord(String sentence) {
        if (sentence == null) {
            throw new IllegalArgumentException("The sentence cannot be null");
        }
        String shortestWord = Arrays.stream(sentence.replaceAll("\\p{P}", "").split("\\s+")).min(Comparator.comparingInt(String::length)).orElse("");
        return new Pair<>(shortestWord, shortestWord.length());
    }
}
