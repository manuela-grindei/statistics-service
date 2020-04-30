import javafx.util.Pair;

public interface StatisticsService {
    Pair<String, Integer> getLongestWord(String s);

    Pair<String, Integer> getShortestWord(String s);
}
