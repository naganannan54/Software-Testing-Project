import java.util.stream.DoubleStream;

public class Calculator {

    public double add(double... operands) {
        return DoubleStream.of(operands).sum();
    }

    public double multiply(double... operands) {
        return DoubleStream.of(operands).reduce(1, (a, b) -> a * b);
    }
}