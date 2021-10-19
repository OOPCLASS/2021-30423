public class StudentRegistry {

    //Attributi
    public Student[] arrayStudents;
    public String studentId;
    private int pos = 0;

    //Costruttori
    public StudentRegistry() {System.out.println("Blank studentRegistry"); }
    public StudentRegistry(Student[] arrayStudents, String studentId) {
        this.arrayStudents = arrayStudents;
        this.studentId = studentId;
    }

    //Getter

    public String getStudentId() {
        return this.studentId;
    }
    public void getArrayStudents() {
        for (int i=0; i < arrayStudents.length; i++) {
            if (arrayStudents[i] != null) {
                System.out.println(arrayStudents[i].firstName + " " + arrayStudents[i].lastName);
            }
        }
    }

    //Setter
    
    public void setStudent(Student student){
        arrayStudents[pos] = student;
        pos++;
    }
}
