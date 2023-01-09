public class Scholar extends Student{
    private int scholarship;

    public Scholar(String name, int age, char sex, int registration, String course, int scholarship) {
        super(name, age, sex, registration, course);
        this.scholarship = scholarship;
    }

    public void renewScholarship(){}

    @Override
    public void monthlyPayment(){}

    public void setScholarship(int scholarship) {
        this.scholarship = scholarship;
    }

    public int getScholarship() {
        return scholarship;
    }
}
