package herancaEpolimorfismo01;

public non-sealed class Manager extends Employee {
    private String login;
    private String password;

    public Manager() {

    }

    public Manager(String code, String name, String address, int age, double salary, String login, double commission, String password) {
        super(code, name, address, age, salary);
        this.login = login;
        this.commission = commission;
        this.password = password;
    }

    private double commission;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String getCode() {
        return "MG" + super.getCode();
    }

    @Override
    public double getFullSalary() {
        return commission + this.salary;
    }
}
