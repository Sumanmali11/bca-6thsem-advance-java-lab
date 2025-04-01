public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(1);
        student.setName("Alice");
        student.setAge(22);

        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
    }
}
