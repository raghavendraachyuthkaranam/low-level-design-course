package CopyConstructors;

public class Exam {

    private int id;
    private String name;
    private int score;

    public Exam(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    // Copy Constructor
    public Exam(Exam other) {
        this.id = other.id;
        this.name = other.name;
        this.score = other.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void displayExam() {
        System.out.println("Exam Name  : " + name);
        System.out.println("Score      : " + score);
    }
}