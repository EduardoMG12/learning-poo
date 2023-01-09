public class Fish extends Animal {
    private String scaleColor;
    @Override
    public void moveAround() {

    }

    @Override
    public void eating() {

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
