public class Worker extends Person{
    private String sector;
    private boolean worker;

    public void changedWork(){

    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public void setWorker(boolean worker) {
        this.worker = worker;
    }

    public String getSector() {
        return sector;
    }

    public boolean isWorker() {
        return worker;
    }
}
