public class Teacher extends Person{
    private String speciality;
    private int wage;

    public void receiveRaise(int valueRaise){
        setWage(getWage() + valueRaise);
    }
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public String getSpeciality() {
        return speciality;
    }

    public int getWage() {
        return wage;
    }
}
