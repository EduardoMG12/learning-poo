public class Bird extends Animal{
    private String featherColor;
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
}
