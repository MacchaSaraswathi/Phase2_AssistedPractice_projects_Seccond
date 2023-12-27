package Phase2.AssisstedPractice.Projects.Seccond;

import org.testng.annotations.Test;

public class TestInterfaceandMethods {
	// Test interface with default methods
	interface CommonTests {

	    @Test
	    default void commonTest1() {
	        System.out.println("Common Test 1");
	        // Your test logic goes here
	    }

	    @Test
	    default void commonTest2() {
	        System.out.println("Common Test 2");
	        // Your test logic goes here
	    }
	}

	// Test class implementing the test interface
	class TestClass1 implements CommonTests {

	    @Test
	    void specificTest1() {
	        System.out.println("Specific Test 1");
	        // Your test logic goes here
	    }

	    @Test
	    void specificTest2() {
	        System.out.println("Specific Test 2");
	        // Your test logic goes here
	    }
	}

	// Another test class implementing the same test interface
	class TestClass2 implements CommonTests {

	    @Test
	    void specificTest3() {
	        System.out.println("Specific Test 3");
	        // Your test logic goes here
	    }

	    @Test
	    void specificTest4() {
	        System.out.println("Specific Test 4");
	        // Your test logic goes here
	    }
	}

	public class TestInterfaceDemo {

	    public static void main(String[] args) {
	        // Run tests for TestClass1
	        org.junit.platform.launcher.JUnitLauncher.main(TestClass1.class.getName());

	        // Run tests for TestClass2
	        org.junit.platform.launcher.JUnitLauncher.main(TestClass2.class.getName());
	    }
	}


