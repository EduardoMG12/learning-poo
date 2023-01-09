public class Fish extends Animal {
    private String scaleColor;

    public Fish(float weight, int age, int members) {
        super(weight, age, members);
    }

    @Override
    public void moveAround() {
        System.out.println("swimming");
    }

    @Override
    public void eating() {
        System.out.println("eating things that fish eat");
    }

    @Override
    public void makeSound() {
        System.out.println("fish don't make sounds");
    }
public void releaseBubbles(){
    System.out.println("releasing Bubbles");

}
    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }

    public String getScaleColor() {
        return scaleColor;
    }
}
