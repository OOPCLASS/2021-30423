//Each Course contains the name, creditsNumber and an array of roomNumbers.

public class Course {
    //Attributi
    public String courseName;
    public Integer creditsNumber;
    public String roomName;

    //Costruttori
    public Course() {/*System.out.println("Blank Course");*/}

    public Course(String courseName, Integer creditsNumber, Integer[] roomNumbers) {
        this.courseName = courseName;
        this.creditsNumber = creditsNumber;
        this.roomName = roomName;
    }

    //Getter
    public String getCourseName() { return this.courseName; }
    public Integer getCreditsNumber() { return this.creditsNumber; }
    public String getRoomNumbers() { return this.roomName; }
    
    //Setter
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public void setCreditsNumber(Integer creditsNumber){
        this.creditsNumber = creditsNumber;
    }
    public void setRoomName(String roomName){
        this.roomName = roomName;
    }
}
