package Phase2.AssisstedPractice.Projects.Seccond;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssumptionDemo {
	 @BeforeClass
	    public static void setUpClass() {
	        System.out.println("This method runs once before any test method in the class");
	    }

	    @Before
	    public void setUp() {
	        System.out.println("This method runs before each test method");
	    }

	    @Test
	    public void testWithAssumption() {
	        // Assume.assumeTrue: Skips the test if the assumption is false
	        Assume.assumeTrue(isEnvironmentReady());

	        System.out.println("Executing testWithAssumption");
	        // Your test logic goes here
	    }

	    @Test
	    public void testWithoutAssumption() {
	        System.out.println("Executing testWithoutAssumption");
	        // Your test logic goes here
	    }

	    @After
	    public void tearDown() {
	        System.out.println("This method runs after each test method");
	    }

	    @AfterClass
	    public static void tearDownClass() {
	        System.out.println("This method runs once after all test methods in the class");
	    }

	    private boolean isEnvironmentReady() {
	        // Simulating a condition for demonstration purposes
	        return true; // Replace with your actual condition
	    }

}
