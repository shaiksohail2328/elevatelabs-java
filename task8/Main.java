import model.Question;
import service.QuizEngine;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Question> questions = List.of(
            new Question("Which language is used for Android development?",
                new String[]{"Swift", "Kotlin", "Ruby", "Go"}, 1),
            new Question("What does HTTP stand for?",
                new String[]{"HyperText Transfer Protocol", "High Tech Transfer Protocol", "Hyper Terminal Text Protocol", "None"}, 0),
            new Question("Which planet has the most moons?",
                new String[]{"Earth", "Mars", "Jupiter", "Saturn"}, 3),
            new Question("Who painted the Mona Lisa?",
                new String[]{"Van Gogh", "Picasso", "Da Vinci", "Rembrandt"}, 2),
            new Question("What is the square root of 144?",
                new String[]{"10", "12", "14", "16"}, 1)
        );

        new QuizEngine(questions).startQuiz();
    }
}
