import java.io.Serializable;

public class StudentBean implements Serializable {
    private String name;
    private int rollNumber;
    public StudentBean() {}
    // Getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", rollNumber=" + rollNumber + "]";
    }
}