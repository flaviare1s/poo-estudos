package herancaEpolimorfismo01;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Employee manager2 = new Manager();
        Employee salesman = new Salesman();
        printEmployee(manager2);
        printEmployee(salesman);

        manager.setName("João");
        manager.setLogin("João");
        manager.setPassword("123456");

        System.out.println(manager.getName());
        System.out.println(manager.getPassword());
        System.out.println("=======================");
    }

    public static void printEmployee(Employee employee) {

        switch (employee) {
            case Manager manager -> {
                employee.setCode("123");
                employee.setName("Maria");
                manager.setLogin("Maria");
                manager.setPassword("123456");
                manager.setSalary(2000);
                manager.setCommission(180);
                System.out.println(employee.getCode());
                System.out.println(employee.getName());
                System.out.println(manager.getLogin());
                System.out.println(manager.getPassword());
                System.out.println(manager.getFullSalary());
                System.out.println("=======================");
            }
            case Salesman salesman -> {
                employee.setCode("1234");
                employee.setName("Ana");
                salesman.setSalary(1000);
                salesman.setPercentPerSold(10);
                salesman.setSoldAmount(10);
                System.out.println(employee.getCode());
                System.out.println(employee.getName());
                System.out.println(salesman.getPercentPerSold());
                System.out.println(salesman.getFullSalary());
                System.out.println("=======================");
            }
        }
    }


}
