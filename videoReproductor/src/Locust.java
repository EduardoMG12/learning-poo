public class Locust extends Person{
    private String login;
    private int watchingTotal;
    public void viewAMore(Video video){
        video.setViews(video.getViews() + 1);
    }
}
