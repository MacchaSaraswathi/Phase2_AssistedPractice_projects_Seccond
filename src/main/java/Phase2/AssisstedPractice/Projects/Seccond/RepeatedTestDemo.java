package Phase2.AssisstedPractice.Projects.Seccond;

public class RepeatedTestDemo {
	// This test will be repeated 3 times
    @RepeatedTest(3)
    public void repeatedTest() {
        System.out.println("Executing repeatedTest");
        // Your test logic goes here
    }

    // This test will be repeated 5 times with dynamic display of repetition information
    @RepeatedTest(5)
    public void repeatedTestWithInfo(RepetitionInfo repetitionInfo) {
        System.out.println("Executing repeatedTestWithInfo, repetition " +
                repetitionInfo.getCurrentRepetition() + " of " +
                repetitionInfo.getTotalRepetitions());
        // Your test logic goes here
    }

}
