public class MoodAnalyzer {
    String message;
    public String analyzeMood() throws MoodAnalysisException{
        if(message != null){
            System.out.println("Message Read");
            String[] words = this.message.trim().split("\\s+");
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
        else{
            throw new MoodAnalysisException();
        }
    }

    public MoodAnalyzer(String sentence){
       this.message = sentence;
    }
    public MoodAnalyzer(){
        System.out.println("Sentence Should Be Read Seperately");
    }
}
