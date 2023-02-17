public class Student {
    private String name;
    private String enrollStatus;
    private double[] quizScores;

    public Student(String name, String enrollStatus, double[] quizScores) {
        this.name = name;
        this.enrollStatus = enrollStatus;
        this.quizScores = quizScores;

    }

    public double getAverageQuizScore() {
        double sum = 0;
        for (double score : quizScores) {
            sum += score;
        }
        return sum / quizScores.length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnrollStatus() {
        return enrollStatus;
    }

    public void setEnrollStatus(String enrollStatus) {
        this.enrollStatus = enrollStatus;
    }

    public double[] getQuizScores() {
        return quizScores;
    }

}
