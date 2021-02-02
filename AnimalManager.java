package Zoo.manager;


public class AnimalManager {

    private int NumberOfLegs;
    private int diet;
    private String color;
    private String name;
    private int age;

    public int getNumberOfLegs() {
        return NumberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        NumberOfLegs = numberOfLegs;
    }

    public int getDiet() {
        return diet;
    }

    public void setDiet(int diet) {
        this.diet = diet;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
}
