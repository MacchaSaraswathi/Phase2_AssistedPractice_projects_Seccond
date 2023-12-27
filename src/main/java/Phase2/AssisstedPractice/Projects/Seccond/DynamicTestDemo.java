package Phase2.AssisstedPractice.Projects.Seccond;

public class DynamicTestDemo {
	@TestFactory
    public Stream<DynamicTest> dynamicTests() {
        return Stream.of("Apple", "Banana", "Cherry")
                .map(fruit ->
                        DynamicTest.dynamicTest("Test for " + fruit, () -> {
                            // Your test logic goes here
                            System.out.println("Testing " + fruit);
                        })
                );
    }

    @TestFactory
    public Stream<DynamicTest> dynamicTestsUsingReporter(TestReporter testReporter) {
        return Stream.of("One", "Two", "Three")
                .map(number ->
                        DynamicTest.dynamicTest("Test with custom reporter for " + number, () -> {
                            // Your test logic goes here
                            System.out.println("Testing " + number);
                            testReporter.publishEntry("custom-report-key", "Tested with number: " + number);
                        })
                );
    }

    // Example of a dynamic test container
    @TestFactory
    public Stream<DynamicTest> dynamicTestContainer() {
        return Stream.of(
                DynamicContainer.dynamicContainer("Container 1",
                        Stream.of(
                                DynamicTest.dynamicTest("Test 1", () -> {
                                    // Your test logic goes here
                                    System.out.println("Container 1 - Test 1");
                                }),
                                DynamicTest.dynamicTest("Test 2", () -> {
                                    // Your test logic goes here
                                    System.out.println("Container 1 - Test 2");
                                })
                        )
                ),
                DynamicContainer.dynamicContainer("Container 2",
                        Stream.of(
                                DynamicTest.dynamicTest("Test 3", () -> {
                                    // Your test logic goes here
                                    System.out.println("Container 2 - Test 3");
                                })
                        )
                )
        );
    }
}

