import java.lang.System.Logger;
import java.util.logging.LogManager;

public class Calculator {

    private static final Logger logger = LogManager.getLogger();

    public static ComplexNumber add(ComplexNumber iNumber, ComplexNumber jNumber) {

        logger.info("Добавление комплексных чисел {} и {}", iNumber, jNumber);

        ComplexNumber sum = iNumber.add(jNumber);

        logger.info("Результат: {}", sum);

        return sum;

    }

    public static ComplexNumber multiply(ComplexNumber iNumber, ComplexNumber jNumber) {

        logger.info("Умножение комплексных чисел {} и {}", iNumber, jNumber);

        ComplexNumber product = iNumber.multiply(jNumber);

        logger.info("Результат:", product);

        return product;

    }

    public static ComplexNumber divide(ComplexNumber iNumber, ComplexNumber jNumber) {

        if (jNumber.getRealPart() == 0 && jNumber.getImaginaryPart() == 0) {

            throw new IllegalArgumentException("Невозможно разделить на ноль");

        }

        logger.info("Деление комплексных чисел {} и {}", iNumber, jNumber);

        ComplexNumber quotient = iNumber.divide(jNumber);

        logger.info("Результат: {}", quotient);

        return quotient;

    }

}
