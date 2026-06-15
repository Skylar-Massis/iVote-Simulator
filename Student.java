import java.util.ArrayList;
import java.util.List;
class Student implements Voter {

    private int UniqueID;
    private List<Boolean> voteList = new ArrayList<>();
    private static List<Integer> IDList = new ArrayList<>();

@Override
    public void setUniqueID(int newID){
        UniqueID = newID;
        IDList.add(UniqueID);
    }

@Override
    public int getUniqueID(){
        return UniqueID;
    }
    //Setter and Getter for UniqueID

@Override
    public void addVote(boolean vote){
        voteList.add(vote);
    }

@Override
    public List<Boolean> getVoteList(){
        return voteList;
    }

@Override
    public void setVote(int index, boolean newVote){
        voteList.set(index, newVote);
    }

//Setter and Getter for voteList and a function that adds a vote to the voteList array.
}
