package CopyConstructors;

public class Student {

    private int id;
    private String name;
    private int age;
    // batch object reference
    private Batch batch;
    // exam object reference
    private Exam enrollmentExam;

    public Student(int id, String name, int age, Exam exam) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.enrollmentExam = exam;
    }

    // Copy Constructor
    public Student(String newName, Student other) {

        this.id = other.id;
        this.name = newName;
        this.age = other.age;

        // shallow copy -> not creating a new object for batch reference
        // As many students can be assigned to the same batch object
        this.batch = other.batch;

        // below is deep copy
        // each student will be having different enrollment exam.
        // we should create a new obj of enrollmentExam and copy the information from other.
        this.enrollmentExam = new Exam(other.enrollmentExam);
    }

    public void setBatch(Batch batch) {
        this.batch = batch;
    }

    public Exam getEnrollmentExam() {
        return enrollmentExam;
    }

    public void displayInfo() {

        System.out.println("Student Name : " + name);
        System.out.println("Age          : " + age);

        if (batch != null) {
            batch.displayBatch();
        }

        enrollmentExam.displayExam();

        System.out.println("--------------------------------");
    }
}


// privates attributes or data members can only be accessed
// using setters and getters

// access modifiers -> public, private, protected, default