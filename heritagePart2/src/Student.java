public class Student extends Person{
    private int registration;
    private String course;

    public Student(String name, int age, char sex, int registration, String course) {
        super(name, age, sex);
        this.registration = registration;
        this.course = course;
    }
    public void monthlyPayment(){
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getRegistration() {
        return registration;
    }

    public String getCourse() {
        return course;
    }
}
