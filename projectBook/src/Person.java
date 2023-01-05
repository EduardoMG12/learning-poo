public class Person {
    private String name;
    private int years;
    private char sex;

    public void setName(String name) {
        this.name = name;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getYears() {
        return years;
    }

    public char getSex() {
        return sex;
    }

    public void haveBirthday(){
        setYears(getYears() + 1);
    }
    public Person(String name, int years, char sex) {
        this.name = name;
        this.years = years;
        this.sex = sex;
    }
}
