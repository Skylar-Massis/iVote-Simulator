import java.util.ArrayList;
import java.util.List;

public class Question{
    private boolean questionType;
    private final List<String> candidates = new ArrayList<>();
    private int answerType;
    void setQuestionType(boolean multiChoice){
        questionType = multiChoice;
        if(multiChoice){
            System.out.println("Multiple Choice Question");
        } else{
            System.out.println("Single Choice Question");
        }
    }
    boolean getQuestionType(){
        return questionType;
    }
    //Setters and getters for QuestionType

    void setAnswerType(int answerType){
    this.answerType = answerType;
    }
    
    int getAnswerType(){
        return answerType;
    }
    //Setter and getters for answerType

   public void setCandidates(int numberOfAnswers, int answerType) {
    this.answerType = answerType;

    if(answerType == 0){
            for (int i = 0; i < numberOfAnswers; i++) {
                char letter = (char) ('A' + i);
                candidates.add(String.valueOf(letter));
}}  if (answerType == 1){
            for (int i = 0; i < numberOfAnswers; i++) {
                candidates.add(String.valueOf(i + 1));
}}  if (answerType == 2){
            candidates.add("False");
            candidates.add("True");
            questionType = false;
    }}
    public List<String> getCandidates() {
    return candidates;
    }
    //Setter and getter functions for Candidates

}
