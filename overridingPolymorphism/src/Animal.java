public abstract class Animal {
    private float weight;
    private int age;
    private int members;
    public abstract void moveAround();
    public abstract void eating();
    public abstract void makeSound();

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    public float getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public int getMembers() {
        return members;
    }
}
