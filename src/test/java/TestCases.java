import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCases {
    @Test
    public void testSadMood(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String analyzedMood = moodAnalyzer.analyzeMood("I am in Sad Mood");
        assertEquals("SAD", analyzedMood);
    }

    @Test
    public void testHappyMood(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String analyzedMood = moodAnalyzer.analyzeMood("I am in Any Mood");
        assertEquals("HAPPY", analyzedMood);
    }
}
