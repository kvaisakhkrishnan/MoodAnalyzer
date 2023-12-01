public class MoodAnalyzer {
    String message;
    public String analyzeMood(){
        System.out.println("Message Read");
        if(message == null){
            return "NA";
        }
        else{
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
    }

    public MoodAnalyzer(String sentence){
       this.message = sentence;
    }
    public MoodAnalyzer(){
        System.out.println("Sentence Should Be Read Seperately");
    }
}
