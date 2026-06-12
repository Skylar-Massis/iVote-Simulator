import java.util.ArrayList;
import java.util.List;
class Student implements Voter {

private int UniqueID;
private boolean[] voteList;
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
public void setVote(int i, boolean vote){
    voteList[i] = vote;
    System.out.println(vote);
    }

@Override
    public boolean[] getVoteList(){
        return voteList;
    }

    public boolean getVote(int i){
        return voteList[i];
    }
//Setter and Getter for voteList
}
