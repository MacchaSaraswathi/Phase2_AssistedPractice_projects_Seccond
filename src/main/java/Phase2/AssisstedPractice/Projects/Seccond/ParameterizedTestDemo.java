package Phase2.AssisstedPractice.Projects.Seccond;

public class ParameterizedTestDemo {
	// Parameterized test with a single value source
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    public void testSquare(int value) {
        int expectedResult = value * value;
        int actualResult = MathUtils.square(value);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    // Parameterized test with multiple value sources
    @ParameterizedTest
    @CsvSource({"2, 4", "3, 9", "4, 16", "5, 25"})
    public void testCube(int value, int expectedCube) {
        int actualCube = MathUtils.cube(value);

        Assertions.assertEquals(expectedCube, actualCube);
    }
}


