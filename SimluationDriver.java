import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class SimluationDriver{
    
    // The student IDs are stored but not used in this program, it is only used for the .size() method.
    private List<Student> studentList = new ArrayList<>();

    public void main(String[] args) {
        simulationDriver();
    }

    public void simulationDriver(){
        Question q = new Question();
        VotingService v = new VotingService();
        generateQuestion(q);
        generateStudents(q, v);
        System.out.println("Total Number of Students: " + studentList.size());
        v.displayStatistics(q, studentList);
    }

    // This method will generate a random number of students
    // With those students it will set the IDs and add them to the studentList
    // it will then generate votes for those students and put them the votingService object.
    public void generateStudents(Question q, VotingService v){
        for (int i = 0; i < randomNumber(10, 20); i++){
            Student s = new Student();
            s.setUniqueID(randomNumber(100000, 1000000));
            studentList.add(s);
            if(q.getQuestionType() == true && q.getAnswerType() != 2){
                for (int g = 0; g < q.getCandidates().size(); g++){
                s.addVote(randomBoolean());
                }
            }
            else{
                for (int g = 0; g < q.getCandidates().size(); g++){  
                s.addVote(false);
                }
                s.setVote(randomNumber(0, q.getCandidates().size() - 1), true);
            }
            v.acceptVotes(s, q);
        }
    }

    // This method will generate a question with 2 to 6 possible answers
    public void generateQuestion(Question q){
        q.setCandidates(randomNumber(2, 6), randomNumber(0,2));
        q.setQuestionType(randomBoolean());
    }

    // These random methods are necessary for simulationDriver to give random results.
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
