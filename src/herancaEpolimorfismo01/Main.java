package herancaEpolimorfismo01;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Employee manager2 = new Manager();
        Employee salesman = new Salesman();

        manager.setName("João");
        manager.setLogin("João");
        manager.setPassword("123456");

        System.out.println(manager.getName());
        System.out.println(manager.getPassword());
    }
}
