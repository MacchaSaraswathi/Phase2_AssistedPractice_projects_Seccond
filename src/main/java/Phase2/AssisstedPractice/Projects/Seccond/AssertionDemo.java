package Phase2.AssisstedPractice.Projects.Seccond;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
	 @Test
	    public void testEquality() {
	        int expected = 42;
	        int actual = 42;

	        // assertEquals: checks that the expected and actual values are equal
	        Assert.assertEquals(expected, actual);
	    }

	    @Test
	    public void testArrayEquality() {
	        int[] expectedArray = {1, 2, 3, 4};
	        int[] actualArray = {1, 2, 3, 4};

	        // assertArrayEquals: checks that the expected and actual arrays are equal
	        Assert.assertArrayEquals(expectedArray, actualArray);
	    }

	    @Test
	    public void testNotNull() {
	        Object object = new Object();

	        // assertNotNull: checks that the object is not null
	        Assert.assertNotNull(object);
	    }

	    @Test
	    public void testTrue() {
	        boolean condition = true;

	        // assertTrue: checks that the condition is true
	        Assert.assertTrue(condition);
	    }

	    @Test
	    public void testFalse() {
	        boolean condition = false;

	        // assertFalse: checks that the condition is false
	        Assert.assertFalse(condition);
	    }

	    @Test
	    public void testNull() {
	        Object object = null;

	        // assertNull: checks that the object is null
	        Assert.assertNull(object);
	    }

	    @Test
	    public void testFail() {
	        // fail: forces a test to fail with a custom message
	        Assert.fail("This test intentionally fails");
	    }
	}


