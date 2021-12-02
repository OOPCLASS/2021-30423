package ro.utcluj;

/**
Doesnt make sense to throw an exc. from main
checked - unchecked exceptions - you are being forced to treat it
equals - unchecked
ioexception - checked exc.
read stacktrace bottom up
try catch finally, or just try finally - always gets executed - ex: close stream after reading from file
 */
/**
 * Create the following classes:
 * --------------------
 * ro.utcluj.PrintingService
 * --------------------
 * - inkAmount: Double
 * - paperAmount: Integer
 * --------------------
 * + print(document: ro.utcluj.Document)
 * --------------------
 *
 * --------------------
 * ro.utcluj.Document
 * --------------------
 * - text: String
 * - numberOfPages: Integer
 * --------------------
 * --------------------
 *
 * Create 2 exceptions: ro.utcluj.OutOfInkException (unchecked) and ro.utcluj.OutOfPaperException (checked)
 * - print method consumes 0.001 * document.text.length * numberOfPages ink for each
 * document that's being printed
 * - print method consumes numberOfPages for each document that's being printed
 * - throw one of the exceptions depending on the situation
 */
public class Main {

    public static void main(String[] args) {
        /*try {
            String userInfo = getUserInfo("my-student-id");
        } catch (StudentNotFoundException e) {

        }
        // UTCN 1234
        // I couldn;t find


    private static String getUserInfo(String studentId){
            throw new StudentNotFoundException();
//    String facultyName = universityService.getFacultyNameByStudentId(studentId);
//    String regNo = officeService.getRegNoByStudentId(studentId);
//    return facultyName + " " + regNo;
//    return "123";
        */
            PrintingService myService = new PrintingService(12.2, 12);
            Document newDocument = new Document("Heyy you!!", 888);
            myService.print(newDocument);
        System.out.println("The amount of ink is: " + myService.getInkAmount());
        System.out.println("The amount of paper is: " + myService.getPaperAmount());
        Document newDocument2 = new Document("Heyy <3!!", 666);
        myService.print(newDocument2);
        System.out.println("The amount of ink is: " + myService.getInkAmount());
        System.out.println("The amount of paper is: " + myService.getPaperAmount());
        }
}
