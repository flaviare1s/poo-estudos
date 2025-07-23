package herancaEpolimorfismo01;

public final class Salesman extends Employee {
    private double percentPerSold;
    private double soldAmount;

    public double getSoldAmount() {
        return soldAmount;
    }

    public void setSoldAmount(double soldAmount) {
        this.soldAmount = soldAmount;
    }

    public double getPercentPerSold() {
        return percentPerSold;
    }

    public Salesman() {

    }

    public Salesman(String code, String name, String address, int age, double salary, double percentPerSold, double soldAmount) {
        super(code, name, address, age, salary);
        this.percentPerSold = percentPerSold;
        this.soldAmount = soldAmount;
    }

    public void setPercentPerSold(double percentPerSold) {
        this.percentPerSold = percentPerSold;
    }

    @Override
    public String getCode() {
        return "SL" + super.getCode();
    }

    @Override
    public double getFullSalary() {
        return this.salary + (percentPerSold * soldAmount);
    }
}
