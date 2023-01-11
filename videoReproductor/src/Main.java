public class Main {
    public static void main(String[] args){
        var video = new Video[3];
        video[0]=new Video("Amoeba saltitante");
        video[1]=new Video("Clean Archtecture");
        video[2]=new Video("SOLID");

        var locust = new Locust[3];
        locust[1]= new Locust("Eduarda",22,'F',"sla1234@hotmail.com");
        locust[0]= new Locust("Thiago", 15,'M',"sla123@hotmail.com");
        locust[2]=new Locust("Charles",20,'M',"sla123456@hotmail.com");

        var vizualization = new Visualization(locust[0],video[0]);
        var vizualization = new Visualization(locust[1],video[0]);
        var vizualization = new Visualization(locust[2],video[0]);

        System.out.println(vizualization.toString());
    }
}