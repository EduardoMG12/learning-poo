public class Bird extends Animal{
    private String featherColor;

    public Bird(float weight, int age, int members, String featherColor) {
        super(weight, age, members);
        setFeatherColor(featherColor);
    }

    @Override
    public void moveAround() {
        System.out.println("flying");
    }

    @Override
    public void eating() {
        System.out.println("eating grains");
    }

    @Override
    public void makeSound() {
        System.out.println("chirp");
    }
    public void makingNest(){
        System.out.println("building nest");
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    public String getFeatherColor() {
        return featherColor;
    }
}
