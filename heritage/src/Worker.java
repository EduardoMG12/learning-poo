public class Worker extends Person{
    private String sector;
    private boolean working;

    public void worker(){
        setWorking(!isWorking());
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public void setWorking(boolean worker) {
        this.working = worker;
    }

    public String getSector() {
        return sector;
    }

    public boolean isWorking() {
        return working;
    }
}
