import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class TestCases {
    @Test
    public void testSadMood(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        try{
            String analyzedMood = moodAnalyzer.analyzeMood();
            fail("Expected An Exception");
            assertEquals("HAPPY", analyzedMood);
        }
        catch(Exception err){
            System.out.println(err.getMessage());
        }

    }

    @Test
    public void testHappyMood(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Any Mood");
        try{
            String analyzedMood = moodAnalyzer.analyzeMood();
            assertEquals("HAPPY", analyzedMood);
        }
        catch(Exception err){
            System.out.println(err.getMessage());
        }
    }
}
