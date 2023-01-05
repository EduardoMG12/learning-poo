public class Student extends Person{
    private boolean registration;
    private String course;

    public void cancelRegistration(){
        if (isRegistration() == true){
            setRegistration(false);
            System.out.println("registration canceled successfully");
        }else{
            System.out.println("is not yet registered");
        }
    }

    public boolean isRegistration() {
        return registration;
    }

    public String getCourse() {
        return course;
    }

    public void setRegistration(boolean registration) {
        this.registration = registration;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
