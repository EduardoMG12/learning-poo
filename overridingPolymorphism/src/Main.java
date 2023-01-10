public class Main {
    public static void main(String[] args){ //Some examples
        var fish = new GoldenFish(19.6f,2,3, "Yellow");
        fish.releaseBubbles();
        fish.moveAround();
        var dog = new Dog(23.5f,3,4,"brown");
        dog.getFurColor();
        dog.makeSound();
        var turtle = new Turtle(2.5f,1,4,"green");
        turtle.moveAround();



    }
}