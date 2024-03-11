import java.util.ArrayList;

public class ClassSection {

    private String subject;
    private int capacity;
    private int yearLevel;
    private ArrayList<Student> student = new ArrayList<>();

    public ClassSection(String subject, int capacity, int yearLevel){
        this.subject = subject;
        this.capacity = capacity;
        this.yearLevel = yearLevel;
    }

    public String getSubject(){
        return subject;
    }

    public int getCapacity(){
        return capacity;
    }

    public int getYearLevel(){
        return yearLevel;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public void setYearLevel(int yearLevel){
        this.yearLevel = yearLevel;
    }

    public ArrayList<Student> getStudents() {
        return student;
    }

    public void addStudent(Student newStudent){
        if (newStudent.getYearLevel() == yearLevel && !isStudentEnrolled(newStudent) && student.size() < capacity) {
            student.add(newStudent);
        }
    }

    public void removeStudent(Student newStudent) {
        if (newStudent.getYearLevel() == yearLevel) {
                student.remove(newStudent);
        }
    }

    public boolean isStudentEnrolled(Student newStudent) {
        for (Student student : student) {
            if (student.getId() == newStudent.getId()) {
                return true;
            }
        }
        return false;
    }
    public String toString(){
        return "ClassSection{subject='"+ subject + "', capacity=" + capacity + ", yearLevel=" + yearLevel + ", students=" + student + "}";
    }

    
}
