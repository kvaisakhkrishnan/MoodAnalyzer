import java.util.*;
public class Driver {
    public static void main(String[] args) {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Sentence to Analyze: ");
        String sentence = scanner.nextLine();
        String mood = moodAnalyzer.analyzeMood(sentence);
        System.out.println("Analyzed Mood is: " + mood);
    }
}
