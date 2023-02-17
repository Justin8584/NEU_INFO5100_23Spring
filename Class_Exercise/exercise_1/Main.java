public class Main {
    public static void main(String[] args) {
        Session session = new Session();

        // Populate session with 20 students
        for (int i = 1; i <= 10; i++) {
            String partEnroll = "part-time";
            double[] quizScores = { 7.8, 8.0, 9.0, 8.5, 9.5, 7.5, 8.0, 8.5, 9.0, 9.5, 7.0, 8.0, 10.0, 8.5, 9.5 };
            session.addStudent(new PartTimeStudent("Part_Stu" + i, partEnroll, quizScores));
        }
        for (int i = 1; i <= 10; i++) {
            String fullEnroll = "full-time";
            double[] quizScores = { 7.8, 8.0, 9.0, 8.5, 9.5, 7.5, 8.0, 8.5, 9.0, 9.5, 7.0, 8.0, 10.0, 8.5, 9.5 };
            double examScore1 = 85;
            double examScore2 = 90;
            session.addStudent(
                    new FullTimeStudent("Full_Stu" + i, fullEnroll, quizScores, examScore1, examScore2));
        }

        // Print output results.
        System.out.println("\nAverage Quiz Score for the Class: " + session.getAverageQuizScoreForClass());
        session.printQuizScoresAscendingOrder();
        session.printPartTimeStuNames();
        session.printFullTimeStuExamScores();
    }
}
