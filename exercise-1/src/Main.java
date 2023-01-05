public class Main {
    public static void main(String[] args) {
        var p = new Person[6];

        p[0] = new Person("Livia",20,'F');
        p[1] = new Person("Jeremias",35,'M');
        p[2] = new Person("Thiago",42,'M');
        p[3] = new Person("Arlinda",35,'F');
        p[4] = new Person("Roberto",44,'M');
        p[5] = new Person("Eduarda",18,'F');

        var b = new Book[3];

        b[0] = new Book("Design Pattern","Angelica Kubernetes",355,p[0]);
        b[1] = new Book("Clean Code","Geraldo Script",258,p[1]);
        b[2] = new Book("algorithm","Roberto Dioves",552,p[2]);

        b[0].leafThrough(115);
        System.out.println(b[0].details());
        System.out.println("--------------------------");
        b[0].open();
        System.out.println("--------------------------");
        System.out.println(b[0].details());
        b[0].leafThrough(115);
        System.out.println("--------------------------");
        System.out.println(b[0].details());
        System.out.println("--------------------------");
        b[0].nextPage();
        System.out.println("--------------------------");
        b[0].nextPage();
        System.out.println("--------------------------");
        b[0].backPage();
        System.out.println("--------------------------");
        System.out.println(b[0].getAuthor());
        System.out.println("--------------------------");
        System.out.println(b[0].details());

        System.out.println(b[1].details());
        System.out.println("--------------------------");
        b[1].open();
        System.out.println(b[1].details());
        b[1].leafThrough(115);
        System.out.println("--------------------------");
        System.out.println(b[1].details());
        System.out.println("--------------------------");
        b[1].nextPage();
        System.out.println("--------------------------");
        b[1].nextPage();
        System.out.println("--------------------------");
        b[1].backPage();
        System.out.println("--------------------------");
        System.out.println(b[1].getAuthor());
        System.out.println("--------------------------");
        System.out.println(b[1].details());
    }
}