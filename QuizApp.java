import java.util.*;

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] questions = {
            {"What is the capital of India?", "A) Delhi", "B) Mumbai", "C) Kolkata", "D) Chennai", "A"},
            {"Which planet is known as the Red Planet?", "A) Earth", "B) Venus", "C) Mars", "D) Jupiter", "C"},
            {"Who wrote 'Romeo and Juliet'?", "A) Dickens", "B) Shakespeare", "C) Tagore", "D) Tolkien", "B"},
            {"Java is developed by?", "A) Google", "B) Microsoft", "C) Sun Microsystems", "D) Apple", "C"}
        };

        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQuestion " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                System.out.println(questions[i][j]);
            }

            System.out.print("Your answer: ");
            String answer = sc.nextLine().toUpperCase();

            if (answer.equals(questions[i][5])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Correct answer: " + questions[i][5]);
            }
        }

        System.out.println("\nYour Final Score: " + score + " out of " + questions.length);
        sc.close();
    }
}
