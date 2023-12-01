import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCases {
    @Test
    public void testSadMood(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String analyzedMood = moodAnalyzer.analyzeMood();
        assertEquals("HAPPY", analyzedMood);
    }

    @Test
    public void testHappyMood(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Any Mood");
        String analyzedMood = moodAnalyzer.analyzeMood();
        assertEquals("HAPPY", analyzedMood);
    }
}
