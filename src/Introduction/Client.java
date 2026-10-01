package Introduction;

public class Client {
    public static void main(String[] args) {


        System.out.println("Hello World!");

        Student student = new Student();
        student.id = 1;
        student.name = "Ram";
        student.age = 25;
        student.gradYear = 2021;

        student.printDetails();

        Student st2 = student;

        st2.gradYear = 2022;
        st2.name = "Nandan";

        st2.printDetails();
        student.printDetails();
    }
}
