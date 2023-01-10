public class Dog extends Mammals{
    public Dog(float weight, int age, int members, String furColor) {
        super(weight, age, members, furColor);
    }
    public void buryBone(){
        System.out.println("burying bone");
    }
   public void waggingTail(){
       System.out.println("wagging the tail");
   }
}
