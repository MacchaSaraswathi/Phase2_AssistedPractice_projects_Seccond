package Phase2.AssisstedPractice.Projects.Seccond;

import org.testng.annotations.Test;

public class ExtensionPoints {
	// Custom extension class implementing Extension interface
	class CustomExtension implements org.junit.jupiter.api.extension.Extension {

	    public void beforeTestExecution(String testName) {
	        System.out.println("Before test execution: " + testName);
	    }

	    public void afterTestExecution(String testName) {
	        System.out.println("After test execution: " + testName);
	    }
	}

	// Test class using the custom extension
	@ExtendWith(CustomExtension.class)
	public class ExtensionDemo {

	    @Test
	    public void testOne() {
	        System.out.println("Executing Test One");
	    }

	    @Test
	    public void testTwo() {
	        System.out.println("Executing Test Two");
	    }
	}


