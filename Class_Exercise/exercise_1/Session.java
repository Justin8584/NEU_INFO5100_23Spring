import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Session {
    private ArrayList<Student> studentLst;

    public Session() {
        studentLst = new ArrayList<Student>();
    }

    public void addStudent(Student student) {
        studentLst.add(student);
    }

    public void printQuizScoresAscendingOrder() {
        ArrayList<Double> allQuizScores = new ArrayList<>();
        for (Student student : studentLst) {
            for (double quizScore : student.getQuizScores()) {
                allQuizScores.add(quizScore);
            }
        }
        Collections.sort(allQuizScores);
        System.out.println("\nQuiz Scores in Ascending Order:");
        for (double quizScore : allQuizScores) {
            System.out.println(quizScore);
        }
    }

    public void printPartTimeStuNames() {
        System.out.println("\nPart-Time Student Names:");
        for (Student student : studentLst) {
            // if (student instanceof PartTimeStudent) {
            // System.out.println(student.getName());
            // }
            if (student.getEnrollStatus() == "part-time") {
                System.out.println(student.getName());
            }
        }
    }

    public void printFullTimeStuExamScores() {
        System.out.println("\nFull-Time Student Exam Scores:");
        for (Student student : studentLst) {
            if (student.getEnrollStatus() == "full-time") {
                FullTimeStudent fullTimeStu = (FullTimeStudent) student; // cast type
                System.out.println(fullTimeStu.getName() + ": " + fullTimeStu.getExamScore1() + ", "
                        + fullTimeStu.getExamScore2());
            }
        }
    }

    public double getAverageQuizScoreForClass() {
        double sum = 0;
        int count = 0;
        for (Student student : studentLst) {
            sum += student.getAverageQuizScore();
            count++;
        }
        return sum / count;
    }
}
