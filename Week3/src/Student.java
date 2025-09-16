import java.util.Arrays;

public class Student {
    private String name;
    private int studentID;
    private String[] courses;

    public Student() {
        System.out.println("Creating a new empty Student.");
    }

    public Student(String name, int ID, String[] c) {
        this.name = name;
        this.studentID = ID;
        this.courses = c;
        System.arraycopy(c, 0, this.courses, 0, c.length);
    }

    public void printName() {
        System.out.println(this.name);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getStudentID() {
        return this.studentID;
    }

    public void setStudentID(int newStudentID) {
        this.studentID = newStudentID;
    }

    public void addCourse(String courseToAdd) {
        String[] newCourses = new String[this.courses.length + 1];
//        System.arraycopy(this.courses, 0, newCourses, 0, this.courses.length);

        for (int i = 0; i < this.courses.length ; i++) {
            newCourses[i] = this.courses[i];
        }

        newCourses[newCourses.length - 1] = courseToAdd;
        this.courses = newCourses;
    }

    public String toString() {
        return String.format("Name[%s] ID[%d]", this.name, this.studentID);
    }

    public static void main (String[] args) {

        String[] myCourses = {"COMP250", "COMP206", "COMP273", "MATH235"};
        Student s1 = new Student("Jo", 123456789, myCourses);
        System.out.println(Arrays.toString(s1.courses));

        s1.addCourse("MATH242");

        myCourses[0] = "";

        System.out.println(Arrays.toString(s1.courses));
        System.out.println(Arrays.toString(myCourses));
        System.out.println(s1.toString());
    }
}
