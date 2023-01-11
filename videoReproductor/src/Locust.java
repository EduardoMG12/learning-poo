public class Locust extends Person{
    private String login;
    private int watchingTotal;
    public void viewAMore(Video video){
        video.setViews(video.getViews() + 1.0);
    }

    public Locust(String name, int age, char sex, String login) {
        super(name, age, sex);
        this.login = login;
        this.watchingTotal = 0;
    }
}
