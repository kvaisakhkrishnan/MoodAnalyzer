public class MoodAnalyzer {
    public String analyzeMood(String sentence){
        String[] words = sentence.trim().split("\\s+");
        int mood = 1;
        for(String word : words){
            if(word.equalsIgnoreCase("sad")){
                mood = 2;
                break;
            }
        }
        if(mood == 1){
            return "HAPPY";
        }
        else{
            return "SAD";
        }
    }
}
