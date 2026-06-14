import java.util.List;
interface Voter{

public void setUniqueID(int newID);
public int getUniqueID();
//Setter and Getter for ID

public void setVote(boolean vote);
public void changeVote(int index, boolean newVote);
public List<Boolean> getVoteList();
//Setter and Getter for voteList
}
