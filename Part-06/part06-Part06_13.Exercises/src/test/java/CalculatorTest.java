
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void calculatorInitialValueZero() {
        Calculator calc = new Calculator();
        Assert.assertEquals(0, calc.getValue());
    }

    @Test
    public void valueFiveWhenFiveAdded() {
        Calculator calculator = new Calculator();
        calculator.add(5);
        Assert.assertEquals(5, calculator.getValue());
    }

    @Test
    public void valueMinusTwoWhenTwoSubstracted() {
        Calculator calculator = new Calculator();
        calculator.subtract(2);
        Assert.assertEquals(-2, calculator.getValue());
    }

}
