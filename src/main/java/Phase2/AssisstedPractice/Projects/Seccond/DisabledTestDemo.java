package Phase2.AssisstedPractice.Projects.Seccond;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class DisabledTestDemo {
	 @Test
	    public void testEnabled() {
	        System.out.println("This test is enabled and will run");
	        // Your test logic goes here
	    }

	    @Ignore("This test is disabled for a specific reason")
	    @Test
	    public void testDisabled() {
	        System.out.println("This test is disabled and won't run");
	        // Your test logic goes here (won't be executed)
	    }

	    @Test
	    @Ignore // You can also disable a test without providing a reason
	    public void anotherTestDisabled() {
	        System.out.println("This test is also disabled and won't run");
	        // Your test logic goes here (won't be executed)
	    }

}
