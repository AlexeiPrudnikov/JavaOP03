import java.util.ArrayList;
import java.util.Iterator;

public class Nurse implements Speaker {
    private ArrayList<Student> students = new ArrayList<>();

    public Nurse(ArrayList<Student> students) {
        this.students = students;
    }
    public Nurse() {
        this.students = students;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }


    private void checkIllStudents() {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().isIllness()) {
                iterator.remove();
            }
        }
    }

    public void addStudent(Student student) {
        checkIllStudents();
        if (student.isIllness() && !students.contains(student)) {
            students.add(student);
        }
    }

    @Override
    public void goToCheckup(ArrayList<Student> students) {
        checkIllStudents();
        for (Student student : students) {
            if (student.isIllness()) {
                System.out.println(student.getName() + " беги на медосмотр!");
            }
        }
    }
}
