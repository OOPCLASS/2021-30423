import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * Create a StudentRegistry which holds an array of Student(s). Initialize the array
 * with at least 10 instances (random values for the attributes). Every student
 * could have one or more Course(s) which he/she attends. For each Course we should
 * store the name, creditsNumber and an array of roomNumbers
 *
 * 1. Try to read student info from a file students.txt
 * 2. Try to read courses info from a file courses.txt
 * 3. Add a method in StudentRegistry which adds a Student to the array inside StudentRegistry
 */

public class Main {
    public static void main(String[] args) throws IOException {
        Student[] students = new Student[15];

        Student student0 = new Student("Iacobone", "Nicolo'", "012");
        Student student1 = new Student("Loconsole", "Christian", "018");
        Student student2 = new Student("Chieppa", "Giovanni", "022");
        Student student3 = new Student("Bottalico", "Alessio", "077");
        Student student4 = new Student("Galimberti", "Marco", "039");
        Student student5 = new Student("Rutigliano", "Sonia", "011");
        Student student6 = new Student("Tesser", "Lucilla", "013");
        Student student7 = new Student("Spontella", "Giacoma", "055");
        Student student8 = new Student("De Nicolo", "Luisa", "043");
        Student student9 = new Student("Lutencu", "Ludmila", "090");
        Student student10 = new Student();
        Student student11 = new Student();
        Student student12 = new Student();
        Student student13 = new Student();
        Student student14 = new Student();

        Course course0 = new Course();
        Course course1 = new Course();
        Course course2 = new Course();

        Course[] allCourses = new Course[3];
        allCourses[0] = course0;
        allCourses[1] = course1;
        allCourses[2] = course2;

        students[0] = student0;
        students[1] = student1;
        students[2] = student2;
        students[3] = student3;
        students[4] = student4;
        students[5] = student5;
        students[6] = student6;
        students[7] = student7;
        students[8] = student8;
        students[9] = student9;
        students[10] = student10;
        students[11] = student11;
        students[12] = student12;
        students[13] = student13;
        students[14] = student14;

        StudentRegistry registry = new StudentRegistry(students, "reg_01");

        Path fileName = Path.of("resources/student-register.txt");
        List<String> fileContent = Files.readAllLines(fileName);

        int i = 10;
        for (String line : fileContent) {
            String[] lineWords = line.split(" ");
            String firstName = lineWords[0];
            String lastName = lineWords[1];
            String uniqueId = lineWords[2];
            students[i].setFirstName(firstName);
            students[i].setLastName(lastName);
            students[i].setUniqueIdentificationNumber(uniqueId);
            i++;
            //System.out.println(firstName + " " + lastName);
        }

        for(i=0; i < students.length; i++) {
            registry.setStudent(students[i]);
            System.out.println(students[i].getFullName());
        }

        registry.getArrayStudents();

        Path fileName1 = Path.of("resources/course-register.txt");
        List<String> fileContent1 = Files.readAllLines(fileName1);

        i = 0;
        for (String line : fileContent1) {
            String[] lineWords = line.split("\t");
            String courseName = lineWords[0];
            String creditNumber = lineWords[1];
            String roomName = lineWords[2];

            allCourses[i].setCourseName(courseName);
            allCourses[i].setCreditsNumber(Integer.valueOf(creditNumber));
            allCourses[i].setRoomName(roomName);

            System.out.println(allCourses[i].getCourseName() + " " + allCourses[i].getCreditsNumber() + " " + allCourses[i].getRoomNumbers());
            i++;
            //System.out.println(firstName + " " + lastName);
        }
    }
}
