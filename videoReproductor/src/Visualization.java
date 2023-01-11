public class Visualization {
    Locust viewer;
    Video movie;

    public Visualization(Locust viewer, Video movie) {
        this.viewer = viewer;
        this.movie = movie;
        this.movie.setViews(this.movie.getViews() + 1);
    }

    public void avaliation(){
        movie.setAvaliation();
    }

    @Override
    public String toString() {
        return "Visualization{" +
                "viewer=" + viewer +
                ", movie=" + movie +
                '}';
    }
}
