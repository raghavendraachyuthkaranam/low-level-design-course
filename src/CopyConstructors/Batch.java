package CopyConstructors;

public class Batch {

    private int id;
    private String name;
    private String type;

    public Batch(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void displayBatch() {
        System.out.println("Batch Name : " + name);
        System.out.println("Batch Type : " + type);
    }
}