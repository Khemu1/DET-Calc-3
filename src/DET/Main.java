package DET;

public class Main {
    public static void main(String[] args) {
        
        CalculatorWithMemory calculatorWithMemory = new CalculatorWithMemory();
        calculatorWithMemory.add(5);
        calculatorWithMemory.multiply(3);
        calculatorWithMemory.save();

        System.out.println("Current Accumulator Value: " + calculatorWithMemory.accumulator);

        calculatorWithMemory.recall();
        System.out.println("Recalled Value: " + calculatorWithMemory.accumulator);

        calculatorWithMemory.clearMemory();
        System.out.println("Memory after clearing: " + calculatorWithMemory.getMemory());
    }
}
