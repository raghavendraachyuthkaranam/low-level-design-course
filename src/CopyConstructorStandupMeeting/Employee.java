package CopyConstructorStandupMeeting;

public class Employee {
    private String name;

    // Shared Object (Shallow Copy)
    private MeetingRoom room;
    // Personal Object (Deep Copy)
    private MeetingNotes notes;

    public Employee(String name, MeetingNotes notes){
        this.name = name;
        this.notes = notes;
    }

    public Employee(String newName, Employee other){

        this.name = newName;
        // shallow copy
        this.room = other.room;
        // deep copy
        this.notes = new MeetingNotes(other.notes);
    }

    public void setRoom(MeetingRoom room){
        this.room = room;
    }

    public MeetingNotes getNotes(){
        return notes;
    }

    public  void displayInfo(){
        System.out.println("Employee: " + name);

        if(room!=null){
            room.displayRoom();
        }

        notes.displayNotes();
        System.out.println("-----------------");
    }
}
