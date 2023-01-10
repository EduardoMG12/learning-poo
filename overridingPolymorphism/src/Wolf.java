public class Wolf extends Animal{
    private String furColor;
    public Wolf(float weight, int age, int members, String furColor) {
        super(weight, age, members);
        setFurColor(furColor);
    }
    public void buryBone(){
        System.out.println("burying bone");
    }

    public void growl(){
        System.out.println("snarling");
    }
    public void waggingTail(){
        System.out.println("wagging the tail");
    }
    @Override
    public void moveAround() {
        System.out.println("to walk");
    }

    @Override
    public void eating() {
        System.out.println("Eating game meat");
    }

    @Override
    public void makeSound() {
        System.out.println("Auuuuuuuuuuuuuuuuuuuuu!");
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }
}
