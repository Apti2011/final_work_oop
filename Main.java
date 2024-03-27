public class Main {

    public static void main(String[] args) {

        ComplexNumber iNumber = new ComplexNumber(1, 2);

        ComplexNumber jNumber = new ComplexNumber(3, 4);

        Calculator.add(iNumber, jNumber);

        Calculator.multiply(iNumber, jNumber);

        Calculator.divide(iNumber, jNumber);

    }

}
