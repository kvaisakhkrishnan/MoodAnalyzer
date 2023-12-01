import java.util.*;
public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Sentence to Analyze: ");
        String sentence = scanner.nextLine();
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(sentence);
        try{
            String mood = moodAnalyzer.analyzeMood();
            System.out.println("Analyzed Mood is: " + mood);
        }
        catch(Exception err){
            System.out.println(err.getMessage());
        }
    }
}
