import org.w3c.dom.ls.LSOutput;

public class Kangaroo extends Mammals{

    public Kangaroo(float weight, int age, int members, String furColor) {
        super(weight, age, members, furColor);
    }

    @Override
    public void moveAround() {
        System.out.println("bounce");
    }
    public void usePurse(){
        System.out.println("use purse");
    }
}
