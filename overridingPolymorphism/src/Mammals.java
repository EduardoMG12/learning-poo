public class Mammals extends Animal{
private String furColor;

    public Mammals(float weight, int age, int members, String furColor) {
        super(weight, age, members);
        setFurColor(furColor);
    }

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
    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }
}
