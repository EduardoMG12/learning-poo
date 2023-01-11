public class Video implements IVideo {

    private String title;
    private String avaliation;
    private double views;
    private double likes;
    private boolean playing;
    public Video(String title) {
        this.title = title;
        setAvaliation();
        this.views = 0.0;
        this.likes = 0.0;
        this.playing = false;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAvaliation() {
        this.avaliation = averageAvaliation();
    }

    public String averageAvaliation(){
        String averageString;
        double average = getLikes() / getViews();
        if (average < 1.0) averageString = "very good review";
        else if (average < 1.0) averageString = "good review";
        else if (average < 0.5) averageString =  "median";
        else if (average < 0.3) averageString = "bad";
        else averageString = "very bad";

        return averageString;
    }


    public void setViews(double views) {
        this.views = views;
    }

    public void setLikes(double likes) {
        this.likes = likes;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public String getTitle() {
        return title;
    }

    public String getAvaliation() {
        return avaliation;
    }

    public double getViews() {
        return views;
    }

    public double getLikes() {
        return likes;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void play() {
        if (!isPlaying()) System.out.println("the video started to play");
        else System.out.println("the video cannot be played");
    }
    public void pause() {
        if (isPlaying()) System.out.println("now the video is stopped");
        else System.out.println("the video cannot be stopped");
    }
    public void like() {
        setLikes(getLikes() + 1.0);
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", avaliation='" + avaliation + '\'' +
                ", views=" + views +
                ", likes=" + likes +
                ", playing=" + playing +
                '}';
    }
}
