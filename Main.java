public class Main {

    public static void main(String[] args) {

        Cat torrada = new Cat("Domestic", "Male", "Orange", 3, "Green");

        Cat turtle = new Cat();

        torrada.setColor("Blue");

        turtle.setColor("Green");
        turtle.setAge(100);

        System.out.println("Torrada color is " + torrada.getColor());
        System.out.println("Turtle is " + turtle.getColor() + " and he is " + turtle.getAge());
        System.out.println("Turtle breed is " + turtle.getBreed());
    }

}



