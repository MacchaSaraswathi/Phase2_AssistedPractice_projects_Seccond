package Phase2.AssisstedPractice.Projects.Seccond;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class LifecycleDemo {
	// Run once before any test methods in the class
    @BeforeClass
    public static void setUpClass() {
        System.out.println("BeforeClass: Setting up resources for the test class");
    }

    // Run once after all test methods in the class
    @AfterClass
    public static void tearDownClass() {
        System.out.println("AfterClass: Cleaning up resources for the test class");
    }

    // Run before each test method
    @Before
    public void setUp() {
        System.out.println("Before: Setting up resources for the test method");
    }

    // Run after each test method
    @After
    public void tearDown() {
        System.out.println("After: Cleaning up resources for the test method");
    }

    // Test method 1
    @Test
    public void testMethod1() {
        System.out.println("TestMethod1: Executing test method 1");
        // Your test logic goes here
    }

    // Test method 2
    @Test
    public void testMethod2() {
        System.out.println("TestMethod2: Executing test method 2");
        // Your test logic goes here
    }
}


