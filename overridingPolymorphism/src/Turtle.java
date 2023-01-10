public class Turtle extends Reptile{
    public Turtle(float weight, int age, int members, String scaleColor) {
        super(weight, age, members, scaleColor);
    }

    @Override
    public void moveAround(){
        System.out.println("walking very less");
    }
}
