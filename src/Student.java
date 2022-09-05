public class Student implements Comparable {

    private String name;
    private int age;
    private boolean illness;

    public Student(String name, int age, boolean illness) {
        this.name = name;
        this.age = age;
        this.illness = illness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isIllness() {
        return illness;
    }

    public void setIllness(boolean illness) {
        this.illness = illness;
    }

    @Override
    public int compareTo(Object o) {
        Student student = (Student) o;
        return this.name.compareTo(student.getName());
    }

    @Override
    public boolean equals(Object obj) {
        Student student = (Student) obj;
        return this.getName().equals(student.getName()) && this.getAge() == student.getAge();
    }

    @Override
    public String toString() {
        return this.name + " -> " + this.age;
    }
}
