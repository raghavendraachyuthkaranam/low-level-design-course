package CopyConstructorStandupMeeting;

public class MeetingNotes {

    private String task;
    private String blocker;

    public MeetingNotes(String task, String blocker) {
        this.task = task;
        this.blocker = blocker;
    }

    // Copy Constructor (Deep Copy)
    public MeetingNotes(MeetingNotes other) {
        this.task = other.task;
        this.blocker = other.blocker;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void displayNotes() {
        System.out.println("Task     : " + task);
        System.out.println("Blocker  : " + blocker);
    }
}