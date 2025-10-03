package model;

public class Question {
    private final String text;
    private final String[] options;
    private final int correctIndex;

    public Question(String text, String[] options, int correctIndex) {
        this.text = text;
        this.options = options;
        this.correctIndex = correctIndex;
    }

    public String getText() { return text; }
    public String[] getOptions() { return options; }
    public boolean isCorrect(int choice) { return choice == correctIndex; }
    public String getCorrectAnswer() { return options[correctIndex]; }
}
