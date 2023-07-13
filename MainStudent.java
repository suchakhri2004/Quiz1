public class MainStudent {
    public static void main(String[] args) {
        Student student = new Student(65022892, "Boss", 2023, 3.35);

        student.showDetails();

        student.setAdmissionYear(2024);

        student.setName("Boss");

        student.setGPA(4.0);

        student.showDetails();
    }
}