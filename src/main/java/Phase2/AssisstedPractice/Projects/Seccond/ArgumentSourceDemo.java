package Phase2.AssisstedPractice.Projects.Seccond;

import java.util.stream.Stream;

import org.asynchttpclient.util.Assertions;
import org.testng.internal.invokers.Arguments;

public class ArgumentSourceDemo {
	// Parameterized test with a single value source
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    public void testSquare(int value) {
        int expectedResult = value * value;
        int actualResult = MathUtils.square(value);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    // Parameterized test with an enum source
    @ParameterizedTest
    @EnumSource(value = MathOperation.class, names = {"ADD", "SUBTRACT"})
    public void testMathOperation(MathOperation operation) {
        int result = operation.calculate(5, 3);

        Assertions.assertNotEquals(0, result);
    }

    // Parameterized test with a method source
    @ParameterizedTest
    @MethodSource("provideTestParameters")
    public void testAddition(int a, int b, int expectedSum) {
        int actualSum = MathUtils.add(a, b);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    // Method to provide parameters for the testAddition method
    private static Stream<Arguments> provideTestParameters() {
        return Stream.of(
                Arguments.of(1, 2, 3),
                Arguments.of(0, 0, 0),
                Arguments.of(-1, 1, 0),
                Arguments.of(10, -5, 5)
        );
    }
}

enum MathOperation {
    ADD {
        public int calculate(int a, int b) {
            return a + b;
        }
    },
    SUBTRACT {
        public int calculate(int a, int b) {
            return a - b;
        }
    };

    public abstract int calculate(int a, int b);
}

class MathUtils {
    static int square(int value) {
        return value * value;
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int cube(int value) {
        return value * value * value;
    }
}


