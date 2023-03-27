import java.util.regex.*;

public class Ex4 {  // regular expression

    public static void main(String[] args) {

        String subject1 = "hello world";
        String subject2 = "1234";
        String subject3 = "abc123";
        String subject4 = "email@example.com";
        String subject5 = "www.google.com";

        // Pattern 1: match any word that starts with the letter 'h'
        Pattern pattern1 = Pattern.compile("\\bh\\w+");
        Matcher matcher1 = pattern1.matcher(subject1);
        System.out.println("Pattern 1: " + matcher1.find()); // positive case
        Matcher matcher1Neg = pattern1.matcher(subject2);
        System.out.println("Pattern 1 Negative: " + matcher1Neg.find()); // negative case

        // Pattern 2: match any string that consists of 4 digits
        Pattern pattern2 = Pattern.compile("\\d{4}");
        Matcher matcher2 = pattern2.matcher(subject2);
        System.out.println("Pattern 2: " + matcher2.find()); // positive case
        Matcher matcher2Neg = pattern2.matcher(subject1);
        System.out.println("Pattern 2 Negative: " + matcher2Neg.find()); // negative case

        // Pattern 3: match any string that starts with letters and followed by digits
        Pattern pattern3 = Pattern.compile("[a-zA-Z]+\\d+");
        Matcher matcher3 = pattern3.matcher(subject3);
        System.out.println("Pattern 3: " + matcher3.find()); // positive case
        Matcher matcher3Neg = pattern3.matcher(subject1);
        System.out.println("Pattern 3 Negative: " + matcher3Neg.find()); // negative case

        // Pattern 4: match any email address
        Pattern pattern4 = Pattern.compile("\\b[\\w.%-]+@[\\w.-]+\\.[a-zA-Z]{2,4}\\b");
        Matcher matcher4 = pattern4.matcher(subject4);
        System.out.println("Pattern 4: " + matcher4.find()); // positive case
        Matcher matcher4Neg = pattern4.matcher(subject1);
        System.out.println("Pattern 4 Negative: " + matcher4Neg.find()); // negative case

        // Pattern 5: match any URL
        Pattern pattern5 = Pattern.compile("^(http|https)://([\\w-]+\\.)+[\\w-]+(/[\\w-./?%&=]*)?$");
        Matcher matcher5 = pattern5.matcher(subject5);
        System.out.println("Pattern 5: " + matcher5.find()); // positive case
        Matcher matcher5Neg = pattern5.matcher(subject1);
        System.out.println("Pattern 5 Negative: " + matcher5Neg.find()); // negative case

    }
}


