public class FullTimeStudent extends Student {

    private double examScore1;
    private double examScore2;

    public FullTimeStudent(String name, String enrollStatus, double[] quizScores, double examScore1,
            double examScore2) {

        super(name, enrollStatus, quizScores);
        this.examScore1 = examScore1;
        this.examScore2 = examScore2;
    }

    public double getExamScore1() {
        return examScore1;
    }

    public void setExamScore1(double examScore1) {
        this.examScore1 = examScore1;
    }

    public double getExamScore2() {
        return examScore2;
    }

    public void setExamScore2(double examScore2) {
        this.examScore2 = examScore2;
    }
}