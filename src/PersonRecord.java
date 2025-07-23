public record PersonRecord(String name, int age) {

    public PersonRecord(String name) {
        this(name, 21);
    }

    public String getInfo() {
        return "Nome: " + name + ", idade: " + age + " anos.";
    }
}
