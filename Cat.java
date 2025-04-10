public class Cat {

    // fields or properties
    String breed;
    String gender;
    String color;
    String eyeColor;
    int age;

    // Constructors
    Cat(String breed, String gender, String color, int age, String eyeColor) {
        this.breed = breed;
        this.gender = gender;
        this.color = color;
        this.age = age;
        this.eyeColor = eyeColor;
    }
    Cat(){}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
}
