package seminars.first.Calculator;

class CalculatorTest {
    Calculator calculator;

    // В testCalculateDiscountWithValidArguments сумма покупки равна 100, процент
    // скидки равен 20
    // c помощью AssertJ проверяется, что полученная сумма скидки равна 80

    @Test
    public void testCalculateDiscountWithValidArguments() {
        double amount = 100.0;
        double discount = 20.0;

        Calculator calculator = new Calculator();
        double discountedAmount = calculator.calculateDiscount(amount, discount);

        Assertions.assertThat(discountedAmount).isEqualTo(80.0);
    }
    // В testCalculateDiscountWithInvalidArguments сумма покупки равна -100, что
    // является недопустимым,
    // и с помощью @Test(expected = ArithmeticException.class) проверяется, что
    // метод действительно выбрасывает исключение ArithmeticException.

    @Test(expected = ArithmeticException.class)
    public void testCalculateDiscountWithInvalidArguments() {
        double amount = -100.0;
        double discount = 20.0;

        Calculator calculator = new Calculator();
        calculator.calculateDiscount(amount, discount);
    }
}
