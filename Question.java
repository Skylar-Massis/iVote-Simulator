import java.util.ArrayList;
import java.util.List;

//I did not include a way to ask the question or add the candidate options since it wouldn't be automated

public class Question{
    private boolean isMultiChoice;
    private final List<String> candidates = new ArrayList<>();

    void questionType(boolean multiChoice){
        isMultiChoice = multiChoice;
    }
    boolean getIsMultiChoice(){
        return isMultiChoice;
    }
    //Getter and setter functions for isMultiChoice

    public void setCandidates(int numberOfAnswers) {
        for (int i = 0; i < numberOfAnswers; i++) {
            char letter = (char) ('A' + i);
            candidates.add(String.valueOf(letter));
        }
    }
    public List<String> getCandidates() {
    return candidates;
    }
    //Setter and getter functions for Candidates

    }
