package CopyConstructorStandupMeeting;

public class MeetingRoom {

    private String roomName;
    private String floor;

    public MeetingRoom(String roomName, String floor) {
        this.roomName = roomName;
        this.floor = floor;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public void displayRoom() {
        System.out.println("Room Name : " + roomName);
        System.out.println("Floor     : " + floor);
    }
}