
import java.util.ArrayList;
import java.util.List;

class VotingService{
    private List<Integer> storeVotes = new ArrayList<>();

    public void acceptVotes(Voter personalVotes, Question q){
    for(int i = 0; i < q.getCandidates().size(); i++){
        if(personalVotes.getVoteList().get(i) && storeVotes.size() > i){
        storeVotes.set(i, storeVotes.get(i) + 1);
    }
       else if(storeVotes.size() < q.getCandidates().size()){
        storeVotes.add(0);
    }}
    }

    public void displayStatistics(Question q, List<Student> studentList){
    if(q.getAnswerType() == 0){
    for (int i = 0; i < storeVotes.size(); i++){
    System.out.println((char) ('A' +  i) + ": " + storeVotes.get(i) + " Votes");
    }}else if(q.getAnswerType() == 1){
    for (int i = 0; i < storeVotes.size(); i++){
    System.out.println((i + 1) + "." + storeVotes.get(i) + " Votes");
    }}else if(q.getAnswerType() == 2){
    System.out.println("False: " + storeVotes.get(0) + " Votes");
    System.out.println("True: " + storeVotes.get(1) + " Votes");
    }

}
}


