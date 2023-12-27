package Phase2.AssisstedPractice.Projects.Seccond;

public class ArgumentConversionDemo {
	@ParameterizedTest
    @CsvSource({"1, 2, 3", "0, 0, 0", "-1, 1, 0", "10, -5, 5"})
    public void testAddition(int a, int b, int expectedSum) {
        int actualSum = MathUtils.add(a, b);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @ParameterizedTest
    @CsvSource({"1, true", "0, false", "-1, false", "10, true"})
    public void testIsPositive(int number, boolean expectedResult) {
        boolean actualResult = MathUtils.isPositive(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvSource({"1, ONE", "2, TWO", "3, THREE"})
    public void testNumberToEnumConversion(int number, NumberWord expectedEnum) {
        NumberWord actualEnum = MathUtils.convertNumberToEnum(number);

        Assertions.assertEquals(expectedEnum, actualEnum);
    }

    // Custom argument converter for converting String to NumberWord enum
    public static class NumberWordConverter extends TypedArgumentConverter<String, NumberWord> {

        public NumberWordConverter() {
            super(String.class, NumberWord.class);
        }

        @Override
        protected NumberWord convert(String source) throws ArgumentConversionException {
            return NumberWord.valueOf(source.toUpperCase());
        }
    }

    @ParameterizedTest
    @CsvSource({"one, 1", "two, 2", "three, 3"})
    public void testEnumToStringConversion(@ConvertWith(NumberWordConverter.class) NumberWord numberWord, int expectedNumber) {
        int actualNumber = MathUtils.convertEnumToNumber(numberWord);

        Assertions.assertEquals(expectedNumber, actualNumber);
    }
}

enum NumberWord {
    ONE, TWO, THREE
}

class MathUtils {

    static int add(int a, int b) {
        return a + b;
    }

    static boolean isPositive(int number) {
        return number > 0;
    }

    static NumberWord convertNumberToEnum(int number) {
        switch (number) {
            case 1:
                return NumberWord.ONE;
            case 2:
                return NumberWord.TWO;
            case 3:
                return NumberWord.THREE;
            default:
                throw new IllegalArgumentException("Unsupported number: " + number);
        }
    }

    static int convertEnumToNumber(NumberWord numberWord) {
        switch (numberWord) {
            case ONE:
                return 1;
            case TWO:
                return 2;
            case THREE:
                return 3;
            default:
                throw new IllegalArgumentException("Unsupported enum: " + numberWord);
        }
    }
}


