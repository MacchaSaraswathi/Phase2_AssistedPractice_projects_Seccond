package Phase2.AssisstedPractice.Projects.Seccond;

import org.testng.annotations.Test;

public class ExcludedAndIncluded {
	 @Test
	    @Tag("fast")
	    public void fastTest() {
	        System.out.println("Executing Fast Test");
	    }

	    @Test
	    @Tag("slow")
	    public void slowTest() {
	        System.out.println("Executing Slow Test");
	    }

	    @Test
	    @Tag("integration")
	    public void integrationTest() {
	        System.out.println("Executing Integration Test");
	    }

}
