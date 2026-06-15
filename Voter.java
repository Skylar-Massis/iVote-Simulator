import java.util.List;

// I made this interface because it suited the way I was designing the students class.
// Methods that use student as a parameter can use voter as well now.
interface Voter{
    public void setUniqueID(int newID);
    public int getUniqueID();
    //Setter and Getter for ID

    public void addVote(boolean vote);
    public void setVote(int index, boolean newVote);
    public List<Boolean> getVoteList();
    //Setter and Getter and function to add to voteList
}
