package exercicio_interfaces;

public record Square(double side) implements GeometricForm {
    @Override
    public double getArea() {
        return side * side;
    }
}
