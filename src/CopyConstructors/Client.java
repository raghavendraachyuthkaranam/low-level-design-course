package CopyConstructors;

public class Client {

    public static void main(String[] args) {

        // Rahul's Exam
        Exam exam = new Exam(1, "Pre-Joining Test", 70);

        // Rahul Student
        Student rahul = new Student(1, "Rahul", 25, exam);

        // Shared Batch
        Batch batch = new Batch(101, "Feb26 Java Backend", "Intermediate");

        rahul.setBatch(batch);

        System.out.println("===== Rahul =====");
        rahul.displayInfo();

        // Copy Rahul -> Amit
        Student amit = new Student("Amit", rahul);

        System.out.println("===== Amit After Copy =====");
        amit.displayInfo();

        // Change Batch
        batch.setType("Beginner");

        System.out.println("\nAfter changing Batch\n");

        System.out.println("Rahul");
        rahul.displayInfo();

        System.out.println("Amit");
        amit.displayInfo();

        // Change Amit's Exam
        amit.getEnrollmentExam().setScore(50);

        System.out.println("\nAfter changing Amit's Exam Score\n");

        System.out.println("Rahul");
        rahul.displayInfo();

        System.out.println("Amit");
        amit.displayInfo();
    }
}

/*
Batch is shallow copied: Both Rahul and Amit reference the same Batch object, so changing the batch type to "Beginner" is visible to both.
Exam is deep copied: Rahul and Amit each have their own Exam object.
Both start with the same score (70) because the copy constructor copies the values, but after changing Amit's score to 50, Rahul's score remains 70. This independence is the hallmark of a deep copy.

One sentence to remember for interviews
Shallow Copy = Share the same object.
Deep Copy = Create a new object, but copy the same data into it.

The key word is object, not values. The values start out the same;
what differs is that the objects are independent,
so changing one doesn't affect the other.

Shallow copy means sharing the same referenced object. Deep copy means creating a new referenced object.
In my example, Batch is shallow copied because many students can belong to the same batch,
while Exam is deep copied because each student should have their own exam record.
 */