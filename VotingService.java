import java.util.ArrayList;
import java.util.List;

class VotingService{
    private List<Integer> storeVotes = new ArrayList<>();

    // This function traverses the list of candidates.
    // First if makes space in the storeVotes Arraylist.
    // Second if stores votes into storeVotes if there is a positive vote.
    // I used voter instead of student because it should be able to work with any voter.
    public void acceptVotes(Voter studentVotes, Question q){
        for(int i = 0; i < q.getCandidates().size(); i++){
            if(storeVotes.size() < q.getCandidates().size()){
                storeVotes.add(0);
            }if(studentVotes.getVoteList().get(i)){
                storeVotes.set(i, storeVotes.get(i) + 1);
            }
        }
    }

    // This function will display the statistic based on the way the answers are formatted.
    // I chose to do this because it's pretty simple to modify and I think it's easy to add on to.
    public void displayStatistics(Question q, List studentList){
        if(q.getAnswerType() == 0){
            for (int i = 0; i < storeVotes.size(); i++){
                System.out.println((char) ('A' +  i) + ":  " + storeVotes.get(i) + " Votes");
            }
        }else if(q.getAnswerType() == 1){
            for (int i = 0; i < storeVotes.size(); i++){
                System.out.println((i + 1) + ":  " + storeVotes.get(i) + " Votes");
            }
        }else if(q.getAnswerType() == 2){
            System.out.println("False:  " + storeVotes.get(0) + " Votes");
            System.out.println("True:   " + storeVotes.get(1) + " Votes");
        }
    }
}
