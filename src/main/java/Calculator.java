import java.util.stream.DoubleStream;

public class Calculator {

    static double add(double... operands) {
        return 0; //DoubleStream.of(operands).sum();
    }

    static double multiply(double... operands) {
        return 0; //DoubleStream.of(operands).reduce(1, (a, b) -> a * b);
    }
}