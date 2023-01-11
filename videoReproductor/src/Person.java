public abstract class Person {
    protected String name;
    protected int age;
    protected char sex;
    protected double experience;

    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.experience = 0;
    }

    public void gainExperience(double exp){
        setExperience(getExperience() + exp);
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    public double getExperience() {
        return experience;
    }
}
