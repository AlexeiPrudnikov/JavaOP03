public class Main {
    public static void main(String[] args) {
        Nurse nurse = new Nurse();
        nurse.addStudent(new Student("Иванов", 8, true));
        nurse.addStudent(new Student("Петров", 10, false));
        nurse.addStudent(new Student("Сидоров", 12, true));
        nurse.addStudent(new Student("Чапаев", 20, false));
        nurse.addStudent(new Student("Баранов", 15, true));
        nurse.goToCheckup(nurse.getStudents());
        System.out.println("-----------");
        ComparatorByAge comparatorByAge = new ComparatorByAge();
        nurse.getStudents().sort(comparatorByAge);
        for (Student student : nurse.getStudents()) {
            System.out.println(student);
        }
        System.out.println("-----------");
        ComparatorByName comparatorByName = new ComparatorByName();
        nurse.getStudents().sort(comparatorByName);
        for (Student student : nurse.getStudents()) {
            System.out.println(student);
        }
        System.out.println("-----------");
        nurse.addStudent(new Student("Ложкин", 13, true));
        nurse.addStudent(new Student("Поварежкин", 7, true));
        nurse.addStudent(new Student("Столов", 15, false));
        nurse.addStudent(new Student("Стулов", 10, true));
        nurse.addStudent(new Student("Стулов", 10, true));
        nurse.addStudent(new Student("Романов", 11, true));
        nurse.addStudent(new Student("Быков", 17, false));
        nurse.getStudents().sort(comparatorByAge);
        for (Student student : nurse.getStudents()) {
            System.out.println(student);
        }
        System.out.println("-----------");
        nurse.getStudents().sort(comparatorByName);
        for (Student student : nurse.getStudents()) {
            System.out.println(student);
        }
        System.out.println("-----------");
        nurse.goToCheckup(nurse.getStudents());
    }
}