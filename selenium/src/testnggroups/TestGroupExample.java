package testnggroups;

import org.testng.annotations.Test;

public class TestGroupExample {
	 @Test(groups = { "a" })
	    public void testMethod1() {
	        System.out.println("Test method one belonging to group.");
	    }
	 
	    @Test
	    public void testMethod2() {
	        System.out.println("Test method two not belonging to group.");
	    }
	 
	    @Test(groups = { "a" })
	    public void testMethod3() {
	        System.out.println("Test method three belonging to group.");
	    }

}
