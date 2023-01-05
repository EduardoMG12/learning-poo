public class Main {
    public static void main(String[] args) {
        var person = new Person[6];

        person[0] = new Person("Livia",20,'F');
        person[1] = new Person("Jeremias",35,'M');
        person[2] = new Person("Thiago",42,'M');
        person[3] = new Person("Arlinda",35,'F');
        person[4] = new Person("Roberto",44,'M');
        person[5] = new Person("Eduarda",18,'F');

        var book = new Book[3];

        book[0] = new Book("Design Pattern","Angelica Kubernetes",355,person[0]);
        book[1] = new Book("Clean Code","Geraldo Script",258,person[1]);
        book[2] = new Book("algorithm","Roberto Dioves",552,person[2]);

        book[0].leafThrough(115);
        System.out.println(book[0].details());
        System.out.println("--------------------------");
        book[0].open();
        System.out.println("--------------------------");
        System.out.println(book[0].details());
        book[0].leafThrough(115);
        System.out.println("--------------------------");
        System.out.println(book[0].details());
        System.out.println("--------------------------");
        book[0].nextPage();
        System.out.println("--------------------------");
        book[0].nextPage();
        System.out.println("--------------------------");
        book[0].backPage();
        System.out.println("--------------------------");
        System.out.println(book[0].getAuthor());
        System.out.println("--------------------------");
        System.out.println(book[0].details());

        System.out.println(book[1].details());
        System.out.println("--------------------------");
        book[1].open();
        System.out.println(book[1].details());
        book[1].leafThrough(115);
        System.out.println("--------------------------");
        System.out.println(book[1].details());
        System.out.println("--------------------------");
        book[1].nextPage();
        System.out.println("--------------------------");
        book[1].nextPage();
        System.out.println("--------------------------");
        book[1].backPage();
        System.out.println("--------------------------");
        System.out.println(book[1].getAuthor());
        System.out.println("--------------------------");
        System.out.println(book[1].details());
    }
}