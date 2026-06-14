import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class SimluationDriver{

public void main(String[] args) {
    Question q = new Question();
    VotingService v = new VotingService();
    simulator(q, v);
}

//can use hashset to keep it unique
List<Student> studentList = new ArrayList<>();




public void simulator(Question q, VotingService v){
    generateQuestion(q);
    generateStudents(q, v);
    System.out.println("Total Number of Students: " + studentList.size());
    v.displayStatistics(q, studentList);
}
// There is an issue where there is 1 student who isn't voting.
public void generateStudents(Question q, VotingService v){
    for (int i = 0; i < randomNumber(10, 30); i++){
        Student s = new Student();
        s.setUniqueID(randomNumber(1000, 10000));
        studentList.add(s);
        if(q.getQuestionType() == true){
            for (int g = 0; g < q.getCandidates().size(); g++){     //multiple choice questions
            s.setVote(randomBoolean());
        }
        prepareVotes(s, v, q);
        }else{
            for (int g = 0; g < q.getCandidates().size(); g++){  
            s.setVote(false);
            }s.changeVote(randomNumber(0, q.getCandidates().size() - 1), true);
             prepareVotes(s, v, q);
        }
}
}

public void generateQuestion(Question q){
    q.setCandidates(randomNumber(2, 6), randomNumber(0,2));
    q.setQuestionType(randomBoolean());
}

public void prepareVotes(Voter s, VotingService v, Question q){
    v.acceptVotes(s, q);
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
