class VotingService{
public static int[] storeVotes;
    public void acceptVotes(Voter personalVotes){
    storeVotes = new int[personalVotes.getVoteList().length];
    for(int i = 0; i < personalVotes.getVoteList().length; i++){
        if(personalVotes.getVoteList()[i] == true){
        storeVotes[i] = storeVotes[i] + 1;
    }
    }
    }

    public void displayStatistics(Question q){
    System.out.print("Total Number of Students: " + q.getCandidates().size());
    for (int i = 0; i < q.getCandidates().size(); i++){
    System.out.println((char) ('A' + i) + ": " + storeVotes[i]);
    }
    }
