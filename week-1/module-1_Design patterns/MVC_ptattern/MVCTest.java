public class MVCTest {

    public static void main(String[] args) {

        Student student = new Student("Anjani", 101, "A");

        StudentView view = new StudentView();

        StudentController controller =
                new StudentController(student, view);

        System.out.println("Original Student Record");
        controller.updateView();

        controller.setStudentName("Padmanjani");
        controller.setStudentGrade("A+");

        System.out.println("\nUpdated Student Record");
        controller.updateView();

    }

}