public class Main {
    public static void main(String[] args) {
        var pencil = new Pencil("bic", "blue" , 1);
        pencil.pencilReview();
        System.out.println(pencil.tampar("destampar"));
        System.out.println(pencil.tampar("destampar"));
        System.out.println(pencil.tampar("tampar"));
        System.out.println(pencil.tampar("destampar"));
        pencil.rabiscar("aopaaaa");
        pencil.pencilReview();
        System.out.println(pencil.tampar("tampar"));
        System.out.println(pencil.tampar("tampar"));
        pencil.rabiscar(" aopaaaa");
        pencil.pencilReview();

    }
}