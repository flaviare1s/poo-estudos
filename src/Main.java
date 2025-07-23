import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var male = new Person();
        male.setName("João");
        male.setAge(12);
        var female = new Person();
        female.setName("Maria");
        female.setAge(10);
        System.out.println(male.getName());
        System.out.println(female.getName());

        var person = new PersonRecord("José");
        System.out.println(person);
        System.out.println(person.name());
        System.out.println(person.getInfo());
    }
}
