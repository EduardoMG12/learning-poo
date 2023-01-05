public class Main {
    public static void main(String[] args) {
        var person = new Person();
        var student = new Student();
        var teacher = new Teacher();
        var worker = new Worker();
        person.setName("Thiago");
        person.setAge(19);
        person.setSex('M');

        student.setName("Arlinda");
        student.setAge(29);
        student.setSex('F');

        teacher.setName("Joremias");
        teacher.setAge(23);
        teacher.setSex('M');

        worker.setName("Joanilda");
        worker.setAge(19);
        worker.setSex('F');

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(teacher.toString());
        System.out.println(worker.toString());
    }
}