public class Dog extends Wolf{
    public Dog(float weight, int age, int members, String furColor) {
        super(weight, age, members, furColor);
    }
//examples polymorphism overload
   public void react(String speaks){
        if(speaks == "positive"){
            this.waggingTail();
        }else this.growl();
   }

   public void react(int hour){
        if (hour < 20 && hour > 8){
            this.waggingTail();
        }else this.growl();
   }

   public void react(boolean owner){
        if (owner){
            this.waggingTail();
        }else this.growl();
   }

   public void react(){
        if (getAge() < 5  ){
            if (getWeight() < 10) this.waggingTail();
            else this.makeSound();
        }else System.out.println("ignore");

   }
}
