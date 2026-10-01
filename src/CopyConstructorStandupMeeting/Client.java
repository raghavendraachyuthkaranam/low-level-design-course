package CopyConstructorStandupMeeting;

public class Client {

    public static void main(String[] args) {

        // Rahul's personal notes
        MeetingNotes rahulNotes =
                new MeetingNotes("Fix Login Bug", "No Blockers");

        // Rahul joins the stand-up
        Employee rahul =
                new Employee("Rahul", rahulNotes);

        // Shared meeting room
        MeetingRoom room =
                new MeetingRoom("Conference Room A", "3rd Floor");

        rahul.setRoom(room);

        System.out.println("========== Rahul ==========");
        rahul.displayInfo();

        // Copy Rahul to Amit
        Employee amit = new Employee("Amit", rahul);

        System.out.println("========== Amit After Copy ==========");
        amit.displayInfo();

        // Change Meeting Room (Shared Object)
        room.setRoomName("Conference Room B");

        System.out.println("\nAfter changing Meeting Room\n");

        System.out.println("Rahul");
        rahul.displayInfo();

        System.out.println("Amit");
        amit.displayInfo();

        // Change only Amit's Notes (Deep Copy)
        amit.getNotes().setTask("Review Pull Requests");

        System.out.println("\nAfter changing Amit's Notes\n");

        System.out.println("Rahul");
        rahul.displayInfo();

        System.out.println("Amit");
        amit.displayInfo();
    }
}

/*
Interview Explanation

This example clearly demonstrates both concepts:

Shallow Copy (MeetingRoom):
Rahul and Amit attend the same daily stand-up in the same meeting room.
When the room changes from Conference Room A to Conference Room B, both employees see the
new room because they share the same MeetingRoom object.
Deep Copy (MeetingNotes):
Rahul and Amit each maintain their own meeting notes.
When Amit changes his task from "Fix Login Bug" to "Review Pull Requests",
Rahul's notes remain "Fix Login Bug" because the copy constructor creates a new MeetingNotes object for Amit.


*/