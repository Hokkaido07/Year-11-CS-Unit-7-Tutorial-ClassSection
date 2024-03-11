public class Student {

    private int Id = getNextID();
    private String firstName;
    private String lastName;
    private int age;
    private int yearLevel;
    private static int studentCount = 1;
    private static int nextId = 1;

    public Student(String firstName, String lastName, int age, int yearLevel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.yearLevel = yearLevel;
    }

    public int getId() {
        return Id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    private int getNextID(){
        return nextId++;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setYearLevel(int yearLevel){
        this.yearLevel = yearLevel;
    }

    public boolean equals(Student other) {
        if (other == null) {
            return false;
        }
        return this.Id == other.getId();
    }

    public String toString(){
        return "Student{id=" + Id + ", firstName='" + firstName + "', lastName='" + lastName + "', age=" + age +", yearLevel=" + yearLevel + "}";
    }
}




