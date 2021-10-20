package Model;

public class Category {

    private String name;

    private Category(){
        System.out.println("I'm an empty category");
    }
    public Category(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
