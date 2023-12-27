package Phase2.AssisstedPractice.Projects.Seccond;

import org.testng.annotations.Test;

public class CodeCoverage {
	 @Test
	    public void testAdd() {
	        Calculator calculator = new Calculator();
	        int result = calculator.add(2, 3);
	        assertEquals(5, result);
	    }

	    @Test
	    public void testSubtract() {
	        Calculator calculator = new Calculator();
	        int result = calculator.subtract(5, 3);
	        assertEquals(2, result);
	    }

}
