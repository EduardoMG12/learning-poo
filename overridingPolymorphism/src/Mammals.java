public class Mammals extends Animal{
private String furColor;

    @Override
    public void moveAround() {
        System.out.println("walking");
    }

    @Override
    public void eating() {
        System.out.println("drinking milk");
    }

    @Override
    public void makeSound() {
        System.out.println("mammals sound");
    }
}
