package service;

import model.Question;
import java.util.*;

public class QuizEngine {
    private final List<Question> questions;
    private int score = 0;
    private final Scanner scanner = new Scanner(System.in);

    public QuizEngine(List<Question> questions) {
        this.questions = new ArrayList<>(questions);
        Collections.shuffle(this.questions); // Randomize question order
    }

    public void startQuiz() {
        System.out.println("🧠 Welcome to the Ultimate Quiz Challenge!");
        System.out.println("⏱️ You have 10 seconds per question. Let's begin!\n");

        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            System.out.println("Q" + (i + 1) + ": " + q.getText());
            String[] opts = q.getOptions();
            for (int j = 0; j < opts.length; j++) {
                System.out.println("  " + (j + 1) + ". " + opts[j]);
            }

            long startTime = System.currentTimeMillis();
            System.out.print("Your answer (1-4): ");
            int choice = scanner.nextInt() - 1;
            long elapsed = (System.currentTimeMillis() - startTime) / 1000;

            if (elapsed > 10) {
                System.out.println("⏰ Time's up! No points awarded.\n");
                continue;
            }

            if (q.isCorrect(choice)) {
                System.out.println("✅ Correct!\n");
                score++;
            } else {
                System.out.println("❌ Incorrect. Correct answer: " + q.getCorrectAnswer() + "\n");
            }
        }

        showResults();
    }

    private void showResults() {
        System.out.println("🏁 Quiz Completed!");
        System.out.println("📊 Final Score: " + score + "/" + questions.size());

        if (score == questions.size()) {
            System.out.println("🌟 Perfect! You're a genius!");
        } else if (score >= questions.size() * 0.7) {
            System.out.println("👍 Great job! You're quiz-savvy.");
        } else {
            System.out.println("📚 Keep practicing. Knowledge is power!");
        }
    }
}
