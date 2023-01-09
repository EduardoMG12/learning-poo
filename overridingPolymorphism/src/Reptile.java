public class Reptile extends Animal{
    private String scaleColor;

    public Reptile(float weight, int age, int members) {
        super(weight, age, members);
    }

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
