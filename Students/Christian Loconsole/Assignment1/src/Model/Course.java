package Model;

public class Course {
    public String nameOfTheCourse;
    public Integer creditsNumber;
    public Integer[] arrayOfRoomNumbers;

    public Course(){
        System.out.println("I'm a blank course");
    }

    public Course(String nameOfTheCourse,Integer creditsNumber,Integer[] arrayOfRoomNumbers){
        this.nameOfTheCourse = nameOfTheCourse;
        this.creditsNumber = creditsNumber;
        this. arrayOfRoomNumbers =  arrayOfRoomNumbers;
    }

    public String getNameOfTheCourse() {
        return nameOfTheCourse;
    }

    public Integer getCreditsNumber() {
        return creditsNumber;
    }

    public Integer[] getArrayOfRoomNumbers() {
        return arrayOfRoomNumbers;
    }
}
