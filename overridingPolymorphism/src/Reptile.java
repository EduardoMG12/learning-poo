public class Reptile extends Animal{
    private String scaleColor;
    @Override
    public void moveAround() {
        System.out.println("crawling");
    }

    @Override
    public void eating() {
        System.out.println("eating eggs");
    }

    @Override
    public void makeSound() {
        System.out.println("reptile sound");
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }

    public String getScaleColor() {
        return scaleColor;
    }
}
