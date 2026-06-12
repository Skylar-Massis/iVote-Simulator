import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class SimluationDriver{

public void main(String[] args) {
Question q = new Question();
generateQuestion(q);
generateStudents(q);

}

List<Student> studentList = new ArrayList<>();




public void generateStudents(Question q){
for (int i = 0; i < randomNumber(5, 100); i++){
    Student s = new Student();
    s.setUniqueID(randomNumber(1000, 10000));
    studentList.add(s);
    if(q.getIsMultiChoice() == true){
    for (int g = 0; i < q.getCandidates().size(); g++){     //multiple choice questions
        s.setVote(g, randomBoolean());
        }
    }
    //prepareVotes(s);
}
}

public void generateQuestion(Question q){

q.setCandidates(randomNumber(0, 25));
q.questionType(randomBoolean());
}

public void prepareVotes(Voter s){
VotingService v = new VotingService();
v.acceptVotes(s);
}


public boolean randomBoolean(){
        Random random = new Random();
        boolean randomBool = random.nextBoolean();
        return randomBool;
}

public int randomNumber(int start, int end){
    Random random = new Random();
    int number = random.nextInt((end - start) + 1 ) + start;
    return number;
}
}
