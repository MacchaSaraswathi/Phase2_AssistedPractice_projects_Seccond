package Phase2.AssisstedPractice.Projects.Seccond;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.testng.annotations.Test;

public class Meta_Annotations {
	// Custom annotation with meta-annotations
	@Target({ElementType.TYPE, ElementType.METHOD})
	@Retention(RetentionPolicy.RUNTIME)
	@ExtendWith(MyExtension.class)
	public @interface MyTestAnnotation {
	}

	// Custom extension class implementing Extension interface
	class MyExtension implements org.junit.jupiter.api.extension.Extension {

	    public void beforeTestExecution(String testName) {
	        System.out.println("Before test execution: " + testName);
	    }

	    public void afterTestExecution(String testName) {
	        System.out.println("After test execution: " + testName);
	    }
	}

	// Test class using the custom composed annotation
	@MyTestAnnotation
	public class MetaAnnotationDemo {

	    @Test
	    public void testOne() {
	        System.out.println("Executing Test One");
	    }

	    @Test
	    public void testTwo() {
	        System.out.println("Executing Test Two");
	    }
	}

}
